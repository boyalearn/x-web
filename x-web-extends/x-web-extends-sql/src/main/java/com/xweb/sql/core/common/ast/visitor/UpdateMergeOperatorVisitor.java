package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.ast.AstUtil;
import com.xweb.sql.core.common.merge.UpdateMergeOperator;

import java.util.List;

public class UpdateMergeOperatorVisitor implements AstVisitor {
    @Override
    public String visitor(Item item) {
        UpdateMergeOperator updateMergeOperator = (UpdateMergeOperator) item;
        StringBuffer sql = new StringBuffer();
        sql.append(AstUtil.SPACE);
        sql.append(updateMergeOperator.getUpdate());
        if (AstUtil.isNotEmpty(updateMergeOperator.getKey())) {
            sql.append(AstUtil.SPACE);
            sql.append(updateMergeOperator.getKey());
        }
        sql.append(AstUtil.SPACE);
        sql.append(updateMergeOperator.getSet());
        final List<Item> updateItems = updateMergeOperator.getUpdateItems();
        for (int i = 0; i < updateItems.size(); i++) {
            if (i != 0) {
                sql.append(AstUtil.COMMA);
            } else {
                sql.append(AstUtil.SPACE);
            }
            sql.append(AstUtil.toSql(updateItems.get(i)));

        }
        return sql.toString();
    }
}
