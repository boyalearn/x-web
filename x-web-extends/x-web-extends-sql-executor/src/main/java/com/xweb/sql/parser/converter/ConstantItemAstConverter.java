package com.xweb.sql.parser.converter;

import com.xweb.sql.core.common.item.ConstantItem;
import com.xweb.sql.meta.Item;
import com.xweb.sql.meta.item.Constant;

public class ConstantItemAstConverter implements AstConverter {
    @Override
    public Item convert(com.xweb.sql.core.common.Item item) {
        ConstantItem constantItem = (ConstantItem) item;
        return new Constant(constantItem.getConstant());
    }
}
