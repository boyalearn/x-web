package com.xweb.sql.core.base;

import com.xweb.sql.core.base.express.ConditionAndResult;
import com.xweb.sql.core.base.express.SimpleExpression;
import com.xweb.sql.core.base.express.SuperSimpleExpression;
import com.xweb.sql.core.base.group.SimpleGroupItem;
import com.xweb.sql.core.base.item.CaseWhenItem;
import com.xweb.sql.core.base.item.FunctionItem;
import com.xweb.sql.core.base.item.SelectAllItem;
import com.xweb.sql.core.base.item.TableColumn;
import com.xweb.sql.core.base.order.SimpleOrderItem;
import com.xweb.sql.parser.QuerySqlBaseBaseVisitor;
import com.xweb.sql.parser.QuerySqlBaseParser;
import lombok.Getter;
import lombok.val;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@Getter
public class DefaultQuerySqlBaseVisitor extends QuerySqlBaseBaseVisitor {

    private BaseSelect baseSelect;

    private Stack<BaseSelect> selectStack = new Stack<>();

    public DefaultQuerySqlBaseVisitor() {
        this.baseSelect = new BaseSelect();
        this.selectStack.push(baseSelect);
    }

    @Override
    public Object visitSelect(QuerySqlBaseParser.SelectContext ctx) {

        return super.visitSelect(ctx);
    }

    @Override
    public Object visitSelectSingle(QuerySqlBaseParser.SelectSingleContext ctx) {
        Object expression = super.visit(ctx.expression());
        if (expression instanceof Identifier) {
            Identifier identifier = (Identifier) expression;
            TableColumn tableItem = new TableColumn();
            tableItem.setColumnName(identifier.getName());
            expression = tableItem;
        } else if (expression instanceof CaseWhenItem
                || expression instanceof BaseSelect
                || expression instanceof FunctionItem) {
            // nothing to do
        } else {
            throw new RuntimeException("select Item BUG 未支持的解析异常: " + expression.getClass().getSimpleName());
        }
        if (null != ctx.identifier()) {
            ((Item) expression).setAliasName(ctx.identifier().getText());
        }
        if (null != ctx.AS()) {
            ((Item) expression).setAs(ctx.AS().getText());
        }
        this.selectStack.peek().getSelectItems().add((Item) expression);
        return expression;
    }

    @Override
    public Object visitSelectAll(QuerySqlBaseParser.SelectAllContext ctx) {
        final String text = ctx.getText();
        if (text.length() == 1) {
            this.selectStack.peek().getSelectItems().add(new SelectAllItem(text));
        } else {
            final String[] columnParts = text.split(".");
            this.selectStack.peek().getSelectItems().add(new SelectAllItem(columnParts[0], columnParts[1]));
        }
        return super.visitSelectAll(ctx);
    }

    @Override
    public Object visitTableExpress(QuerySqlBaseParser.TableExpressContext ctx) {
        String text = ctx.getText();
        TableItem tableItem = new BaseTableItem(text);
        this.selectStack.peek().getTableItems().add(tableItem);
        return tableItem;

    }

    @Override
    public Object visitWhereExpress(QuerySqlBaseParser.WhereExpressContext ctx) {
        Object result = super.visitWhereExpress(ctx);
        if (result instanceof SimpleExpression) {
            this.selectStack.peek().getWhereItems().add((SimpleExpression) result);
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
            this.selectStack.peek().getGroupItems().add(groupItem);
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
            this.selectStack.peek().getOrderItems().add(groupItem);
        }
        return result;
    }

    @Override
    public Object visitHavingExpress(QuerySqlBaseParser.HavingExpressContext ctx) {
        Object result = super.visitHavingExpress(ctx);
        if (result instanceof SimpleExpression) {
            this.selectStack.peek().getHavingItems().add((SimpleExpression) result);
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

    @Override
    public Object visitSubQueryExpression(QuerySqlBaseParser.SubQueryExpressionContext ctx) {
        BaseSelect thisSelect = new BaseSelect();
        this.selectStack.push(thisSelect);
        super.visitSubQueryExpression(ctx);
        //出栈
        this.selectStack.pop();
        return thisSelect;
    }

    @Override
    public Object visitExpression(QuerySqlBaseParser.ExpressionContext ctx) {
        Object result = super.visitExpression(ctx);
        return result;
    }


    @Override
    public Object visitSimpleCase(QuerySqlBaseParser.SimpleCaseContext ctx) {
        CaseWhenItem caseWhenItem = new CaseWhenItem();
        caseWhenItem.setConditionResults(new ArrayList<>());
        final List<QuerySqlBaseParser.WhenClauseContext> whenClauseContexts = ctx.whenClause();
        for (QuerySqlBaseParser.WhenClauseContext whenClauseContext : whenClauseContexts) {
            caseWhenItem.getConditionResults().add((ConditionAndResult) super.visit(whenClauseContext));
        }
        if (null != ctx.elseExpression) {
            caseWhenItem.setElseResult(super.visit(ctx.elseExpression));
        }
        return caseWhenItem;
    }

    @Override
    public Object visitWhenClause(QuerySqlBaseParser.WhenClauseContext ctx) {
        Object condition = super.visit(ctx.condition);
        Object result = super.visit(ctx.result);
        ConditionAndResult conditionAndResult = new ConditionAndResult();
        conditionAndResult.setCondition((SimpleExpression) condition);
        conditionAndResult.setResult(result);
        return conditionAndResult;
    }

    @Override
    public Object visitBasicStringLiteral(QuerySqlBaseParser.BasicStringLiteralContext ctx) {
        String result = ctx.getText();
        return result;
    }

    @Override
    public Object visitFunctionCall(QuerySqlBaseParser.FunctionCallContext ctx) {
        FunctionItem functionItem = new FunctionItem();
        if (null != ctx.setQuantifier()) {
            functionItem.setQuantifier(ctx.setQuantifier().getText());
        }
        Object function = super.visit(ctx.qualifiedName());
        functionItem.setName(ctx.qualifiedName().getText());
        functionItem.setParams(new ArrayList<>());
        final List<QuerySqlBaseParser.ExpressionContext> expressions = ctx.expression();
        for (QuerySqlBaseParser.ExpressionContext expression : expressions) {
            functionItem.getParams().add(super.visit(expression));
        }
        return functionItem;
    }
}
