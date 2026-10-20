package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.ast.AstUtil;
import com.xweb.sql.core.common.item.ConstantItem;

public class ConstantItemVisitor implements AstVisitor {
    @Override
    public String visitor(Item item) {
        ConstantItem constantItem = (ConstantItem) item;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(constantItem.getConstant());
        stringBuffer.append(AstUtil.toStringCommon(constantItem));
        return stringBuffer.toString();
    }
}
