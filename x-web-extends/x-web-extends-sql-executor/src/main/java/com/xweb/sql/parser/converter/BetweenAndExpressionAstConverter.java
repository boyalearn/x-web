package com.xweb.sql.parser.converter;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.expression.BetweenAndExpression;
import com.xweb.sql.core.common.item.TableColumnItem;
import com.xweb.sql.meta.Node;
import com.xweb.sql.meta.expression.BetweenAndNode;
import com.xweb.sql.meta.expression.ColumnValueNode;
import com.xweb.sql.meta.node.ColumnNode;
import com.xweb.sql.meta.table.SimpleTableNode;
import com.xweb.sql.parser.converter.util.NodeUtil;

import java.util.Optional;

public class BetweenAndExpressionAstConverter implements AstConverter {
    @Override
    public Node convert(Item item) {
        BetweenAndExpression betweenAndExpression = (BetweenAndExpression) item;
        final Item left = betweenAndExpression.getLeft();
        Item lower = betweenAndExpression.getLower();
        Item upper = betweenAndExpression.getUpper();
        if (left instanceof TableColumnItem) {
            TableColumnItem tableColumnItem = (TableColumnItem) left;
            ColumnNode column = new ColumnNode(new SimpleTableNode("", tableColumnItem.getTableName()), tableColumnItem.getColumnName());
            String op = Optional.ofNullable(betweenAndExpression.getNot()).isPresent() ? NodeUtil.NEQ : NodeUtil.EQ;
            BetweenAndNode betweenExpression = new BetweenAndNode(NodeUtil.convert(lower), NodeUtil.EGT, NodeUtil.convert(upper), NodeUtil.ELT);
            return new ColumnValueNode(column, op, betweenExpression);
        } else {
            throw new RuntimeException("未实现");
        }
    }
}
