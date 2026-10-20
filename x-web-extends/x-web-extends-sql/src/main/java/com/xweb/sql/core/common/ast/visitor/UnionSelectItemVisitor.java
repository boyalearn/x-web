package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.ast.AstUtil;
import com.xweb.sql.core.common.item.UnionSelectItem;

public class UnionSelectItemVisitor implements AstVisitor {
    @Override
    public String visitor(Item item) {
        UnionSelectItem unionSelectItem = (UnionSelectItem) item;
        StringBuffer sql = new StringBuffer();
        sql.append(unionSelectItem.getUnion());
        if (AstUtil.isNotEmpty(unionSelectItem.getAll())) {
            sql.append(AstUtil.SPACE);
            sql.append(unionSelectItem.getAll());
        }
        sql.append(AstUtil.SPACE);
        sql.append(AstUtil.toSql(unionSelectItem.getSelect()));
        return sql.toString();
    }
}
