package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.ast.AstUtil;
import com.xweb.sql.core.common.expression.BetweenAndExpression;

public class BetweenAndExpressionVisitor implements AstVisitor{
    @Override
    public String visitor(Item item) {
        BetweenAndExpression betweenAndExpression =(BetweenAndExpression)item;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(AstUtil.toSql(betweenAndExpression.getLeft()));
        if (AstUtil.isNotEmpty(betweenAndExpression.getNot())) {
            stringBuffer.append(betweenAndExpression.getNot());
        }
        stringBuffer.append(betweenAndExpression.getBetween());
        stringBuffer.append(AstUtil.toSql(betweenAndExpression.getLower()));

        stringBuffer.append(betweenAndExpression.getAnd());
        stringBuffer.append(AstUtil.toSql(betweenAndExpression.getUpper()));
        return stringBuffer.toString();
    }
}
