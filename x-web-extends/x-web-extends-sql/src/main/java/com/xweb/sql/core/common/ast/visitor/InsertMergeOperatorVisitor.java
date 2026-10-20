package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.ast.AstUtil;
import com.xweb.sql.core.common.merge.InsertMergeOperator;

import java.util.List;
import java.util.Optional;

public class InsertMergeOperatorVisitor implements AstVisitor {
    @Override
    public String visitor(Item item) {
        InsertMergeOperator insertMergeOperator = (InsertMergeOperator) item;
        StringBuffer sql = new StringBuffer();
        sql.append(AstUtil.SPACE);
        sql.append(insertMergeOperator.getInsert());
        if (AstUtil.isNotEmpty(insertMergeOperator.getTable())) {
            sql.append(AstUtil.SPACE);
            sql.append(insertMergeOperator.getTable());
        }
        sql.append(AstUtil.SPACE);
        final List<Item> columnItems = insertMergeOperator.getColumnItems();
        if (Optional.ofNullable(columnItems).isPresent() && !columnItems.isEmpty()) {
            sql.append(AstUtil.LEFT_BRACKET);
            for (int i = 0; i < columnItems.size(); i++) {
                if (i != 0) {
                    sql.append(AstUtil.COMMA);
                }
                sql.append(AstUtil.toSql(columnItems.get(i)));
            }
            sql.append(AstUtil.RIGHT_BRACKET);
        }
        if (AstUtil.isNotEmpty(insertMergeOperator.getValues())) {
            sql.append(insertMergeOperator.getValues());
        }
        final List<Item> valueItems = insertMergeOperator.getValueItems();
        if (Optional.ofNullable(valueItems).isPresent()) {
            sql.append(AstUtil.LEFT_BRACKET);
            for (int i = 0; i < valueItems.size(); i++) {
                if (i != 0) {
                    sql.append(AstUtil.COMMA);
                }
                sql.append(AstUtil.toSql(valueItems.get(i)));
            }
            sql.append(AstUtil.RIGHT_BRACKET);
        }
        return sql.toString();
    }
}
