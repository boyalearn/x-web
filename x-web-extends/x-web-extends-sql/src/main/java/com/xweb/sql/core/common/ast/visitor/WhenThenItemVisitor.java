package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.ast.AstUtil;
import com.xweb.sql.core.common.item.WhenThenItem;

public class WhenThenItemVisitor implements AstVisitor {
    @Override
    public String visitor(Item item) {
        WhenThenItem whenThenItem = (WhenThenItem) item;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(whenThenItem.getWhen());
        stringBuffer.append(AstUtil.toSql(whenThenItem.getCondition()));
        stringBuffer.append(whenThenItem.getThen());
        stringBuffer.append(AstUtil.toSql((Item) whenThenItem.getResult()));
        stringBuffer.append(AstUtil.toStringCommon(whenThenItem));
        return stringBuffer.toString();
    }
}
