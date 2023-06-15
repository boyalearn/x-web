package com.xweb.mybatis.sql.condition;

import net.sf.jsqlparser.expression.BinaryExpression;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.statement.select.PlainSelect;

public class BinaryExpressionConditionVisitor implements ConditionVisitor {
    @Override
    public void modifyTable(Expression expression, PlainSelect plainSelect) {
        BinaryExpression binaryExpression = (BinaryExpression) expression;
        Expression leftExpression = binaryExpression.getLeftExpression();
        ConditionUtil.replaceConditionTable(plainSelect, leftExpression);
        Expression rightExpression = binaryExpression.getRightExpression();
        ConditionUtil.replaceConditionTable(plainSelect, rightExpression);
    }
}
