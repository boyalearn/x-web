package com.xweb.sql.core.common;

import com.xweb.sql.core.common.expression.BetweenAndExpression;
import com.xweb.sql.core.common.expression.CommonConditionExpression;
import com.xweb.sql.core.common.expression.ExistExpression;
import com.xweb.sql.core.common.expression.InExpression;
import com.xweb.sql.core.common.expression.LikeExpression;
import com.xweb.sql.core.common.expression.NotBooleanExpression;
import com.xweb.sql.core.common.expression.PriorityExpression;
import com.xweb.sql.core.common.item.CaseItem;
import com.xweb.sql.core.common.item.ConstantItem;
import com.xweb.sql.core.common.item.FunctionCallItem;
import com.xweb.sql.core.common.item.SelectAllItem;
import com.xweb.sql.core.common.item.SubIndexItem;
import com.xweb.sql.core.common.item.TableColumnItem;
import com.xweb.sql.core.common.item.WhenThenItem;
import com.xweb.sql.core.common.order.OrderItem;
import com.xweb.sql.core.common.table.SimpleTable;
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
    public Object visitQuery(QuerySqlBaseParser.QueryContext ctx) {

        return super.visit(ctx.queryNoWith());
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
    public Object visitQueryNoWith(QuerySqlBaseParser.QueryNoWithContext ctx) {
        Select select = new Select();
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
            select.setGroup(ctx.GROUP().getText() + " " + ctx.GBY().getText());
            final List<QuerySqlBaseParser.GroupByExpressionContext> groupByExpressionContexts = ctx.groupByExpression();
            for (QuerySqlBaseParser.GroupByExpressionContext groupByExpressionContext : groupByExpressionContexts) {
                select.getGroupItems().add((Item) super.visit(groupByExpressionContext));
            }
        }

        if (Optional.ofNullable(ctx.ORDER()).isPresent()) {
            select.setOrder(ctx.ORDER().getText() + " " + ctx.OBY().getText());
            final List<QuerySqlBaseParser.OrderByExpressionContext> orderByExpressionContexts = ctx.orderByExpression();
            for (QuerySqlBaseParser.OrderByExpressionContext orderByExpressionContext : orderByExpressionContexts) {
                select.getOrderItems().add((OrderItem) super.visit(orderByExpressionContext));
            }
        }

        if (Optional.ofNullable(ctx.HAVING()).isPresent()) {
            select.setHaving(ctx.HAVING().getText());
            select.setHavingExpression((BooleanExpression) super.visit(ctx.havingExpression()));
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
                || expression instanceof FunctionCallItem) {
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
        } else {
            throw new RuntimeException("express BUG 未支持的解析异常: " + predicate.getClass().getSimpleName());
        }

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
}
