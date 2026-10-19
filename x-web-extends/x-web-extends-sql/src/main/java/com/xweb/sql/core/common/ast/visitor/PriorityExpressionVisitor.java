package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.ast.AstUtil;
import com.xweb.sql.core.common.expression.PriorityExpression;

public class PriorityExpressionVisitor implements AstVisitor{
    @Override
    public String visitor(Item item) {
        PriorityExpression priorityExpression =(PriorityExpression)item;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(AstUtil.LEFT_BRACKET);
        stringBuffer.append(AstUtil.toSql(priorityExpression.getExpression()));
        stringBuffer.append(AstUtil.RIGHT_BRACKET);
        stringBuffer.append(AstUtil.toStringCommon((Item) priorityExpression));
        return stringBuffer.toString();
    }
}
