package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.ast.AstUtil;
import com.xweb.sql.core.common.insert.AbstractInsert;

import java.util.List;
import java.util.Optional;

public class AbstractInsertVisitor implements AstVisitor {
    @Override
    public String visitor(Item item) {
        AbstractInsert abstractInsert = (AbstractInsert) item;
        StringBuilder sql = new StringBuilder();
        sql.append(abstractInsert.getInsert());
        sql.append(AstUtil.SPACE);
        sql.append(abstractInsert.getInto());
        sql.append(AstUtil.SPACE);
        sql.append(abstractInsert.getTable());
        if (Optional.ofNullable(abstractInsert.getColumns()).isPresent()) {
            sql.append(AstUtil.SPACE);
            sql.append(AstUtil.LEFT_BRACKET);
            final List<Item> columns = abstractInsert.getColumns();
            for (int i = 0; i < columns.size(); i++) {
                if (i != 0) {
                    sql.append(AstUtil.COMMA);
                }
                sql.append(AstUtil.toSql(columns.get(i)));
            }

            sql.append(AstUtil.RIGHT_BRACKET);
        }
        return sql.toString();
    }
}
