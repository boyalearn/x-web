package com.xweb.sql.parser.converter;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.expression.PriorityExpression;
import com.xweb.sql.meta.Node;
import com.xweb.sql.meta.common.BooleanNode;
import com.xweb.sql.meta.expression.PriorityBooleanNode;
import com.xweb.sql.meta.expression.PriorityNode;
import com.xweb.sql.parser.converter.util.NodeUtil;

public class PriorityExpressionConverter implements AstConverter{
    @Override
    public Node convert(Item item) {
        PriorityExpression priorityExpression = (PriorityExpression)item;
        final Node node = NodeUtil.convert(priorityExpression.getExpression());
        if(node instanceof BooleanNode){
            return new PriorityBooleanNode((BooleanNode) node);
        }
        return new PriorityNode(node);
    }
}
