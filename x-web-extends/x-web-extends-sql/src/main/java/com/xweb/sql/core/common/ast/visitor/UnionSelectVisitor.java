package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.ast.AstUtil;
import com.xweb.sql.core.common.item.UnionSelectItem;
import com.xweb.sql.core.common.select.UnionSelect;

import java.util.List;

public class UnionSelectVisitor implements AstVisitor {
    @Override
    public String visitor(Item item) {
        UnionSelect unionSelect = (UnionSelect) item;
        StringBuffer sql = new StringBuffer();
        sql.append(AstUtil.toSql(unionSelect.getSelect()));
        final List<UnionSelectItem> unionSelectItems = unionSelect.getUnionSelectItems();
        for (UnionSelectItem unionSelectItem : unionSelectItems) {
            sql.append(AstUtil.SPACE);
            sql.append(AstUtil.toSql(unionSelectItem));
        }
        return sql.toString();
    }
}
