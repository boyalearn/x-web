package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.ast.AstUtil;
import com.xweb.sql.core.common.order.DefaultOrderItem;

public class DefaultOrderItemVisitor implements AstVisitor {
    @Override
    public String visitor(Item item) {
        DefaultOrderItem defaultOrderItem = (DefaultOrderItem) item;
        StringBuffer sql = new StringBuffer();
        sql.append(AstUtil.toSql(defaultOrderItem.getItem()));
        if (AstUtil.isNotEmpty(defaultOrderItem.getOrder())) {
            sql.append(AstUtil.SPACE);
            sql.append(defaultOrderItem.getOrder());
        }
        return sql.toString();
    }
}
