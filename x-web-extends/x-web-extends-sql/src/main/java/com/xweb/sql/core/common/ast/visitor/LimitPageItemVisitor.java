package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.ast.AstUtil;
import com.xweb.sql.core.common.page.LimitPageItem;

import java.util.List;

public class LimitPageItemVisitor implements AstVisitor{
    @Override
    public String visitor(Item item) {
        LimitPageItem limitPageItem=(LimitPageItem)item;
        StringBuffer sql = new StringBuffer();
        sql.append(limitPageItem.getLimit());
        final List<Item> limitItems = limitPageItem.getLimitItems();
        sql.append(AstUtil.SPACE);
        sql.append(visit(limitItems));
        return sql.toString();
    }

    public String visit(List<Item> items) {
        StringBuffer sql = new StringBuffer();
        for (int i = 0; i < items.size(); i++) {
            if (i != 0) {
                sql.append(AstUtil.COMMA);
            }
            sql.append(AstUtil.toSql(items.get(i)));
        }
        return sql.toString();
    }
}
