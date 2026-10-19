package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.ast.AstUtil;
import com.xweb.sql.core.common.expression.ArithmeticExpression;

public class ArithmeticExpressionVisitor implements AstVisitor{
    @Override
    public String visitor(Item item) {
        ArithmeticExpression arithmeticExpression =(ArithmeticExpression)item;
        StringBuffer sql = new StringBuffer();
        sql.append(AstUtil.toSql(arithmeticExpression.getLeft()));
        sql.append(AstUtil.SPACE);
        sql.append(arithmeticExpression.getOperator());
        sql.append(AstUtil.SPACE);
        sql.append(AstUtil.toSql(arithmeticExpression.getRight()));
        sql.append(AstUtil.toStringCommon(arithmeticExpression));
        return sql.toString();
    }
}
