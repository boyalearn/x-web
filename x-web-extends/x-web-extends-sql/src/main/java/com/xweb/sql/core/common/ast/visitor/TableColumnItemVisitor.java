package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.ast.AstUtil;
import com.xweb.sql.core.common.item.TableColumnItem;

public class TableColumnItemVisitor implements AstVisitor{
    @Override
    public String visitor(Item item) {
        TableColumnItem tableColumnItem =(TableColumnItem)item;
        StringBuffer stringBuffer = new StringBuffer();
        if (AstUtil.isNotEmpty(tableColumnItem.getTableName())) {
            stringBuffer.append(tableColumnItem.getTableName() + AstUtil.DOT);
        }
        stringBuffer.append(tableColumnItem.getColumnName());
        stringBuffer.append(AstUtil.toStringCommon(tableColumnItem));
        return stringBuffer.toString();
    }
}
