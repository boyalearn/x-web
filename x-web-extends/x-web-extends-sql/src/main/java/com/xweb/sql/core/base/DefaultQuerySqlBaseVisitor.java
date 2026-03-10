package com.xweb.sql.core.base;

import com.xweb.sql.core.base.express.SimpleExpression;
import com.xweb.sql.core.base.express.SuperSimpleExpression;
import com.xweb.sql.core.base.group.SimpleGroupItem;
import com.xweb.sql.core.base.order.SimpleOrderItem;
import com.xweb.sql.parser.QuerySqlBaseBaseVisitor;
import com.xweb.sql.parser.QuerySqlBaseParser;
import lombok.Getter;

@Getter
public class DefaultQuerySqlBaseVisitor extends QuerySqlBaseBaseVisitor {

    private BaseSelect baseSelect;

    public DefaultQuerySqlBaseVisitor() {
        this.baseSelect = new BaseSelect();
    }

    @Override
    public Object visitSelectSingle(QuerySqlBaseParser.SelectSingleContext ctx) {
        Object result = super.visitSelectSingle(ctx);
        if (result instanceof Identifier) {
            Identifier identifier = (Identifier) result;
            TableColumn tableItem = new TableColumn();
            tableItem.setColumnName(identifier.getName());
            this.baseSelect.getSelectItems().add(tableItem);
        } else {
            throw new RuntimeException("select Item BUG 未支持的解析异常: " + result.getClass().getSimpleName());
        }
        return result;
    }

    @Override
    public Object visitSelectAll(QuerySqlBaseParser.SelectAllContext ctx) {
        final String text = ctx.getText();
        if (text.length() == 1) {
            this.baseSelect.getSelectItems().add(new SelectAllItem(text));
        } else {
            final String[] columnParts = text.split(".");
            this.baseSelect.getSelectItems().add(new SelectAllItem(columnParts[0], columnParts[1]));
        }
        return super.visitSelectAll(ctx);
    }

    @Override
    public Object visitTableExpress(QuerySqlBaseParser.TableExpressContext ctx) {
        String text = ctx.getText();
        TableItem tableItem = new BaseTableItem(text);
        this.baseSelect.getTableItems().add(tableItem);
        return tableItem;

    }

    @Override
    public Object visitWhereExpress(QuerySqlBaseParser.WhereExpressContext ctx) {
        Object result = super.visitWhereExpress(ctx);
        if (result instanceof SimpleExpression) {
            this.baseSelect.getWhereItems().add((SimpleExpression) result);
        } else {
            throw new RuntimeException("where Item BUG 未支持的解析异常: " + result.getClass().getSimpleName());
        }
        return result;
    }


    @Override
    public Object visitGroupByExpress(QuerySqlBaseParser.GroupByExpressContext ctx) {
        Object result = super.visitGroupByExpress(ctx);
        if (result instanceof Identifier) {
            Identifier identifier = (Identifier) result;
            SimpleGroupItem groupItem = new SimpleGroupItem();
            groupItem.setColumnName(identifier.getName());
            this.baseSelect.getGroupItems().add(groupItem);
        } else {
            throw new RuntimeException("group by  Item BUG 未支持的解析异常: " + result.getClass().getSimpleName());
        }
        return result;
    }

    @Override
    public Object visitOrderByExpress(QuerySqlBaseParser.OrderByExpressContext ctx) {
        Object result = super.visitOrderByExpress(ctx);
        if (result instanceof Identifier) {
            Identifier identifier = (Identifier) result;
            SimpleOrderItem groupItem = new SimpleOrderItem();
            groupItem.setColumnName(identifier.getName());
            this.baseSelect.getOrderItems().add(groupItem);
        }
        return result;
    }

    @Override
    public Object visitHavingExpress(QuerySqlBaseParser.HavingExpressContext ctx) {
        Object result = super.visitHavingExpress(ctx);
        if (result instanceof SimpleExpression) {
            this.baseSelect.getHavingItems().add((SimpleExpression) result);
        } else {
            throw new RuntimeException("where Item BUG 未支持的解析异常: " + result.getClass().getSimpleName());
        }
        return result;
    }

    @Override
    public Object visitColumnReference(QuerySqlBaseParser.ColumnReferenceContext ctx) {
        Identifier column = new Identifier();
        column.setName(ctx.identifier().getText());
        return column;
    }

    @Override
    public Object visitPredicated(QuerySqlBaseParser.PredicatedContext ctx) {
        final Object value = super.visit(ctx.valueExpression());
        if (null == ctx.predicate()) {
            return value;
        }
        final Object predicate = super.visit(ctx.predicate());

        if (predicate instanceof SimpleExpression) {
            SimpleExpression simpleExpression = (SimpleExpression) predicate;
            simpleExpression.setLeft(value);
            return simpleExpression;
        } else {
            throw new RuntimeException("express BUG 未支持的解析异常: " + predicate.getClass().getSimpleName());
        }
    }

    @Override
    public Object visitValueExpressionDefault(QuerySqlBaseParser.ValueExpressionDefaultContext ctx) {
        Object result = super.visitValueExpressionDefault(ctx);
        return result;
    }

    @Override
    public Object visitComparison(QuerySqlBaseParser.ComparisonContext ctx) {
        final QuerySqlBaseParser.ComparisonOperatorContext comparisonOperatorContext = ctx.comparisonOperator();
        SimpleExpression simpleExpression = new SimpleExpression();
        simpleExpression.setOp(comparisonOperatorContext.getText());
        simpleExpression.setRight(ctx.valueExpression().getText());
        return simpleExpression;
    }

    @Override
    public Object visitLogicalBinary(QuerySqlBaseParser.LogicalBinaryContext ctx) {
        final Object left = super.visit(ctx.left);

        final Object right = super.visit(ctx.right);
        SimpleExpression simpleExpression = new SimpleExpression();
        simpleExpression.setLeft(left);
        simpleExpression.setRight(right);
        simpleExpression.setOp(ctx.operator.getText());
        return simpleExpression;
    }

    @Override
    public Object visitParenthesizedExpression(QuerySqlBaseParser.ParenthesizedExpressionContext ctx) {
        Object result = super.visit(ctx.expression());
        return new SuperSimpleExpression((SimpleExpression) result);
    }
}
