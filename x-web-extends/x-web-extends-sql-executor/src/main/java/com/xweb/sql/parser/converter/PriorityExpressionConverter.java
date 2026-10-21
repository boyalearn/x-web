package com.xweb.sql.parser.converter;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.expression.PriorityExpression;
import com.xweb.sql.meta.Node;
import com.xweb.sql.meta.common.BooleanNode;
import com.xweb.sql.meta.expression.PriorityBooleanNode;
import com.xweb.sql.parser.converter.util.NodeUtil;

public class PriorityExpressionConverter implements AstConverter{
    @Override
    public Node convert(Item item) {
        PriorityExpression priorityExpression = (PriorityExpression)item;
        return new PriorityBooleanNode((BooleanNode) NodeUtil.convert(priorityExpression.getExpression()));
    }
}
