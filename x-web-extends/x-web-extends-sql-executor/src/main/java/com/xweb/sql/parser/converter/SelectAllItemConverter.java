package com.xweb.sql.parser.converter;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.meta.Node;
import com.xweb.sql.meta.node.StarColumnNode;

public class SelectAllItemConverter implements AstConverter{
    @Override
    public Node convert(Item item) {
        return new StarColumnNode();
    }
}
