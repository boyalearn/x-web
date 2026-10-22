package com.xweb.sql.planner;

import com.xweb.sql.meta.Node;
import com.xweb.sql.meta.common.BooleanNode;
import com.xweb.sql.meta.common.OrderNode;
import com.xweb.sql.meta.common.TableNode;
import com.xweb.sql.meta.node.ColumnNode;
import com.xweb.sql.meta.select.SimpleSelect;
import com.xweb.sql.planner.operator.FilterOperator;
import com.xweb.sql.planner.operator.GroupOperator;
import com.xweb.sql.planner.operator.JoinTableOperator;
import com.xweb.sql.planner.operator.OrderOperator;
import com.xweb.sql.planner.operator.ProjectOperator;
import com.xweb.sql.planner.operator.SqlOperator;
import com.xweb.sql.planner.operator.TableScanOperator;
import com.xweb.sql.planner.operator.calculator.CalculatorAnalysis;
import com.xweb.sql.planner.util.PlannerContextHolder;
import com.xweb.sql.planner.util.PlannerUtil;

import java.util.List;
import java.util.Optional;

public class SimpleSelectLogicPlanner implements SqlPlanner {

    @Override
    public SqlOperator plan(Node node, BooleanNode booleanNode) {
        SimpleSelect select = (SimpleSelect)node;
        List<TableNode> tables = select.getTableNodes();
        final List<Node> selectItems = select.getItemNodes();
        if (tables.isEmpty()) {
            return new ProjectOperator(selectItems, null);
        }

        SqlOperator operator = planTables(select);

        BooleanNode whereNode = select.getWhereNode();
        if (Optional.ofNullable(whereNode).isPresent()) {
            final FilterOperator filterOperator = new FilterOperator(operator);
            CalculatorAnalysis.setCalculator(filterOperator, select.getWhereNode());
            operator = filterOperator;
        }
        for (Node selectItem : selectItems) {
            if (selectItem instanceof ColumnNode) {
                ColumnNode column = (ColumnNode) selectItem;
                column.getTable().setName(PlannerContextHolder.getTableNameByAlias(column.getTable().getAlias()));
            }
        }
        final List<Node> groupItems = select.getGroupItems();
        final List<OrderNode> orderItems = select.getOrderNodes();
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
        List<TableNode> tableItems = simpleSelect.getTableNodes();
        SqlOperator operator = PlannerUtil.plan(tableItems.get(0),simpleSelect.getWhereNode());
        for (int i = 1; i < tableItems.size(); i++) {
            TableNode tableItem = tableItems.get(i);
            SqlOperator current = PlannerUtil.plan(tableItem, simpleSelect.getWhereNode());
            if (current instanceof TableScanOperator) {
                JoinTableOperator joinTableOperator = new JoinTableOperator(operator, current, JoinTableOperator.JoinType.INNER);
                CalculatorAnalysis.setCalculator(joinTableOperator, simpleSelect.getWhereNode());
                operator = joinTableOperator;
            } else if (current instanceof JoinTableOperator) {
                JoinTableOperator joinTableOperator = (JoinTableOperator) current;
                joinTableOperator.setLeftOperator(operator);
                CalculatorAnalysis.setCalculator(joinTableOperator, simpleSelect.getWhereNode());
                operator = joinTableOperator;
            }
        }
        return operator;
    }
}
