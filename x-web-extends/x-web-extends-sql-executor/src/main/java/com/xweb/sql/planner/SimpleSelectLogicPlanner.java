package com.xweb.sql.planner;

import com.xweb.sql.meta.Node;
import com.xweb.sql.meta.common.BooleanNode;
import com.xweb.sql.meta.common.OrderNode;
import com.xweb.sql.meta.common.TableNode;
import com.xweb.sql.meta.node.ColumnNode;
import com.xweb.sql.meta.select.SimpleSelect;
import com.xweb.sql.operator.FilterOperator;
import com.xweb.sql.operator.GroupOperator;
import com.xweb.sql.operator.JoinTableOperator;
import com.xweb.sql.operator.OrderOperator;
import com.xweb.sql.operator.ProjectOperator;
import com.xweb.sql.operator.SqlOperator;
import com.xweb.sql.operator.TableScanOperator;
import com.xweb.sql.operator.calculator.CalculatorAnalysis;

import java.util.List;
import java.util.Optional;

public class SimpleSelectLogicPlanner implements SqlPlanner {

    private static TableItemLogicPlanner tableItemLogicPlanner = new TableItemLogicPlanner();

    public SqlOperator plan(SimpleSelect simpleSelect) {
        List<TableNode> tableItems = simpleSelect.getTableItems();
        final List<Node> selectItems = simpleSelect.getSelectItems();
        if (tableItems.isEmpty()) {
            return new ProjectOperator(selectItems, null);
        }
        SqlOperator operator = planTables(simpleSelect);

        BooleanNode whereExpression = simpleSelect.getWhereExpression();
        if (Optional.ofNullable(whereExpression).isPresent()) {
            final FilterOperator filterOperator = new FilterOperator(operator);
            CalculatorAnalysis.setCalculator(filterOperator, simpleSelect.getWhereExpression());
            operator = filterOperator;
        }
        for (Node selectItem : selectItems) {
            if (selectItem instanceof ColumnNode) {
                ColumnNode column = (ColumnNode) selectItem;
                column.getTable().setName(LogicPlannerContext.getTableNameByAlias(column.getTable().getAlias()));
            }
        }
        final List<Node> groupItems = simpleSelect.getGroupItems();
        final List<OrderNode> orderItems = simpleSelect.getOrderItems();
        if (Optional.ofNullable(groupItems).isPresent() && !groupItems.isEmpty()) {
            operator = new GroupOperator(operator, selectItems, groupItems);
            if (Optional.ofNullable(orderItems).isPresent() && !orderItems.isEmpty()) {
                operator = new OrderOperator(operator, orderItems);
            }
            return operator;
        }
        operator = new ProjectOperator(selectItems, operator);
        if (Optional.ofNullable(orderItems).isPresent() && !orderItems.isEmpty()) {
            operator = new OrderOperator(operator, orderItems);
        }
        return operator;
    }

    private SqlOperator planTables(SimpleSelect simpleSelect) {
        List<TableNode> tableItems = simpleSelect.getTableItems();
        SqlOperator operator = tableItemLogicPlanner.plan(tableItems.get(0), simpleSelect.getWhereExpression());
        for (int i = 1; i < tableItems.size(); i++) {
            TableNode tableItem = tableItems.get(i);
            SqlOperator current = tableItemLogicPlanner.plan(tableItem, simpleSelect.getWhereExpression());
            if (current instanceof TableScanOperator) {
                JoinTableOperator joinTableOperator = new JoinTableOperator(operator, current, JoinTableOperator.JoinType.INNER);
                CalculatorAnalysis.setCalculator(joinTableOperator, simpleSelect.getWhereExpression());
                operator = joinTableOperator;
            } else if (current instanceof JoinTableOperator) {
                JoinTableOperator joinTableOperator = (JoinTableOperator) current;
                joinTableOperator.setLeftOperator(operator);
                CalculatorAnalysis.setCalculator(joinTableOperator, simpleSelect.getWhereExpression());
                operator = joinTableOperator;
            }
        }
        return operator;
    }

}
