package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.ast.AstUtil;
import com.xweb.sql.core.common.table.UnionTableTable;

import java.util.List;

public class UnionTableTableVisitor implements AstVisitor{
    @Override
    public String visitor(Item item) {
        UnionTableTable unionTableTable =(UnionTableTable)item;
        StringBuffer sql = new StringBuffer();
        sql.append(AstUtil.toSql(unionTableTable.getLeft()));
        sql.append(AstUtil.SPACE);
        final List<UnionTableTable.UnionTableItem> unionTableItems = unionTableTable.getUnionTableItems();
        for (UnionTableTable.UnionTableItem unionTableItem : unionTableItems) {
            sql.append(AstUtil.SPACE);
            sql.append(AstUtil.toSql(unionTableItem));
        }
        sql.append(AstUtil.SPACE);
        sql.append(AstUtil.toStringCommon((Item) unionTableTable));
        return sql.toString();
    }
}
