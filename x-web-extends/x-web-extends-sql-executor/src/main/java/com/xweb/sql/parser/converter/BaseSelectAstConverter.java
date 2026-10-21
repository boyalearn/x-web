package com.xweb.sql.parser.converter;

import com.xweb.sql.core.common.BooleanExpression;
import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.Table;
import com.xweb.sql.core.common.expression.BetweenAndExpression;
import com.xweb.sql.core.common.expression.CommonConditionExpression;
import com.xweb.sql.core.common.expression.ConcatenationExpression;
import com.xweb.sql.core.common.expression.PriorityExpression;
import com.xweb.sql.core.common.item.ConstantItem;
import com.xweb.sql.core.common.item.SelectAllItem;
import com.xweb.sql.core.common.item.TableColumnItem;
import com.xweb.sql.core.common.select.BaseSelect;
import com.xweb.sql.core.common.table.SimpleTable;
import com.xweb.sql.meta.Node;
import com.xweb.sql.meta.select.SimpleSelect;
import com.xweb.sql.meta.expression.ColumnValueExpression;
import com.xweb.sql.meta.expression.ComplexBoolExpression;
import com.xweb.sql.meta.expression.PriorityBooleanExpression;
import com.xweb.sql.meta.expression.TableAssociationExpression;
import com.xweb.sql.meta.node.StarColumnNode;
import com.xweb.sql.meta.node.ColumnNode;
import com.xweb.sql.meta.node.ConstantNode;
import com.xweb.sql.meta.table.SimpleTableNode;
import com.xweb.sql.parser.converter.util.NodeUtil;

import java.util.ArrayList;
import java.util.List;

public class BaseSelectAstConverter implements AstConverter {
    @Override
    public Node convert(Item item) {
        BaseSelect baseSelect = (BaseSelect) item;
        SimpleSelect select = new SimpleSelect();
        final List<Item> selectItems = baseSelect.getSelectItems();
        select.setSelectItems(new ArrayList<>());
        for (Item selectItem : selectItems) {
            if (selectItem instanceof TableColumnItem) {
                TableColumnItem tableColumnItem = (TableColumnItem) selectItem;
                ColumnNode column = new ColumnNode(new SimpleTableNode("", tableColumnItem.getTableName()), tableColumnItem.getColumnName());
                select.getSelectItems().add(column);
            } else if (selectItem instanceof SelectAllItem) {
                StarColumnNode starColumn = new StarColumnNode();
                select.getSelectItems().add(starColumn);
            }
        }
        List<Table> tableItems = baseSelect.getTableItems();
        select.setTableItems(new ArrayList<>());
        for (Table tableItem : tableItems) {
            if (tableItem instanceof SimpleTable) {
                SimpleTable simpleTable = (SimpleTable) tableItem;
                SimpleTableNode tableItemTemp = new SimpleTableNode(simpleTable.getTableName());
                tableItemTemp.setAlias(simpleTable.getAlias());
                select.getTableItems().add(tableItemTemp);
            }
        }

        BooleanExpression whereExpression = baseSelect.getWhereExpression();
        select.setWhereExpression((com.xweb.sql.meta.expression.BooleanExpression) NodeUtil.convert(whereExpression));
        return (Node) select;
    }

    private com.xweb.sql.meta.expression.BooleanExpression toExecutorBooleanExpression(com.xweb.sql.core.common.Item booleanExpression) {
        if (booleanExpression instanceof ConcatenationExpression) {
            ConcatenationExpression concatenationExpression = (ConcatenationExpression) booleanExpression;
            throw new RuntimeException();
        } else if (booleanExpression instanceof CommonConditionExpression) {
            CommonConditionExpression conditionExpression = (CommonConditionExpression) booleanExpression;
            com.xweb.sql.core.common.Item left = conditionExpression.getLeft();
            com.xweb.sql.core.common.Item right = conditionExpression.getRight();
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
            return new ComplexBoolExpression(toExecutorBooleanExpression(left), conditionExpression.getOp(), toExecutorBooleanExpression(right));
        } else if (booleanExpression instanceof PriorityExpression) {
            PriorityExpression priorityExpression = (PriorityExpression) booleanExpression;
            return new PriorityBooleanExpression(toExecutorBooleanExpression(priorityExpression.getExpression()));
        } else if (booleanExpression instanceof BetweenAndExpression) {
            return (com.xweb.sql.meta.expression.BooleanExpression) NodeUtil.convert(booleanExpression);
        } else {
            throw new RuntimeException();
        }
    }
}
