package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.ast.AstUtil;
import com.xweb.sql.core.common.insert.OnDuplicateInsert;

import java.util.List;

public class OnDuplicateInsertVisitor implements AstVisitor{
    @Override
    public String visitor(Item item) {
        OnDuplicateInsert onDuplicateInsert =(OnDuplicateInsert)item;
        StringBuffer sql = new StringBuffer();
        sql.append(AstUtil.toSql(onDuplicateInsert.getInsert()));
        sql.append(AstUtil.SPACE);
        sql.append(onDuplicateInsert.getOn());
        sql.append(AstUtil.SPACE);
        sql.append(onDuplicateInsert.getDuplicate());
        sql.append(AstUtil.SPACE);
        sql.append(onDuplicateInsert.getKey());
        sql.append(AstUtil.SPACE);
        sql.append(onDuplicateInsert.getUpdate());
        sql.append(AstUtil.SPACE);
        final List<Item> updateColumns = onDuplicateInsert.getUpdateColumns();
        for (int i = 0; i < updateColumns.size(); i++) {
            if (i != 0) {
                sql.append(AstUtil.COMMA);
            }
            sql.append(AstUtil.toSql(updateColumns.get(i)));
        }
        return sql.toString();
    }
}
