package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.ast.AstUtil;
import com.xweb.sql.core.common.item.SelectAllItem;

public class SelectAllItemVisitor implements AstVisitor {
    @Override
    public String visitor(Item item) {
        SelectAllItem selectAllItem = (SelectAllItem) item;
        StringBuffer stringBuffer = new StringBuffer();
        if (AstUtil.isNotEmpty(selectAllItem.getTableName())) {
            stringBuffer.append(selectAllItem.getTableName() + AstUtil.DOT);
        }
        stringBuffer.append(selectAllItem.getColumnName());
        stringBuffer.append(AstUtil.toStringCommon(selectAllItem));
        return stringBuffer.toString();
    }
}
