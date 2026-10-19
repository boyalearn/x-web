package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.ast.AstUtil;
import com.xweb.sql.core.common.expression.LikeExpression;

public class LikeExpressionVisitor implements AstVisitor{
    @Override
    public String visitor(Item item) {
        LikeExpression likeExpression =(LikeExpression)item;
        StringBuffer sql = new StringBuffer();
        sql.append(AstUtil.toSql(likeExpression.getLeft()));
        sql.append(AstUtil.SPACE);
        if (AstUtil.isNotEmpty(likeExpression.getNot())) {
            sql.append(AstUtil.SPACE);
            sql.append(likeExpression.getNot());
        }
        sql.append(likeExpression.getLike());
        sql.append(AstUtil.SPACE);
        sql.append(AstUtil.toSql(likeExpression.getPattern()));
        sql.append(AstUtil.SPACE);
        sql.append(AstUtil.toStringCommon(likeExpression));
        return sql.toString();
    }
}
