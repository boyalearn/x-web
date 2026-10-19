package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.ast.AstUtil;
import com.xweb.sql.core.common.insert.SimpleInsert;

import java.util.List;
import java.util.Optional;

public class SimpleInsertVisitor implements AstVisitor{

    private AbstractInsertVisitor abstractInsertVisitor = new AbstractInsertVisitor();

    @Override
    public String visitor(Item item) {
        SimpleInsert simpleInsert =(SimpleInsert)item;
        StringBuffer sql = new StringBuffer();
        sql.append(abstractInsertVisitor.visitor(simpleInsert));
        sql.append(AstUtil.SPACE);
        sql.append(simpleInsert.getValues());
        sql.append(AstUtil.SPACE);
        final List<Item> values = simpleInsert.getValueItems();
        if (Optional.ofNullable(values).isPresent()) {
            sql.append(AstUtil.LEFT_BRACKET);
            for (int i = 0; i < values.size(); i++) {
                if (i != 0) {
                    sql.append(AstUtil.COMMA);
                }
                sql.append(AstUtil.toSql(values.get(i)));
            }
            sql.append(AstUtil.RIGHT_BRACKET);
        }
        return sql.toString();
    }
}
