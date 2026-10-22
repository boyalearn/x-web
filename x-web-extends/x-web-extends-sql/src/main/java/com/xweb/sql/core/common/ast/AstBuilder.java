package com.xweb.sql.core.common.ast;

import com.xweb.sql.core.common.*;
import com.xweb.sql.core.common.delete.SimpleDelete;
import com.xweb.sql.core.common.expression.*;
import com.xweb.sql.core.common.insert.AsQueryInsert;
import com.xweb.sql.core.common.insert.OnDuplicateInsert;
import com.xweb.sql.core.common.insert.SimpleInsert;
import com.xweb.sql.core.common.item.*;
import com.xweb.sql.core.common.merge.*;
import com.xweb.sql.core.common.order.DefaultOrderItem;
import com.xweb.sql.core.common.order.OrderItem;
import com.xweb.sql.core.common.page.LimitPageItem;
import com.xweb.sql.core.common.page.OffsetPageItem;
import com.xweb.sql.core.common.select.BaseSelect;
import com.xweb.sql.core.common.select.UnionSelect;
import com.xweb.sql.core.common.table.SimpleTable;
import com.xweb.sql.core.common.table.UnionTableTable;
import com.xweb.sql.core.common.update.SimpleUpdate;
import com.xweb.sql.core.parser.SqlBaseBaseVisitor;
import com.xweb.sql.core.parser.SqlBaseParser;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AstBuilder extends SqlBaseBaseVisitor<Item> {


    @Override
    public Item visitStatementDefault(SqlBaseParser.StatementDefaultContext ctx) {
        return super.visitStatementDefault(ctx);
    }

    @Override
    public Item visitInsertIntoDefault(SqlBaseParser.InsertIntoDefaultContext ctx) {
        SimpleInsert simpleInsert = new SimpleInsert();
        simpleInsert.setInsert(ctx.INSERT().getText());
        simpleInsert.setInto(ctx.INTO().getText());
        simpleInsert.setTable(ctx.qualifiedName().getText());
        if (Optional.ofNullable(ctx.columnAliases()).isPresent()) {
            simpleInsert.setColumns((List<Item>) super.visit(ctx.columnAliases()));
        }
        if (Optional.ofNullable(ctx.valueAliases()).isPresent()) {
            simpleInsert.setValueItems((List<Item>) super.visit(ctx.valueAliases()));
        }
        simpleInsert.setValues(ctx.VALUES().getText());
        if (Optional.ofNullable(ctx.onDuplicateCondition()).isPresent()) {
            OnDuplicateInsert onDuplicateInsert = new OnDuplicateInsert();
            onDuplicateInsert.setInsert(simpleInsert);
            final SqlBaseParser.OnDuplicateConditionContext onDuplicateConditionContext = ctx.onDuplicateCondition();
            onDuplicateInsert.setOn(onDuplicateConditionContext.ON().getText());
            onDuplicateInsert.setDuplicate(onDuplicateConditionContext.DUPLICATE().getText());
            onDuplicateInsert.setKey(onDuplicateConditionContext.KEY().getText());
            onDuplicateInsert.setUpdate(onDuplicateConditionContext.UPDATE().getText());
            onDuplicateInsert.setUpdateColumns(new ArrayList<>());
            final List<SqlBaseParser.ExpressionContext> expressions = onDuplicateConditionContext.expression();
            for (SqlBaseParser.ExpressionContext expression : expressions) {
                onDuplicateInsert.getUpdateColumns().add(super.visit(expression));
            }
            return onDuplicateInsert;
        }
        return simpleInsert;
    }

    @Override
    public Item visitColumnAliases(SqlBaseParser.ColumnAliasesContext ctx) {
        ListItem<Item> items = new ListItem();
        final List<SqlBaseParser.IdentifierContext> identifiers = ctx.identifier();
        for (SqlBaseParser.IdentifierContext identifier : identifiers) {
            items.add(super.visit(identifier));
        }
        return items;
    }

    @Override
    public Item visitValueAliases(SqlBaseParser.ValueAliasesContext ctx) {
        ListItem<Item> items = new ListItem();
        final List<SqlBaseParser.ExpressionContext> expressions = ctx.expression();
        for (SqlBaseParser.ExpressionContext expression : expressions) {
            items.add(super.visit(expression));
        }
        return items;
    }

    @Override
    public Item visitInsertIntoAsQuery(SqlBaseParser.InsertIntoAsQueryContext ctx) {
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
    public Item visitDeleteDefault(SqlBaseParser.DeleteDefaultContext ctx) {
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
    public Item visitUpdateDefault(SqlBaseParser.UpdateDefaultContext ctx) {
        SimpleUpdate simpleUpdate = new SimpleUpdate();
        simpleUpdate.setUpdate(ctx.UPDATE().getText());
        simpleUpdate.setTable(ctx.qualifiedName().getText());
        simpleUpdate.setSet(ctx.SET().getText());
        simpleUpdate.setUpdateItems(new ArrayList<>());
        final List<SqlBaseParser.ExpressionContext> expressions = ctx.expression();
        for (SqlBaseParser.ExpressionContext expression : expressions) {
            simpleUpdate.getUpdateItems().add(super.visit(expression));
        }
        if (Optional.ofNullable(ctx.WHERE()).isPresent()) {
            simpleUpdate.setWhere(ctx.WHERE().getText());
            simpleUpdate.setWhereExpression((BooleanExpression) super.visit(ctx.booleanExpression()));
        }
        return simpleUpdate;
    }

    @Override
    public Item visitMergeDefault(SqlBaseParser.MergeDefaultContext ctx) {
        SimpleMerge simpleMerge = new SimpleMerge();
        simpleMerge.setMerge(ctx.MERGE().getText());
        simpleMerge.setInto(ctx.INTO().getText());
        simpleMerge.setTable(super.visit(ctx.target));
        simpleMerge.setUsing(ctx.USING().getText());
        simpleMerge.setUseTable(super.visit(ctx.useTable));
        simpleMerge.setOn(ctx.ON().getText());
        simpleMerge.setOnConditionExpression((BooleanExpression) super.visit(ctx.booleanExpression()));
        final List<SqlBaseParser.MatchThenExpressionContext> matchThenExpressionContexts = ctx.matchThenExpression();
        simpleMerge.setWhenThenItems(new ArrayList<>());
        for (SqlBaseParser.MatchThenExpressionContext matchThenExpressionContext : matchThenExpressionContexts) {
            simpleMerge.getWhenThenItems().add((WhenMatchedThenOperatorItem) super.visit(matchThenExpressionContext));
        }
        return simpleMerge;
    }

    @Override
    public Item visitMatchThenExpression(SqlBaseParser.MatchThenExpressionContext ctx) {
        WhenMatchedThenOperatorItem whenMatchedThenOperatorItem = new WhenMatchedThenOperatorItem();
        whenMatchedThenOperatorItem.setWhen(ctx.WHEN().getText());
        if (Optional.ofNullable(ctx.NOT()).isPresent()) {
            whenMatchedThenOperatorItem.setNot(ctx.NOT().getText());
        }
        whenMatchedThenOperatorItem.setMatched(ctx.MATCHED().getText());
        if (Optional.ofNullable(ctx.BY()).isPresent()) {
            whenMatchedThenOperatorItem.setBy(ctx.BY().getText());
        }
        if (Optional.ofNullable(ctx.SOURCE()).isPresent()) {
            whenMatchedThenOperatorItem.setSource(ctx.SOURCE().getText());
        }
        whenMatchedThenOperatorItem.setThen(ctx.THEN().getText());
        whenMatchedThenOperatorItem.setOperator((MergeOperator) super.visit(ctx.mergeOperator()));
        return whenMatchedThenOperatorItem;
    }

    @Override
    public Item visitMergeUpdateOperator(SqlBaseParser.MergeUpdateOperatorContext ctx) {
        UpdateMergeOperator updateMergeOperator = new UpdateMergeOperator();
        updateMergeOperator.setUpdate(ctx.UPDATE().getText());
        if (Optional.ofNullable(ctx.KEY()).isPresent()) {
            updateMergeOperator.setKey(ctx.KEY().getText());
        }
        updateMergeOperator.setSet(ctx.SET().getText());
        final List<SqlBaseParser.ExpressionContext> expressions = ctx.expression();
        updateMergeOperator.setUpdateItems(new ArrayList<>());
        for (SqlBaseParser.ExpressionContext expression : expressions) {
            updateMergeOperator.getUpdateItems().add((Item) super.visit(expression));
        }
        return updateMergeOperator;
    }

    @Override
    public Item visitMergeDeleteOperator(SqlBaseParser.MergeDeleteOperatorContext ctx) {
        DeleteMergeOperator deleteMergeOperator = new DeleteMergeOperator();
        deleteMergeOperator.setDelete(ctx.DELETE().getText());
        return deleteMergeOperator;
    }

    @Override
    public Item visitMergeInsertOperator(SqlBaseParser.MergeInsertOperatorContext ctx) {
        InsertMergeOperator insertMergeOperator = new InsertMergeOperator();
        insertMergeOperator.setInsert(ctx.INSERT().getText());
        if (Optional.ofNullable(ctx.qualifiedName()).isPresent()) {
            insertMergeOperator.setTable(ctx.qualifiedName().getText());
        }
        insertMergeOperator.setValues(ctx.VALUES().getText());
        final SqlBaseParser.ColumnAliasesContext columnAliasesContext = ctx.columnAliases();
        insertMergeOperator.setColumnItems((List<Item>) super.visit(columnAliasesContext));
        if (Optional.ofNullable(ctx.valueAliases()).isPresent()) {
            insertMergeOperator.setValueItems((List<Item>) super.visit(ctx.valueAliases()));
        }
        return insertMergeOperator;
    }

    @Override
    public Item visitQuery(SqlBaseParser.QueryContext ctx) {
        Item result = super.visit(ctx.queryItem());
        if (result instanceof BaseSelect) {
            if (!ctx.unionExpress().isEmpty()) {
                BaseSelect select = (BaseSelect) result;
                UnionSelect unionSelect = new UnionSelect();
                unionSelect.setSelect(select);
                unionSelect.setUnionSelectItems(new ArrayList<>());
                final List<SqlBaseParser.UnionExpressContext> unionExpressContexts = ctx.unionExpress();
                for (SqlBaseParser.UnionExpressContext unionExpressContext : unionExpressContexts) {
                    unionSelect.getUnionSelectItems().add((UnionSelectItem) super.visit(unionExpressContext));
                }
                return unionSelect;
            }
        }
        return result;
    }

    @Override
    public Item visitUnionExpress(SqlBaseParser.UnionExpressContext ctx) {
        UnionSelectItem unionSelectItem = new UnionSelectItem();
        unionSelectItem.setUnion(ctx.UNION().getText());
        if (Optional.ofNullable(ctx.setQuantifier()).isPresent()) {
            unionSelectItem.setAll(ctx.setQuantifier().getText());
        }
        unionSelectItem.setSelect(super.visit(ctx.queryItem()));
        return unionSelectItem;
    }

    @Override
    public Item visitSubPriorityQueryExpression(SqlBaseParser.SubPriorityQueryExpressionContext ctx) {
        Item result = super.visit(ctx.query());
        return new PriorityExpression(result);
    }

    @Override
    public Item visitSubQueryExpression(SqlBaseParser.SubQueryExpressionContext ctx) {
        return super.visitSubQueryExpression(ctx);
    }

    @Override
    public Item visitSubQueryTableExpress(SqlBaseParser.SubQueryTableExpressContext ctx) {
        Item result = super.visit(ctx.query());
        return new PriorityExpression(result);
    }

    @Override
    public Item visitSubTableExpressionExpress(SqlBaseParser.SubTableExpressionExpressContext ctx) {
        Item result = super.visit(ctx.tableExpression());
        return new PriorityExpression(result);
    }

    @Override
    public Item visitUnionSelectTableExpress(SqlBaseParser.UnionSelectTableExpressContext ctx) {
        UnionTableTable unionTableTable = new UnionTableTable();
        Item left = super.visit(ctx.tableExpression());
        unionTableTable.setLeft((Table) left);
        final List<SqlBaseParser.UnionTableExpressContext> unionTableExpressContexts = ctx.unionTableExpress();
        unionTableTable.setUnionTableItems(new ArrayList<>());
        for (SqlBaseParser.UnionTableExpressContext unionTableExpressContext : unionTableExpressContexts) {
            unionTableTable.getUnionTableItems().add((UnionTableTable.UnionTableItem) super.visit(unionTableExpressContext));
        }
        return new PriorityExpression(unionTableTable);
    }

    @Override
    public Item visitUnionTableExpress(SqlBaseParser.UnionTableExpressContext ctx) {
        UnionTableTable.UnionTableItem unionTableItem = new UnionTableTable.UnionTableItem();
        unionTableItem.setUnion(ctx.UNION().getText());
        if (Optional.ofNullable(ctx.setQuantifier()).isPresent()) {
            unionTableItem.setAll(ctx.setQuantifier().getText());
        }
        unionTableItem.setRight((Table) super.visit(ctx.tableExpressPrimary()));
        return unionTableItem;
    }

    @Override
    public Item visitQueryItem(SqlBaseParser.QueryItemContext ctx) {
        return super.visitQueryItem(ctx);
    }

    @Override
    public Item visitOrderByExpression(SqlBaseParser.OrderByExpressionContext ctx) {
        Item result = super.visit(ctx.expression());
        return new DefaultOrderItem(result, Optional.ofNullable(ctx.sort).isPresent() ? ctx.sort.getText() : "");
    }

    @Override
    public Item visitQueryPrimary(SqlBaseParser.QueryPrimaryContext ctx) {
        BaseSelect select = new BaseSelect();
        select.setSelect(ctx.SELECT().getText());
        final List<SqlBaseParser.SelectItemContext> selectItemContexts = ctx.selectItem();
        for (SqlBaseParser.SelectItemContext selectItemContext : selectItemContexts) {
            select.getSelectItems().add(super.visit(selectItemContext));
        }

        if (Optional.ofNullable(ctx.FROM()).isPresent()) {
            select.setFrom(ctx.FROM().getText());
            final List<SqlBaseParser.TableExpressionContext> tableExpressionContexts = ctx.tableExpression();
            for (SqlBaseParser.TableExpressionContext tableExpressionContext : tableExpressionContexts) {
                select.getTableItems().add((Table) super.visit(tableExpressionContext));
            }
        }

        if (Optional.ofNullable(ctx.WHERE()).isPresent()) {
            select.setWhere(ctx.WHERE().getText());
            select.setWhereExpression((BooleanExpression) super.visit(ctx.where));
        }


        if (Optional.ofNullable(ctx.GROUP()).isPresent()) {
            select.setGroup(ctx.GROUP().getText() + " " + ctx.BY().getText());
            final List<SqlBaseParser.GroupByExpressionContext> groupByExpressionContexts = ctx.groupByExpression();
            for (SqlBaseParser.GroupByExpressionContext groupByExpressionContext : groupByExpressionContexts) {
                select.getGroupItems().add(super.visit(groupByExpressionContext));
            }
        }

        if (Optional.ofNullable(ctx.orderByPart()).isPresent()) {
            final SqlBaseParser.OrderByPartContext orderByPartContext = ctx.orderByPart();
            select.setOrder(orderByPartContext.ORDER().getText() + " " + orderByPartContext.BY().getText());
            final List<SqlBaseParser.OrderByExpressionContext> orderByExpressionContexts = orderByPartContext.orderByExpression();
            for (SqlBaseParser.OrderByExpressionContext orderByExpressionContext : orderByExpressionContexts) {
                select.getOrderItems().add((OrderItem) super.visit(orderByExpressionContext));
            }
        }

        if (Optional.ofNullable(ctx.HAVING()).isPresent()) {
            select.setHaving(ctx.HAVING().getText());
            select.setHavingExpression((BooleanExpression) super.visit(ctx.havingExpression()));
        }

        if (Optional.ofNullable(ctx.pageExpression()).isPresent()) {
            select.setPage((Page) super.visit(ctx.pageExpression()));
        }
        return select;
    }


    @Override
    public Item visitLimitPageExpress(SqlBaseParser.LimitPageExpressContext ctx) {
        LimitPageItem limitPageItem = new LimitPageItem();
        limitPageItem.setLimit(ctx.LIMIT().getText());
        limitPageItem.setLimitItems((List<Item>) super.visit(ctx.limit));
        return limitPageItem;
    }

    @Override
    public Item visitOffsetPageExpress(SqlBaseParser.OffsetPageExpressContext ctx) {
        OffsetPageItem offsetPageItem = new OffsetPageItem();
        offsetPageItem.setOffset(ctx.OFFSET().getText());
        offsetPageItem.setStart(super.visit(ctx.offset));
        offsetPageItem.setTagStart(ctx.offsetTag.getText());

        if (Optional.ofNullable(ctx.FETCH()).isPresent()) {
            offsetPageItem.setFetch(ctx.FETCH().getText());
        }

        if (Optional.ofNullable(ctx.NEXT()).isPresent()) {
            offsetPageItem.setTagFetch(ctx.NEXT().getText());
        }

        if (Optional.ofNullable(ctx.FIRST()).isPresent()) {
            offsetPageItem.setTagFetch(ctx.FIRST().getText());

        }

        if (Optional.ofNullable(ctx.fetchFirst).isPresent()) {
            offsetPageItem.setRow(super.visit(ctx.fetchFirst));
        }

        offsetPageItem.setTagRow(ctx.tag.getText());

        if (Optional.ofNullable(ctx.ONLY()).isPresent()) {
            offsetPageItem.setTagLast(ctx.ONLY().getText());

        }
        if (Optional.ofNullable(ctx.WITH()).isPresent()) {
            offsetPageItem.setTagLast(ctx.WITH().getText() + " " + ctx.TIES().getText());
        }
        return offsetPageItem;
    }

    @Override
    public Item visitParenthesizedExpression(SqlBaseParser.ParenthesizedExpressionContext ctx) {
        Item result = super.visit(ctx.expression());
        return new PriorityExpression(result);
    }

    @Override
    public Item visitSelectSingle(SqlBaseParser.SelectSingleContext ctx) {
        Item expression = super.visit(ctx.expression());
        if (expression instanceof ConstantItem) {
            TableColumnItem tableItem = new TableColumnItem();
            tableItem.setColumnName(((ConstantItem) expression).getConstant().toString());
            expression = tableItem;
        } else if (!(expression instanceof PriorityExpression
                || expression instanceof FunctionCallItem
                || expression instanceof ArithmeticExpression
                || expression instanceof ConcatenationExpression
                || expression instanceof IntervalExpression
                || expression instanceof TableColumnItem
                || expression instanceof SubIndexItem)) {
            throw new RuntimeException("select Item BUG 未支持的解析异常: " + expression.getClass().getSimpleName());
        }

        if (Optional.ofNullable(ctx.AS()).isPresent()) {
            expression.setAs(ctx.AS().getText());
        }

        if (Optional.ofNullable(ctx.identifier()).isPresent()) {
            expression.setAlias(ctx.identifier().getText());
        }
        return expression;
    }

    @Override
    public Item visitSelectAll(SqlBaseParser.SelectAllContext ctx) {
        final String text = ctx.getText();
        if (text.length() == 1) {
            return new SelectAllItem(text);
        } else {
            final String[] columnParts = text.split("\\.");
            return new SelectAllItem(columnParts[0], columnParts[1]);
        }
    }


    @Override
    public Item visitAliasedTableExpression(SqlBaseParser.AliasedTableExpressionContext ctx) {
        Item result = super.visit(ctx.tableExpressPrimary());
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
    public Item visitTableNameExpress(SqlBaseParser.TableNameExpressContext ctx) {
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
    public Item visitLimitRowCount(SqlBaseParser.LimitRowCountContext ctx) {
        ListItem<Item> items = new ListItem();
        final List<SqlBaseParser.RowCountContext> rowCountContexts = ctx.rowCount();
        for (SqlBaseParser.RowCountContext rowCountContext : rowCountContexts) {
            items.add(super.visit(rowCountContext));
        }
        return items;
    }

    @Override
    public Item visitPredicated(SqlBaseParser.PredicatedContext ctx) {
        final Item value = super.visit(ctx.valueExpression());
        if (null == ctx.predicate()) {
            return value;
        }
        final Item predicate = super.visit(ctx.predicate());

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
        } else if (predicate instanceof LikeExpression) {
            LikeExpression likeExpression = (LikeExpression) predicate;
            likeExpression.setLeft(value);
            return likeExpression;
        } else if (predicate instanceof IntervalExpression) {
            IntervalExpression intervalExpression = (IntervalExpression) predicate;
            intervalExpression.setLeft(value);
            return intervalExpression;
        } else {
            throw new RuntimeException("express BUG 未支持的解析异常: " + predicate.getClass().getSimpleName());
        }
    }

    @Override
    public Item visitArithmeticBinary(SqlBaseParser.ArithmeticBinaryContext ctx) {
        Item left = super.visit(ctx.left);
        Item right = super.visit(ctx.right);
        ArithmeticExpression arithmeticExpressionItem = new ArithmeticExpression();
        arithmeticExpressionItem.setLeft(left);
        arithmeticExpressionItem.setOperator(ctx.operator.getText());
        arithmeticExpressionItem.setRight(right);
        return arithmeticExpressionItem;
    }

    @Override
    public Item visitConcatenationExpression(SqlBaseParser.ConcatenationExpressionContext ctx) {
        Item left = super.visit(ctx.left);
        Item right = super.visit(ctx.right);
        ConcatenationExpression concatenationExpression = new ConcatenationExpression();
        concatenationExpression.setLeft(left);
        concatenationExpression.setConcatenationOperator(ctx.CONCAT().getText());
        concatenationExpression.setRight(right);
        return concatenationExpression;
    }

    @Override
    public Item visitComparison(SqlBaseParser.ComparisonContext ctx) {
        final SqlBaseParser.ComparisonOperatorContext comparisonOperatorContext = ctx.comparisonOperator();
        CommonConditionExpression simpleExpression = new CommonConditionExpression();
        simpleExpression.setOp(comparisonOperatorContext.getText());
        simpleExpression.setRight(super.visit(ctx.right));
        return simpleExpression;
    }

    @Override
    public Item visitLogicalNot(SqlBaseParser.LogicalNotContext ctx) {
        NotBooleanExpression notBooleanExpression = new NotBooleanExpression();
        notBooleanExpression.setNot(ctx.NOT().getText());
        notBooleanExpression.setExpression((BooleanExpression) super.visit(ctx.booleanExpression()));
        return notBooleanExpression;
    }

    @Override
    public Item visitLogicalBinary(SqlBaseParser.LogicalBinaryContext ctx) {
        final Item left = super.visit(ctx.left);
        final Item right = super.visit(ctx.right);
        CommonConditionExpression commonConditionExpression = new CommonConditionExpression();
        commonConditionExpression.setLeft(left);
        commonConditionExpression.setRight(right);
        commonConditionExpression.setOp(ctx.operator.getText());
        return commonConditionExpression;
    }

    @Override
    public Item visitSimpleCase(SqlBaseParser.SimpleCaseContext ctx) {
        CaseItem caseItem = new CaseItem();
        caseItem.setCaseName(ctx.CASE().getText());
        caseItem.setWhenThenItems(new ArrayList<>());
        final List<SqlBaseParser.WhenClauseContext> whenClauseContexts = ctx.whenClause();
        for (SqlBaseParser.WhenClauseContext whenClauseContext : whenClauseContexts) {
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
    public Item visitFunctionCall(SqlBaseParser.FunctionCallContext ctx) {
        FunctionCallItem functionCallItem = new FunctionCallItem();
        functionCallItem.setName(ctx.qualifiedName().getText());

        if (Optional.ofNullable(ctx.setQuantifier()).isPresent()) {
            functionCallItem.setQuantifier(ctx.setQuantifier().getText());
        }


        functionCallItem.setParams(new ArrayList<>());
        if (Optional.ofNullable(ctx.intervalField()).isPresent()) {
            final ConstantItem constantItem = new ConstantItem();
            constantItem.setConstant(ctx.intervalField().getText());
            functionCallItem.getParams().add(constantItem);
        }
        final List<SqlBaseParser.ExpressionContext> expressions = ctx.expression();
        for (SqlBaseParser.ExpressionContext expression : expressions) {
            functionCallItem.getParams().add(super.visit(expression));
        }
        return functionCallItem;
    }

    @Override
    public Item visitExists(SqlBaseParser.ExistsContext ctx) {
        ExistExpression existExpression = new ExistExpression();
        existExpression.setExist(ctx.EXISTS().getText());
        existExpression.setExpression(super.visit(ctx.query()));
        return existExpression;
    }

    @Override
    public Item visitSubScript(SqlBaseParser.SubScriptContext ctx) {
        SubIndexItem subIndexItem = new SubIndexItem();
        subIndexItem.setIndexes(new ArrayList<>());
        subIndexItem.setValue(super.visit(ctx.primaryExpression()));
        final List<SqlBaseParser.ValueExpressionContext> valueExpressionContexts = ctx.valueExpression();
        for (SqlBaseParser.ValueExpressionContext valueExpressionContext : valueExpressionContexts) {
            subIndexItem.getIndexes().add(super.visit(valueExpressionContext));
        }
        return subIndexItem;
    }

    @Override
    public Item visitWhenClause(SqlBaseParser.WhenClauseContext ctx) {
        Item condition = super.visit(ctx.condition);
        Item result = super.visit(ctx.result);
        WhenThenItem whenThenItem = new WhenThenItem();
        whenThenItem.setWhen(ctx.WHEN().getText());
        whenThenItem.setCondition((BooleanExpression) condition);
        whenThenItem.setThen(ctx.THEN().getText());
        whenThenItem.setResult(result);
        return whenThenItem;
    }

    @Override
    public Item visitBetween(SqlBaseParser.BetweenContext ctx) {
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
    public Item visitInList(SqlBaseParser.InListContext ctx) {
        InExpression inExpression = new InExpression();
        if (Optional.ofNullable(ctx.NOT()).isPresent()) {
            inExpression.setNot(ctx.NOT().getText());
        }
        inExpression.setIn(ctx.IN().getText());
        inExpression.setItems(new ArrayList<>());
        final List<SqlBaseParser.ExpressionContext> expressions = ctx.expression();
        for (SqlBaseParser.ExpressionContext expression : expressions) {
            inExpression.getItems().add(super.visit(expression));
        }
        return inExpression;
    }

    @Override
    public Item visitLike(SqlBaseParser.LikeContext ctx) {
        LikeExpression likeExpression = new LikeExpression();
        if (Optional.ofNullable(ctx.NOT()).isPresent()) {
            likeExpression.setNot(ctx.NOT().getText());
        }
        likeExpression.setLike(ctx.LIKE().getText());
        likeExpression.setPattern(super.visit(ctx.pattern));
        return likeExpression;
    }

    @Override
    public Item visitNullPredicate(SqlBaseParser.NullPredicateContext ctx) {
        IsNullExpression isNullExpression = new IsNullExpression();
        isNullExpression.setIs(ctx.IS().getText());
        if (Optional.ofNullable(ctx.NOT()).isPresent()) {
            isNullExpression.setNot(ctx.NOT().getText());
        }
        isNullExpression.setNullName(ctx.NULL().getText());
        return isNullExpression;
    }

    @Override
    public Item visitArithmeticInterval(SqlBaseParser.ArithmeticIntervalContext ctx) {
        IntervalExpression intervalExpression = (IntervalExpression) super.visit(ctx.interval());
        intervalExpression.setOperator(ctx.operator.getText());
        return intervalExpression;
    }


    @Override
    public Item visitNumberInterval(SqlBaseParser.NumberIntervalContext ctx) {
        IntervalExpression intervalExpression = new IntervalExpression();
        intervalExpression.setInterval(ctx.INTERVAL().getText());
        if (Optional.ofNullable(ctx.sign).isPresent()) {
            intervalExpression.setSign(ctx.sign.getText());
        }
        if (Optional.ofNullable(ctx.from).isPresent()) {
            intervalExpression.setIntervalField(ctx.from.getText());
        }
        intervalExpression.setNumber(ctx.number().getText());
        return intervalExpression;
    }

    @Override
    public Item visitStringInterval(SqlBaseParser.StringIntervalContext ctx) {
        IntervalExpression intervalExpression = new IntervalExpression();
        intervalExpression.setInterval(ctx.INTERVAL().getText());
        if (Optional.ofNullable(ctx.sign).isPresent()) {
            intervalExpression.setSign(ctx.sign.getText());
        }
        if (Optional.ofNullable(ctx.string()).isPresent()) {
            intervalExpression.setIntervalField(ctx.string().getText());
        }
        return intervalExpression;
    }

    @Override
    public Item visitDynamicParameter(SqlBaseParser.DynamicParameterContext ctx) {
        ConstantItem constantItem = new ConstantItem();
        constantItem.setConstant(ctx.getText());
        return constantItem;
    }

    @Override
    public Item visitSpecialVariable(SqlBaseParser.SpecialVariableContext ctx) {
        ConstantItem constantItem = new ConstantItem();
        constantItem.setConstant(ctx.getText());
        return constantItem;
    }

    @Override
    public Item visitNullLiteral(SqlBaseParser.NullLiteralContext ctx) {
        ConstantItem constantItem = new ConstantItem();
        constantItem.setConstant(ctx.getText());
        return constantItem;
    }


    @Override
    public Item visitColumnReference(SqlBaseParser.ColumnReferenceContext ctx) {
        ConstantItem constantItem = new ConstantItem();
        constantItem.setConstant(ctx.getText());
        return constantItem;
    }

    @Override
    public Item visitDereference(SqlBaseParser.DereferenceContext ctx) {
        TableColumnItem tableColumnItem = new TableColumnItem();
        tableColumnItem.setTableName(ctx.primaryExpression().getText());
        tableColumnItem.setColumnName(ctx.identifier().getText());
        return tableColumnItem;
    }

    @Override
    public Item visitBasicStringLiteral(SqlBaseParser.BasicStringLiteralContext ctx) {
        ConstantItem constantItem = new ConstantItem();
        constantItem.setConstant(ctx.getText());
        return constantItem;
    }

    @Override
    public Item visitNumericLiteral(SqlBaseParser.NumericLiteralContext ctx) {
        return super.visitNumericLiteral(ctx);

    }

    @Override
    public Item visitIntervalLiteral(SqlBaseParser.IntervalLiteralContext ctx) {
        return super.visit(ctx.interval());
    }

    @Override
    public Item visitDecimalLiteral(SqlBaseParser.DecimalLiteralContext ctx) {
        return new ConstantItem(new BigDecimal(ctx.getText()));
    }

    @Override
    public Item visitDoubleLiteral(SqlBaseParser.DoubleLiteralContext ctx) {
        return new ConstantItem(new Double(ctx.getText()));
    }

    @Override
    public Item visitIntegerLiteral(SqlBaseParser.IntegerLiteralContext ctx) {
        return new ConstantItem(new Integer(ctx.getText()));
    }

    @Override
    public Item visitUnquotedIdentifier(SqlBaseParser.UnquotedIdentifierContext ctx) {
        return new ConstantItem(ctx.getText());
    }
}
