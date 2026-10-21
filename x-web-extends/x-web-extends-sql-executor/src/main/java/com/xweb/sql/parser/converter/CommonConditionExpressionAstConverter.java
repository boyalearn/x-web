package com.xweb.sql.parser.converter;


import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.expression.CommonConditionExpression;
import com.xweb.sql.core.common.item.TableColumnItem;
import com.xweb.sql.meta.Node;
import com.xweb.sql.meta.common.BooleanNode;
import com.xweb.sql.meta.expression.ColumnValueNode;
import com.xweb.sql.meta.expression.ComplexBoolNode;
import com.xweb.sql.meta.expression.TableAssociationNode;
import com.xweb.sql.meta.node.ColumnNode;
import com.xweb.sql.parser.converter.util.NodeUtil;

public class CommonConditionExpressionAstConverter implements AstConverter{
    @Override
    public Node convert(Item item) {
        CommonConditionExpression conditionExpression = (CommonConditionExpression) item;
        Item left = conditionExpression.getLeft();
        Item right = conditionExpression.getRight();
        if (isTableAssociationNode(left,right)) {
            return createTableAssociationNode(left,conditionExpression.getOp(),right);
        } else if (isColumnValueNode(left,right)) {
            return createColumnValueNode(left,conditionExpression.getOp(),right);
        }else{
            return new ComplexBoolNode((BooleanNode) NodeUtil.convert(left),
                    conditionExpression.getOp(), (BooleanNode) NodeUtil.convert(right));
        }
    }

    private final  boolean isColumnValueNode(Item left ,Item right){
        return left instanceof TableColumnItem || right instanceof TableColumnItem;
    }

    private final  ColumnValueNode createColumnValueNode(Item left ,String op,Item right){
        if(left instanceof TableColumnItem){
            return new ColumnValueNode((ColumnNode) NodeUtil.convert(left), op, NodeUtil.convert(right));
        }else{
            return new ColumnValueNode((ColumnNode) NodeUtil.convert(right), op, NodeUtil.convert(left));
        }
    }

    private final boolean isTableAssociationNode(Item left ,Item right){
        return left instanceof TableColumnItem && right instanceof TableColumnItem;
    }

    private final TableAssociationNode createTableAssociationNode(Item left,String op ,Item right){
      return new TableAssociationNode((ColumnNode)NodeUtil.convert(left), op, (ColumnNode)NodeUtil.convert(right));
    }


}
