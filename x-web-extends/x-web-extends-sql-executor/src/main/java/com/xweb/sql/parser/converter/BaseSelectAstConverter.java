package com.xweb.sql.parser.converter;

import com.xweb.sql.core.common.BooleanExpression;
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
import com.xweb.sql.meta.Item;
import com.xweb.sql.meta.SimpleSelect;
import com.xweb.sql.meta.expression.ColumnValueExpression;
import com.xweb.sql.meta.expression.ComplexBoolExpression;
import com.xweb.sql.meta.expression.PriorityBooleanExpression;
import com.xweb.sql.meta.expression.TableAssociationExpression;
import com.xweb.sql.meta.item.AllColumnItem;
import com.xweb.sql.meta.item.Column;
import com.xweb.sql.meta.item.Constant;
import com.xweb.sql.meta.item.SimpleTableItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BaseSelectAstConverter implements AstConverter {
    @Override
    public Item convert(com.xweb.sql.core.common.Item item) {

        BaseSelect baseSelect = (BaseSelect) item;
        SimpleSelect select = new SimpleSelect();
        final List<com.xweb.sql.core.common.Item> selectItems = baseSelect.getSelectItems();
        select.setSelectItems(new ArrayList<>());
        for (com.xweb.sql.core.common.Item selectItem : selectItems) {
            if (selectItem instanceof TableColumnItem) {
                TableColumnItem tableColumnItem = (TableColumnItem) selectItem;
                Column column = new Column(new SimpleTableItem("", tableColumnItem.getTableName()), tableColumnItem.getColumnName());
                select.getSelectItems().add(column);
            } else if (selectItem instanceof SelectAllItem) {
                AllColumnItem allColumnItem = new AllColumnItem();
                select.getSelectItems().add(allColumnItem);
            }
        }
        List<Table> tableItems = baseSelect.getTableItems();
        select.setTableItems(new ArrayList<>());
        for (Table tableItem : tableItems) {
            if (tableItem instanceof SimpleTable) {
                SimpleTable simpleTable = (SimpleTable) tableItem;
                SimpleTableItem tableItemTemp = new SimpleTableItem(simpleTable.getTableName());
                tableItemTemp.setAlias(simpleTable.getAlias());
                select.getTableItems().add(tableItemTemp);
            }
        }

        BooleanExpression whereExpression = baseSelect.getWhereExpression();
        select.setWhereExpression(toExecutorBooleanExpression(whereExpression));
        return select;
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
                Column leftColumn = new Column(new SimpleTableItem("", leftTableColumnItem.getTableName()), leftTableColumnItem.getColumnName());
                Column rightColumn = new Column(new SimpleTableItem("", rightTableColumnItem.getTableName()), rightTableColumnItem.getColumnName());
                return new TableAssociationExpression(leftColumn, conditionExpression.getOp(), rightColumn);
            } else if (left instanceof TableColumnItem && right instanceof ConstantItem) {
                TableColumnItem leftTableColumnItem = (TableColumnItem) left;
                ConstantItem constantItem = (ConstantItem) right;
                Column leftColumn = new Column(new SimpleTableItem("", leftTableColumnItem.getTableName()), leftTableColumnItem.getColumnName());
                return new ColumnValueExpression(leftColumn, conditionExpression.getOp(), new Constant(constantItem.getConstant()));
            }
            return new ComplexBoolExpression(toExecutorBooleanExpression(left), conditionExpression.getOp(), toExecutorBooleanExpression(right));
        } else if (booleanExpression instanceof PriorityExpression) {
            PriorityExpression priorityExpression = (PriorityExpression) booleanExpression;
            return new PriorityBooleanExpression(toExecutorBooleanExpression(priorityExpression.getExpression()));
        } else if (booleanExpression instanceof BetweenAndExpression) {
            BetweenAndExpression betweenAndExpression = (BetweenAndExpression) booleanExpression;
            final com.xweb.sql.core.common.Item left = betweenAndExpression.getLeft();
            if (left instanceof TableColumnItem) {
                TableColumnItem tableColumnItem = (TableColumnItem) left;
                Column column = new Column(new SimpleTableItem("", tableColumnItem.getAlias()), tableColumnItem.getColumnName());

                return new ColumnValueExpression(column,
                        Optional.ofNullable(betweenAndExpression.getNot()).isPresent() ? "=" : "!=",
                        new com.xweb.sql.meta.expression.BetweenAndExpression(null, null, null, null));
            }
            throw new RuntimeException();

        } else {
            throw new RuntimeException();
        }
    }
}
