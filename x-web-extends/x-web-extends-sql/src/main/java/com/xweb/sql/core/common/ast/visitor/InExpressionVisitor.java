package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.ast.AstUtil;
import com.xweb.sql.core.common.expression.InExpression;

import java.util.List;

public class InExpressionVisitor implements AstVisitor{
    @Override
    public String visitor(Item item) {
        InExpression inExpression =(InExpression)item;
            StringBuffer sql = new StringBuffer();
            sql.append(AstUtil.toSql(inExpression.getLeft()));
            if (AstUtil.isNotEmpty(inExpression.getNot())) {
                sql.append(AstUtil.SPACE);
                sql.append(inExpression.getNot());
            }
            sql.append(AstUtil.SPACE);
            sql.append(inExpression.getIn());
            sql.append(AstUtil.LEFT_BRACKET);
            final List<Item> items = inExpression.getItems();
            for (int i = 0; i < items.size(); i++) {
                if (i != 0) {
                    sql.append(AstUtil.COMMA);
                }
                sql.append(AstUtil.toSql(items.get(i)));
            }
            sql.append(AstUtil.RIGHT_BRACKET);
            sql.append(AstUtil.toStringCommon(inExpression));
            return sql.toString();
    }
}
