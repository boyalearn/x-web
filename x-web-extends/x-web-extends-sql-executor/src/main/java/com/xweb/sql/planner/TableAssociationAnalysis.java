package com.xweb.sql.planner;

import com.xweb.sql.meta.expression.BooleanExpression;
import com.xweb.sql.meta.expression.ColumnValueExpression;
import com.xweb.sql.meta.expression.ComplexBoolExpression;
import com.xweb.sql.meta.expression.TableAssociationExpression;
import com.xweb.sql.meta.item.Column;
import com.xweb.sql.meta.item.SimpleTableItem;

import java.util.ArrayList;
import java.util.List;

public class TableAssociationAnalysis {

    public static List<TableAssociationExpression> analysis(SimpleTableItem tableA, SimpleTableItem tableB, BooleanExpression booleanExpression) {
        List<TableAssociationExpression> list = new ArrayList<>();
        if (booleanExpression instanceof ComplexBoolExpression) {
            ComplexBoolExpression complexBoolExpression = (ComplexBoolExpression) booleanExpression;
            BooleanExpression left = complexBoolExpression.getLeft();
            list.addAll(analysis(tableA, tableB, left));
            BooleanExpression right = complexBoolExpression.getRight();
            list.addAll(analysis(tableA, tableB, right));
        } else if (booleanExpression instanceof TableAssociationExpression) {
            TableAssociationExpression tableAssociationExpression = (TableAssociationExpression) booleanExpression;
            Column left = tableAssociationExpression.getLeft();
            left.getTable().setName(LogicPlannerContext.getTableNameByAlias(left.getTable().getAlias()));
            Column right = tableAssociationExpression.getRight();
            right.getTable().setName(LogicPlannerContext.getTableNameByAlias(right.getTable().getAlias()));
            if (left.getTable().getAlias().equals(tableA.getAlias()) && right.getTable().getAlias().equals(tableB.getAlias())) {
                TableAssociationExpression newTableAssociationExpression = new TableAssociationExpression(left, tableAssociationExpression.getOp(), right);
                list.add(newTableAssociationExpression);
                return list;
            } else if (left.getTable().getAlias().equals(tableB.getAlias()) && right.getTable().getAlias().equals(tableA.getAlias())) {
                TableAssociationExpression newTableAssociationExpression = new TableAssociationExpression(right, tableAssociationExpression.getOp(), left);
                list.add(newTableAssociationExpression);
                return list;
            }
        } else if (booleanExpression instanceof ColumnValueExpression) {
            ColumnValueExpression columnValueExpression = (ColumnValueExpression) booleanExpression;
            SimpleTableItem table = columnValueExpression.getColumn().getTable();
            table.setName(LogicPlannerContext.getTableNameByAlias(table.getAlias()));
            return list;
        }

        return list;
    }

}
