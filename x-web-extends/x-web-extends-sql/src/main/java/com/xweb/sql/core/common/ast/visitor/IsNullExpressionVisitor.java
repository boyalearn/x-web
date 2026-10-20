package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.ast.AstUtil;
import com.xweb.sql.core.common.expression.IsNullExpression;

public class IsNullExpressionVisitor implements AstVisitor {
    @Override
    public String visitor(Item item) {
        IsNullExpression isNullExpression = (IsNullExpression) item;
        StringBuffer sql = new StringBuffer();
        sql.append(AstUtil.toSql(isNullExpression.getLeft()));
        sql.append(AstUtil.SPACE);
        sql.append(isNullExpression.getIs());
        if (AstUtil.isNotEmpty(isNullExpression.getNot())) {
            sql.append(AstUtil.SPACE);
            sql.append(isNullExpression.getNot());
        }
        sql.append(AstUtil.SPACE);
        sql.append(isNullExpression.getNullName());
        sql.append(AstUtil.toStringCommon(isNullExpression));
        return sql.toString();
    }
}
