package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.ast.AstUtil;
import com.xweb.sql.core.common.update.SimpleUpdate;

import java.util.List;
import java.util.Optional;

public class SimpleUpdateVisitor implements AstVisitor{
    @Override
    public String visitor(Item item) {
        SimpleUpdate simpleUpdate = (SimpleUpdate)item;
        StringBuffer sql = new StringBuffer();
        sql.append(simpleUpdate.getUpdate());
        sql.append(AstUtil.SPACE);
        sql.append(simpleUpdate.getTable());
        sql.append(AstUtil.SPACE);
        sql.append(simpleUpdate.getSet());
        if (Optional.ofNullable(simpleUpdate.getUpdateItems()).isPresent()) {
            sql.append(AstUtil.SPACE);
            final List<Item> updateItems = simpleUpdate.getUpdateItems();
            for (int i = 0; i < updateItems.size(); i++) {
                if (i != 0) {
                    sql.append(AstUtil.COMMA);
                }
                sql.append(AstUtil.toSql(updateItems.get(i)));
            }
        }
        if (Optional.ofNullable(simpleUpdate.getWhere()).isPresent()) {
            sql.append(AstUtil.SPACE);
            sql.append(simpleUpdate.getWhere());
            sql.append(AstUtil.SPACE);
            sql.append(AstUtil.toSql(simpleUpdate.getWhereExpression()));
        }
        return sql.toString();
    }
}
