package com.xweb.sql.parser.converter;


import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.expression.CommonConditionExpression;
import com.xweb.sql.core.common.item.ConstantItem;
import com.xweb.sql.core.common.item.TableColumnItem;
import com.xweb.sql.meta.Node;
import com.xweb.sql.meta.expression.BooleanExpression;
import com.xweb.sql.meta.expression.ColumnValueExpression;
import com.xweb.sql.meta.expression.ComplexBoolExpression;
import com.xweb.sql.meta.expression.TableAssociationExpression;
import com.xweb.sql.meta.node.ColumnNode;
import com.xweb.sql.meta.node.ConstantNode;
import com.xweb.sql.meta.table.SimpleTableNode;
import com.xweb.sql.parser.converter.util.NodeUtil;

public class CommonConditionExpressionAstConverter implements AstConverter{
    @Override
    public Node convert(Item item) {
        CommonConditionExpression conditionExpression = (CommonConditionExpression) item;
        Item left = conditionExpression.getLeft();
        Item right = conditionExpression.getRight();
        if (left instanceof TableColumnItem && right instanceof TableColumnItem) {
            TableColumnItem leftTableColumnItem = (TableColumnItem) left;
            TableColumnItem rightTableColumnItem = (TableColumnItem) right;
            ColumnNode leftColumn = new ColumnNode(new SimpleTableNode("", leftTableColumnItem.getTableName()), leftTableColumnItem.getColumnName());
            ColumnNode rightColumn = new ColumnNode(new SimpleTableNode("", rightTableColumnItem.getTableName()), rightTableColumnItem.getColumnName());
            return new TableAssociationExpression(leftColumn, conditionExpression.getOp(), rightColumn);
        } else if (left instanceof TableColumnItem && right instanceof ConstantItem) {
            TableColumnItem leftTableColumnItem = (TableColumnItem) left;
            ConstantItem constantItem = (ConstantItem) right;
            ColumnNode leftColumn = new ColumnNode(new SimpleTableNode("", leftTableColumnItem.getTableName()), leftTableColumnItem.getColumnName());
            return new ColumnValueExpression(leftColumn, conditionExpression.getOp(), new ConstantNode(constantItem.getConstant()));
        }

        return new ComplexBoolExpression((BooleanExpression) NodeUtil.convert(left), conditionExpression.getOp(), (BooleanExpression) NodeUtil.convert(right));

    }
}
