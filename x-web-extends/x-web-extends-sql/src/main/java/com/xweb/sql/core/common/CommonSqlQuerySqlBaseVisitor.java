package com.xweb.sql.core.common;

import com.xweb.sql.core.common.delete.SimpleDelete;
import com.xweb.sql.core.common.expression.BetweenAndExpression;
import com.xweb.sql.core.common.expression.CommonConditionExpression;
import com.xweb.sql.core.common.expression.ConcatenationExpression;
import com.xweb.sql.core.common.expression.ExistExpression;
import com.xweb.sql.core.common.expression.InExpression;
import com.xweb.sql.core.common.expression.IsNullExpression;
import com.xweb.sql.core.common.expression.LikeExpression;
import com.xweb.sql.core.common.expression.NotBooleanExpression;
import com.xweb.sql.core.common.expression.PriorityExpression;
import com.xweb.sql.core.common.expression.ArithmeticExpression;
import com.xweb.sql.core.common.insert.AsQueryInsert;
import com.xweb.sql.core.common.insert.OnDuplicateInsert;
import com.xweb.sql.core.common.insert.SimpleInsert;
import com.xweb.sql.core.common.item.CaseItem;
import com.xweb.sql.core.common.item.ConstantItem;
import com.xweb.sql.core.common.item.FunctionCallItem;
import com.xweb.sql.core.common.item.SelectAllItem;
import com.xweb.sql.core.common.item.SubIndexItem;
import com.xweb.sql.core.common.item.TableColumnItem;
import com.xweb.sql.core.common.item.UnionSelectItem;
import com.xweb.sql.core.common.item.WhenThenItem;
import com.xweb.sql.core.common.order.DefaultOrderItem;
import com.xweb.sql.core.common.order.OrderItem;
import com.xweb.sql.core.common.select.BaseSelect;
import com.xweb.sql.core.common.select.UnionSelect;
import com.xweb.sql.core.common.table.SimpleTable;
import com.xweb.sql.core.common.table.UnionTableTable;
import com.xweb.sql.core.parser.QuerySqlBaseBaseVisitor;
import com.xweb.sql.core.parser.QuerySqlBaseParser;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import lombok.Getter;

@Getter
public class CommonSqlQuerySqlBaseVisitor extends QuerySqlBaseBaseVisitor {

    @Override
    public Object visitStatementDefault(QuerySqlBaseParser.StatementDefaultContext ctx) {
        return super.visitStatementDefault(ctx);
    }

    @Override
    public Object visitInsertIntoDefault(QuerySqlBaseParser.InsertIntoDefaultContext ctx) {
        SimpleInsert simpleInsert = new SimpleInsert();
        simpleInsert.setInsert(ctx.INSERT().getText());
        simpleInsert.setInto(ctx.INTO().getText());
        simpleInsert.setTable(ctx.qualifiedName().getText());
        if (Optional.ofNullable(ctx.columnAliases()).isPresent()) {
            simpleInsert.setColumns((List) super.visit(ctx.columnAliases()));
        }
        if (Optional.ofNullable(ctx.valueAliases()).isPresent()) {
            simpleInsert.setValueItems((List) super.visit(ctx.valueAliases()));
        }
        simpleInsert.setValues(ctx.VALUES().getText());
        if (Optional.ofNullable(ctx.onDuplicateCondition()).isPresent()) {
            OnDuplicateInsert onDuplicateInsert = new OnDuplicateInsert();
            onDuplicateInsert.setInsert(simpleInsert);
            final QuerySqlBaseParser.OnDuplicateConditionContext onDuplicateConditionContext = ctx.onDuplicateCondition();
            onDuplicateInsert.setOn(onDuplicateConditionContext.ON().getText());
            onDuplicateInsert.setDuplicate(onDuplicateConditionContext.DUPLICATE().getText());
            onDuplicateInsert.setKey(onDuplicateConditionContext.KEY().getText());
            onDuplicateInsert.setUpdate(onDuplicateConditionContext.UPDATE().getText());
            onDuplicateInsert.setUpdateColumns(new ArrayList<>());
            final List<QuerySqlBaseParser.ExpressionContext> expressions = onDuplicateConditionContext.expression();
            for (QuerySqlBaseParser.ExpressionContext expression : expressions) {
                onDuplicateInsert.getUpdateColumns().add((Item) super.visit(expression));
            }
            return onDuplicateInsert;
        }
        return simpleInsert;
    }

    @Override
    public Object visitColumnAliases(QuerySqlBaseParser.ColumnAliasesContext ctx) {
        List<Item> items = new ArrayList<>();
        final List<QuerySqlBaseParser.IdentifierContext> identifiers = ctx.identifier();
        for (QuerySqlBaseParser.IdentifierContext identifier : identifiers) {
            items.add((Item) super.visit(identifier));
        }
        return items;
    }

    @Override
    public Object visitValueAliases(QuerySqlBaseParser.ValueAliasesContext ctx) {
        List<Item> items = new ArrayList<>();
        final List<QuerySqlBaseParser.ExpressionContext> expressions = ctx.expression();
        for (QuerySqlBaseParser.ExpressionContext expression : expressions) {
            items.add((Item) super.visit(expression));
        }
        return items;
    }

    @Override
    public Object visitInsertIntoAsQuery(QuerySqlBaseParser.InsertIntoAsQueryContext ctx) {
        AsQueryInsert asQueryInsert = new AsQueryInsert();
        asQueryInsert.setInsert(ctx.INSERT().getText());
        asQueryInsert.setInto(ctx.INTO().getText());
        asQueryInsert.setTable(ctx.qualifiedName().getText());
        if (Optional.ofNullable(ctx.columnAliases()).isPresent()) {
            asQueryInsert.setColumns((List) super.visit(ctx.columnAliases()));
        }
        asQueryInsert.setQuery((Select) super.visit(ctx.query()));
        return asQueryInsert;
    }

    @Override
    public Object visitDeleteDefault(QuerySqlBaseParser.DeleteDefaultContext ctx) {
        SimpleDelete simpleDelete = new SimpleDelete();
        simpleDelete.setDelete(ctx.DELETE().getText());
        simpleDelete.setFrom(ctx.FROM().getText());
        simpleDelete.setTable(ctx.qualifiedName().getText());
        if (Optional.ofNullable(ctx.WHERE()).isPresent()) {
            simpleDelete.setWhere(ctx.WHERE().getText());
        }
        if (Optional.ofNullable(ctx.booleanExpression()).isPresent()) {
            simpleDelete.setWhereExpression((BooleanExpression) super.visit(ctx.booleanExpression()));
        }
        return simpleDelete;
    }

    @Override
    public Object visitQuery(QuerySqlBaseParser.QueryContext ctx) {
        Object result = super.visit(ctx.queryItem());
        if (result instanceof BaseSelect) {
            if (!ctx.unionExpress().isEmpty()) {
                BaseSelect select = (BaseSelect) result;
                UnionSelect unionSelect = new UnionSelect();
                unionSelect.setSelect(select);
                unionSelect.setUnionSelectItems(new ArrayList<>());
                final List<QuerySqlBaseParser.UnionExpressContext> unionExpressContexts = ctx.unionExpress();
                for (QuerySqlBaseParser.UnionExpressContext unionExpressContext : unionExpressContexts) {
                    unionSelect.getUnionSelectItems().add((UnionSelectItem) super.visit(unionExpressContext));
                }
                return unionSelect;
            }
        }
        return result;
    }

    @Override
    public Object visitUnionExpress(QuerySqlBaseParser.UnionExpressContext ctx) {
        UnionSelectItem unionSelectItem = new UnionSelectItem();
        unionSelectItem.setUnion(ctx.UNION().getText());
        if (Optional.ofNullable(ctx.setQuantifier()).isPresent()) {
            unionSelectItem.setAll(ctx.setQuantifier().getText());
        }
        unionSelectItem.setSelect((Item) super.visit(ctx.queryItem()));
        return unionSelectItem;
    }

    @Override
    public Object visitSubPriorityQueryExpression(QuerySqlBaseParser.SubPriorityQueryExpressionContext ctx) {
        Object result = super.visit(ctx.query());
        return new PriorityExpression(result);
    }

    @Override
    public Object visitSubQueryExpression(QuerySqlBaseParser.SubQueryExpressionContext ctx) {
        Object result = super.visitSubQueryExpression(ctx);
        return result;
    }

    @Override
    public Object visitSubQueryTableExpress(QuerySqlBaseParser.SubQueryTableExpressContext ctx) {
        Object result = super.visit(ctx.query());
        return new PriorityExpression(result);
    }

    @Override
    public Object visitSubTableExpressionExpress(QuerySqlBaseParser.SubTableExpressionExpressContext ctx) {
        Object result = super.visit(ctx.tableExpression());
        return new PriorityExpression(result);
    }

    @Override
    public Object visitUnionSelectTableExpress(QuerySqlBaseParser.UnionSelectTableExpressContext ctx) {
        UnionTableTable unionTableTable = new UnionTableTable();
        Object left = super.visit(ctx.tableExpression());
        unionTableTable.setLeft((Item) left);
        final List<QuerySqlBaseParser.UnionTableExpressContext> unionTableExpressContexts = ctx.unionTableExpress();
        unionTableTable.setUnionTableItems(new ArrayList<>());
        for (QuerySqlBaseParser.UnionTableExpressContext unionTableExpressContext : unionTableExpressContexts) {
            unionTableTable.getUnionTableItems().add((UnionTableTable.UnionTableItem) super.visit(unionTableExpressContext));
        }
        return new PriorityExpression(unionTableTable);
    }

    @Override
    public Object visitUnionTableExpress(QuerySqlBaseParser.UnionTableExpressContext ctx) {
        UnionTableTable.UnionTableItem unionTableItem = new UnionTableTable.UnionTableItem();
        unionTableItem.setUnion(ctx.UNION().getText());
        if (Optional.ofNullable(ctx.setQuantifier()).isPresent()) {
            unionTableItem.setAll(ctx.setQuantifier().getText());
        }
        unionTableItem.setRight((Item) super.visit(ctx.tableExpressPrimary()));
        return unionTableItem;
    }

    @Override
    public Object visitQueryItem(QuerySqlBaseParser.QueryItemContext ctx) {
        Object result = super.visitQueryItem(ctx);
        return result;
    }

    @Override
    public Object visitOrderByExpression(QuerySqlBaseParser.OrderByExpressionContext ctx) {
        Object result = super.visit(ctx.expression());
        if (result instanceof ConstantItem) {
            DefaultOrderItem defaultOrderItem = new DefaultOrderItem();
            defaultOrderItem.setItem((Item) result);
            return defaultOrderItem;
        }
        return result;
    }

    @Override
    public Object visitQueryPrimary(QuerySqlBaseParser.QueryPrimaryContext ctx) {
        BaseSelect select = new BaseSelect();
        select.setSelect(ctx.SELECT().getText());
        final List<QuerySqlBaseParser.SelectItemContext> selectItemContexts = ctx.selectItem();
        for (QuerySqlBaseParser.SelectItemContext selectItemContext : selectItemContexts) {
            select.getSelectItems().add((Item) super.visit(selectItemContext));
        }

        if (Optional.ofNullable(ctx.FROM()).isPresent()) {
            select.setFrom(ctx.FROM().getText());
            final List<QuerySqlBaseParser.TableExpressionContext> tableExpressionContexts = ctx.tableExpression();
            for (QuerySqlBaseParser.TableExpressionContext tableExpressionContext : tableExpressionContexts) {
                select.getTableItems().add((Table) super.visit(tableExpressionContext));
            }
        }

        if (Optional.ofNullable(ctx.WHERE()).isPresent()) {
            select.setWhere(ctx.WHERE().getText());
            select.setWhereExpression((BooleanExpression) super.visit(ctx.where));
        }


        if (Optional.ofNullable(ctx.GROUP()).isPresent()) {
            select.setGroup(ctx.GROUP().getText() + " " + ctx.BY().getText());
            final List<QuerySqlBaseParser.GroupByExpressionContext> groupByExpressionContexts = ctx.groupByExpression();
            for (QuerySqlBaseParser.GroupByExpressionContext groupByExpressionContext : groupByExpressionContexts) {
                select.getGroupItems().add((Item) super.visit(groupByExpressionContext));
            }
        }

        if (Optional.ofNullable(ctx.orderByPart()).isPresent()) {
            final QuerySqlBaseParser.OrderByPartContext orderByPartContext = ctx.orderByPart();
            select.setOrder(orderByPartContext.ORDER().getText() + " " + orderByPartContext.BY().getText());
            final List<QuerySqlBaseParser.OrderByExpressionContext> orderByExpressionContexts = orderByPartContext.orderByExpression();
            for (QuerySqlBaseParser.OrderByExpressionContext orderByExpressionContext : orderByExpressionContexts) {
                select.getOrderItems().add((OrderItem) super.visit(orderByExpressionContext));
            }
        }

        if (Optional.ofNullable(ctx.HAVING()).isPresent()) {
            select.setHaving(ctx.HAVING().getText());
            select.setHavingExpression((BooleanExpression) super.visit(ctx.havingExpression()));
        }

        if (Optional.ofNullable(ctx.LIMIT()).isPresent()) {
            select.setLimit(ctx.LIMIT().getText());
            select.setLimitItems((List) super.visit(ctx.limitRowCount()));
        }
        return select;
    }

    @Override
    public Object visitParenthesizedExpression(QuerySqlBaseParser.ParenthesizedExpressionContext ctx) {
        Object result = super.visit(ctx.expression());
        return new PriorityExpression(result);
    }

    @Override
    public Object visitSelectSingle(QuerySqlBaseParser.SelectSingleContext ctx) {
        Object expression = super.visit(ctx.expression());
        if (expression instanceof ConstantItem) {
            TableColumnItem tableItem = new TableColumnItem();
            tableItem.setColumnName(((ConstantItem) expression).getConstant());
            expression = tableItem;
        } else if (expression instanceof PriorityExpression
                || expression instanceof FunctionCallItem
                || expression instanceof ArithmeticExpression
                || expression instanceof ConcatenationExpression) {
            //nothing to do
        } else {
            throw new RuntimeException("select Item BUG 未支持的解析异常: " + expression.getClass().getSimpleName());
        }

        if (Optional.ofNullable(ctx.AS()).isPresent()) {
            ((Item) expression).setAs(ctx.AS().getText());
        }

        if (Optional.ofNullable(ctx.identifier()).isPresent()) {
            ((Item) expression).setAlias(ctx.identifier().getText());
        }
        return expression;
    }

    @Override
    public Object visitSelectAll(QuerySqlBaseParser.SelectAllContext ctx) {
        final String text = ctx.getText();
        if (text.length() == 1) {
            return new SelectAllItem(text);
        } else {
            final String[] columnParts = text.split("\\.");
            return new SelectAllItem(columnParts[0], columnParts[1]);
        }
    }


    @Override
    public Object visitAliasedTableExpression(QuerySqlBaseParser.AliasedTableExpressionContext ctx) {
        Object result = super.visit(ctx.tableExpressPrimary());
        if (result instanceof SimpleTable) {
            SimpleTable simpleTable = (SimpleTable) result;
            if (Optional.ofNullable(ctx.AS()).isPresent()) {
                simpleTable.setAs(ctx.AS().getText());
            }
            if (Optional.ofNullable(ctx.identifier()).isPresent()) {
                simpleTable.setAlias(ctx.identifier().getText());
            }
            return simpleTable;
        } else if (result instanceof PriorityExpression) {
            PriorityExpression priorityExpression = (PriorityExpression) result;
            if (Optional.ofNullable(ctx.AS()).isPresent()) {
                priorityExpression.setAs(ctx.AS().getText());
            }
            if (Optional.ofNullable(ctx.identifier()).isPresent()) {
                priorityExpression.setAlias(ctx.identifier().getText());
            }
            return priorityExpression;
        } else if (result instanceof UnionTableTable) {
            UnionTableTable unionTableTable = (UnionTableTable) result;
            if (Optional.ofNullable(ctx.AS()).isPresent()) {
                unionTableTable.setAs(ctx.AS().getText());
            }
            if (Optional.ofNullable(ctx.identifier()).isPresent()) {
                unionTableTable.setAlias(ctx.identifier().getText());
            }
            return unionTableTable;
        } else {
            System.out.println(ctx.getText());
            throw new RuntimeException("Table Item BUG 未支持的解析异常: " + result.getClass().getSimpleName());
        }
    }


    @Override
    public Object visitTableNameExpress(QuerySqlBaseParser.TableNameExpressContext ctx) {
        SimpleTable simpleTable = new SimpleTable();
        final String text = ctx.getText();
        if (text.contains(".")) {
            final String[] nameParts = text.split("\\.");
            simpleTable.setDatabase(nameParts[0]);
            simpleTable.setTableName(nameParts[1]);
            return simpleTable;
        }
        simpleTable.setTableName(text);
        return simpleTable;
    }

    @Override
    public Object visitLimitRowCount(QuerySqlBaseParser.LimitRowCountContext ctx) {
        List<Item> items = new ArrayList<>();
        final List<QuerySqlBaseParser.RowCountContext> rowCountContexts = ctx.rowCount();
        for (QuerySqlBaseParser.RowCountContext rowCountContext : rowCountContexts) {
            items.add((Item) super.visit(rowCountContext));
        }
        return items;
    }

    @Override
    public Object visitPredicated(QuerySqlBaseParser.PredicatedContext ctx) {
        final Object value = super.visit(ctx.valueExpression());
        if (null == ctx.predicate()) {
            return value;
        }
        final Object predicate = super.visit(ctx.predicate());

        if (predicate instanceof CommonConditionExpression) {
            CommonConditionExpression simpleExpression = (CommonConditionExpression) predicate;
            simpleExpression.setLeft(value);
            return simpleExpression;
        } else if (predicate instanceof BetweenAndExpression) {
            BetweenAndExpression betweenAndExpression = (BetweenAndExpression) predicate;
            betweenAndExpression.setLeft(value);
            return betweenAndExpression;
        } else if (predicate instanceof InExpression) {
            InExpression inExpression = (InExpression) predicate;
            inExpression.setLeft(value);
            return inExpression;
        } else if (predicate instanceof IsNullExpression) {
            IsNullExpression isNullExpression = (IsNullExpression) predicate;
            isNullExpression.setLeft(value);
            return isNullExpression;
        } else {
            throw new RuntimeException("express BUG 未支持的解析异常: " + predicate.getClass().getSimpleName());
        }

    }

    @Override
    public Object visitArithmeticBinary(QuerySqlBaseParser.ArithmeticBinaryContext ctx) {
        Object left = super.visit(ctx.left);
        Object right = super.visit(ctx.right);
        ArithmeticExpression arithmeticExpressionItem = new ArithmeticExpression();
        arithmeticExpressionItem.setLeft((Item) left);
        arithmeticExpressionItem.setOperator(ctx.operator.getText());
        arithmeticExpressionItem.setRight((Item) right);
        return arithmeticExpressionItem;
    }

    @Override
    public Object visitConcatenationExpression(QuerySqlBaseParser.ConcatenationExpressionContext ctx) {
        Object left = super.visit(ctx.left);
        Object right = super.visit(ctx.right);
        ConcatenationExpression concatenationExpression = new ConcatenationExpression();
        concatenationExpression.setLeft((Item) left);
        concatenationExpression.setConcatenationOperator(ctx.CONCAT().getText());
        concatenationExpression.setRight((Item) right);
        return concatenationExpression;
    }

    @Override
    public Object visitComparison(QuerySqlBaseParser.ComparisonContext ctx) {
        final QuerySqlBaseParser.ComparisonOperatorContext comparisonOperatorContext = ctx.comparisonOperator();
        CommonConditionExpression simpleExpression = new CommonConditionExpression();
        simpleExpression.setOp(comparisonOperatorContext.getText());
        simpleExpression.setRight(super.visit(ctx.right));
        return simpleExpression;
    }

    @Override
    public Object visitLogicalNot(QuerySqlBaseParser.LogicalNotContext ctx) {
        NotBooleanExpression notBooleanExpression = new NotBooleanExpression();
        notBooleanExpression.setNot(ctx.NOT().getText());
        notBooleanExpression.setExpression((BooleanExpression) super.visit(ctx.booleanExpression()));
        return notBooleanExpression;
    }

    @Override
    public Object visitLogicalBinary(QuerySqlBaseParser.LogicalBinaryContext ctx) {
        final Object left = super.visit(ctx.left);
        final Object right = super.visit(ctx.right);
        CommonConditionExpression commonConditionExpression = new CommonConditionExpression();
        commonConditionExpression.setLeft(left);
        commonConditionExpression.setRight(right);
        commonConditionExpression.setOp(ctx.operator.getText());
        return commonConditionExpression;
    }

    @Override
    public Object visitSimpleCase(QuerySqlBaseParser.SimpleCaseContext ctx) {
        CaseItem caseItem = new CaseItem();
        caseItem.setCaseName(ctx.CASE().getText());
        caseItem.setWhenThenItems(new ArrayList<>());
        final List<QuerySqlBaseParser.WhenClauseContext> whenClauseContexts = ctx.whenClause();
        for (QuerySqlBaseParser.WhenClauseContext whenClauseContext : whenClauseContexts) {
            caseItem.getWhenThenItems().add((WhenThenItem) super.visit(whenClauseContext));
        }
        if (null != ctx.elseExpression) {
            caseItem.setElseName(ctx.ELSE().getText());
            caseItem.setElseResult(super.visit(ctx.elseExpression));
        }
        caseItem.setEnd(ctx.END().getText());
        return caseItem;
    }

    @Override
    public Object visitFunctionCall(QuerySqlBaseParser.FunctionCallContext ctx) {
        FunctionCallItem functionCallItem = new FunctionCallItem();
        functionCallItem.setName(ctx.qualifiedName().getText());

        if (Optional.ofNullable(ctx.setQuantifier()).isPresent()) {
            functionCallItem.setQuantifier(ctx.setQuantifier().getText());
        }

        functionCallItem.setParams(new ArrayList<>());
        final List<QuerySqlBaseParser.ExpressionContext> expressions = ctx.expression();
        for (QuerySqlBaseParser.ExpressionContext expression : expressions) {
            functionCallItem.getParams().add(super.visit(expression));
        }
        return functionCallItem;
    }

    @Override
    public Object visitExists(QuerySqlBaseParser.ExistsContext ctx) {
        ExistExpression existExpression = new ExistExpression();
        existExpression.setExist(ctx.EXISTS().getText());
        existExpression.setExpression(super.visit(ctx.query()));
        return existExpression;
    }

    @Override
    public Object visitSubScript(QuerySqlBaseParser.SubScriptContext ctx) {
        SubIndexItem subIndexItem = new SubIndexItem();
        subIndexItem.setIndexes(new ArrayList<>());
        subIndexItem.setValue(super.visit(ctx.primaryExpression()));
        final List<QuerySqlBaseParser.ValueExpressionContext> valueExpressionContexts = ctx.valueExpression();
        for (QuerySqlBaseParser.ValueExpressionContext valueExpressionContext : valueExpressionContexts) {
            subIndexItem.getIndexes().add(super.visit(valueExpressionContext));
        }
        return subIndexItem;
    }

    @Override
    public Object visitWhenClause(QuerySqlBaseParser.WhenClauseContext ctx) {
        Object condition = super.visit(ctx.condition);
        Object result = super.visit(ctx.result);
        WhenThenItem whenThenItem = new WhenThenItem();
        whenThenItem.setWhen(ctx.WHEN().getText());
        whenThenItem.setCondition((BooleanExpression) condition);
        whenThenItem.setThen(ctx.THEN().getText());
        whenThenItem.setResult(result);
        return whenThenItem;
    }

    @Override
    public Object visitBetween(QuerySqlBaseParser.BetweenContext ctx) {
        BetweenAndExpression betweenAndExpression = new BetweenAndExpression();
        if (Optional.ofNullable(ctx.NOT()).isPresent()) {
            betweenAndExpression.setNot(ctx.NOT().getText());
        }
        betweenAndExpression.setBetween(ctx.BETWEEN().getText());
        betweenAndExpression.setLower(super.visit(ctx.lower));
        betweenAndExpression.setAnd(ctx.AND().getText());
        betweenAndExpression.setUpper(super.visit(ctx.upper));
        return betweenAndExpression;
    }

    @Override
    public Object visitInList(QuerySqlBaseParser.InListContext ctx) {
        InExpression inExpression = new InExpression();
        if (Optional.ofNullable(ctx.NOT()).isPresent()) {
            inExpression.setNot(ctx.NOT().getText());
        }
        inExpression.setIn(ctx.IN().getText());
        inExpression.setItems(new ArrayList<>());
        final List<QuerySqlBaseParser.ExpressionContext> expressions = ctx.expression();
        for (QuerySqlBaseParser.ExpressionContext expression : expressions) {
            inExpression.getItems().add((Item) super.visit(expression));
        }
        return inExpression;
    }

    @Override
    public Object visitLike(QuerySqlBaseParser.LikeContext ctx) {
        LikeExpression likeExpression = new LikeExpression();
        if (Optional.ofNullable(ctx.NOT()).isPresent()) {
            likeExpression.setNot(ctx.NOT().getText());
        }
        likeExpression.setLike(ctx.LIKE().getText());
        likeExpression.setPattern(super.visit(ctx.pattern));
        return super.visitLike(ctx);
    }

    @Override
    public Object visitNullPredicate(QuerySqlBaseParser.NullPredicateContext ctx) {
        IsNullExpression isNullExpression = new IsNullExpression();
        isNullExpression.setIs(ctx.IS().getText());
        if (Optional.ofNullable(ctx.NOT()).isPresent()) {
            isNullExpression.setNot(ctx.NOT().getText());
        }
        isNullExpression.setNullName(ctx.NULL().getText());
        return isNullExpression;
    }

    @Override
    public Object visitDynamicParameter(QuerySqlBaseParser.DynamicParameterContext ctx) {
        ConstantItem constantItem = new ConstantItem();
        constantItem.setConstant(ctx.getText());
        return constantItem;
    }

    @Override
    public Object visitSpecialVariable(QuerySqlBaseParser.SpecialVariableContext ctx) {
        ConstantItem constantItem = new ConstantItem();
        constantItem.setConstant(ctx.getText());
        return constantItem;
    }

    @Override
    public Object visitNullLiteral(QuerySqlBaseParser.NullLiteralContext ctx) {
        ConstantItem constantItem = new ConstantItem();
        constantItem.setConstant(ctx.getText());
        return constantItem;
    }

    @Override
    public Object visitColumnReference(QuerySqlBaseParser.ColumnReferenceContext ctx) {
        ConstantItem constantItem = new ConstantItem();
        constantItem.setConstant(ctx.getText());
        return constantItem;
    }

    @Override
    public Object visitDereference(QuerySqlBaseParser.DereferenceContext ctx) {
        TableColumnItem tableColumnItem = new TableColumnItem();
        tableColumnItem.setTableName(ctx.primaryExpression().getText());
        tableColumnItem.setColumnName(ctx.identifier().getText());
        return tableColumnItem;
    }

    @Override
    public Object visitBasicStringLiteral(QuerySqlBaseParser.BasicStringLiteralContext ctx) {
        ConstantItem constantItem = new ConstantItem();
        constantItem.setConstant(ctx.getText());
        return constantItem;
    }

    @Override
    public Object visitNumericLiteral(QuerySqlBaseParser.NumericLiteralContext ctx) {
        final Object o = super.visitNumericLiteral(ctx);
        ConstantItem constantItem = new ConstantItem();
        constantItem.setConstant(o.toString());
        return constantItem;
    }

    @Override
    public Object visitDecimalLiteral(QuerySqlBaseParser.DecimalLiteralContext ctx) {
        return new BigDecimal(ctx.getText());
    }

    @Override
    public Object visitDoubleLiteral(QuerySqlBaseParser.DoubleLiteralContext ctx) {
        return new Double(ctx.getText());
    }

    @Override
    public Object visitIntegerLiteral(QuerySqlBaseParser.IntegerLiteralContext ctx) {
        return new Integer(ctx.getText());
    }

    @Override
    public Object visitUnquotedIdentifier(QuerySqlBaseParser.UnquotedIdentifierContext ctx) {
        ConstantItem constantItem = new ConstantItem();
        constantItem.setConstant(ctx.getText());
        return constantItem;
    }
}
