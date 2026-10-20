package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.ast.AstUtil;
import com.xweb.sql.core.common.item.SubIndexItem;

import java.util.List;

public class SubIndexItemVisitor implements AstVisitor {
    @Override
    public String visitor(Item item) {
        SubIndexItem subIndexItem = (SubIndexItem) item;
        StringBuffer sql = new StringBuffer();
        sql.append(AstUtil.toSql(subIndexItem.getValue()));
        sql.append(AstUtil.LEFT_SQUARE_BRACKET);
        final List<Item> indexes = subIndexItem.getIndexes();
        for (int i = 0; i < indexes.size(); i++) {
            if (i != 0) {
                sql.append(AstUtil.COMMA);
            }
            sql.append(AstUtil.toSql(indexes.get(i)));
        }
        sql.append(AstUtil.RIGHT_SQUARE_BRACKET);
        sql.append(AstUtil.toStringCommon(subIndexItem));
        return sql.toString();
    }
}
