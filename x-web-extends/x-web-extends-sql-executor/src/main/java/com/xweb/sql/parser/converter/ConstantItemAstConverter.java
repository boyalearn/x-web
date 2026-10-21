package com.xweb.sql.parser.converter;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.item.ConstantItem;
import com.xweb.sql.meta.Node;
import com.xweb.sql.meta.node.ConstantNode;

public class ConstantItemAstConverter implements AstConverter {
    @Override
    public Node convert(Item item) {
        ConstantItem constantItem = (ConstantItem) item;
        return new ConstantNode(constantItem.getConstant());
    }
}
