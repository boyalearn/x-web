package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.ast.AstUtil;
import com.xweb.sql.core.common.table.UnionTableTable;

public class UnionTableItemVisitor implements AstVisitor{
    @Override
    public String visitor(Item item) {
        UnionTableTable.UnionTableItem unionTableItem =(UnionTableTable.UnionTableItem)item;
        StringBuffer sql = new StringBuffer();
        sql.append(unionTableItem.getUnion());
        if (AstUtil.isNotEmpty(unionTableItem.getAll())) {
            sql.append(AstUtil.SPACE);
            sql.append(unionTableItem.getAll());
        }
        sql.append(AstUtil.SPACE);
        sql.append(AstUtil.toSql(unionTableItem.getRight()));
        sql.append(AstUtil.toStringCommon(unionTableItem));
        return sql.toString();
    }
}
