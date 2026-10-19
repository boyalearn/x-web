package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.ast.AstUtil;
import com.xweb.sql.core.common.expression.CommonConditionExpression;

public class CommonConditionExpressionVisitor implements AstVisitor{
    @Override
    public String visitor(Item item) {
        CommonConditionExpression conditionExpression =(CommonConditionExpression)item;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(AstUtil.toSql(conditionExpression.getLeft()));
        stringBuffer.append(AstUtil.SPACE + conditionExpression.getOp() + AstUtil.SPACE);
        stringBuffer.append(AstUtil.toSql(conditionExpression.getRight()));
        stringBuffer.append(AstUtil.toStringCommon(conditionExpression));
        return stringBuffer.toString();
    }
}
