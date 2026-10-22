package com.xweb.sql.parser.converter;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.order.DefaultOrderItem;
import com.xweb.sql.meta.Node;
import com.xweb.sql.meta.node.DefaultOrderNode;
import com.xweb.sql.parser.converter.util.NodeUtil;

public class DefaultOrderItemAstConverter implements AstConverter {
    @Override
    public Node convert(Item item) {
        DefaultOrderItem orderItem = (DefaultOrderItem) item;
        return new DefaultOrderNode(NodeUtil.convert(orderItem.getItem()),orderItem.getOrder());
    }
}
