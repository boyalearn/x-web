package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.ast.AstUtil;
import com.xweb.sql.core.common.item.FunctionCallItem;

import java.util.List;

public class FunctionCallItemVisitor implements AstVisitor {
    @Override
    public String visitor(Item item) {
        FunctionCallItem functionCallItem = (FunctionCallItem) item;
        StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append(functionCallItem.getName()).append(AstUtil.LEFT_BRACKET);
        final List<Item> params = functionCallItem.getParams();
        for (int i = 0; i < params.size(); i++) {
            if (i != 0) {
                stringBuffer.append(AstUtil.COMMA);
            }
            stringBuffer.append(AstUtil.toSql(params.get(i)));
        }
        stringBuffer.append(AstUtil.RIGHT_BRACKET);
        stringBuffer.append(AstUtil.toStringCommon(functionCallItem));
        return stringBuffer.toString();
    }
}
