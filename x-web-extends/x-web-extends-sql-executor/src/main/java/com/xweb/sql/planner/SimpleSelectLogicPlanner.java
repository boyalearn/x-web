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
import com.xweb.sql.planner.operator.calculator.BooleanCalculator;
import com.xweb.sql.planner.util.BooleanCalculatorUtil;
import com.xweb.sql.planner.util.PlannerContextHolder;
import com.xweb.sql.planner.util.PlannerUtil;

import java.util.List;
import java.util.Optional;

public class SimpleSelectLogicPlanner implements SqlPlanner {

    @Override
    public SqlOperator plan(Node node, BooleanNode booleanNode) {
        SimpleSelect select = (SimpleSelect) node;
        List<TableNode> tables = select.getTableNodes();
        if (tables.isEmpty()) {
            return new ProjectOperator(select.getItemNodes(), null);
        }

        // 表查询操作
        SqlOperator operator = createTableNodeListOperator(select);
        fillSelectNodeTableName(select.getItemNodes());
        // 条件过滤
        SqlOperator filterOperator = createFilterOperator(select, operator);
        if (Optional.ofNullable(filterOperator).isPresent()) {
            operator = filterOperator;
        }


        final List<Node> groupItems = select.getGroupItems();
        final List<OrderNode> orderItems = select.getOrderNodes();
        if (Optional.ofNullable(groupItems).isPresent() && !groupItems.isEmpty()) {
            operator = new GroupOperator(operator, select.getItemNodes(), groupItems);
            if (Optional.ofNullable(orderItems).isPresent() && !orderItems.isEmpty()) {
                operator = new OrderOperator(operator, orderItems);
            }
            return operator;
        }

        operator = new ProjectOperator(select.getItemNodes(), operator);
        if (Optional.ofNullable(orderItems).isPresent() && !orderItems.isEmpty()) {
            operator = new OrderOperator(operator, orderItems);
        }
        return operator;
    }

    private SqlOperator createFilterOperator(SimpleSelect select, SqlOperator operator) {
        BooleanNode whereNode = select.getWhereNode();
        if (Optional.ofNullable(whereNode).isPresent()) {
            final FilterOperator filterOperator = new FilterOperator(operator);
            BooleanCalculator filterOperatorCalculator = BooleanCalculatorUtil.createFilterOperatorCalculator(select.getWhereNode());
            filterOperator.setBooleanCalculator(filterOperatorCalculator);
            return filterOperator;
        }
        return null;
    }

    private void fillSelectNodeTableName(List<Node> nodes) {
        for (Node node : nodes) {
            if (node instanceof ColumnNode) {
                ColumnNode column = (ColumnNode) node;
                column.getTable().setName(PlannerContextHolder.getTableNameByAlias(column.getTable().getAlias()));
            }
        }
    }

    private SqlOperator createTableNodeListOperator(SimpleSelect simpleSelect) {
        List<TableNode> tableItems = simpleSelect.getTableNodes();
        SqlOperator operator = PlannerUtil.plan(tableItems.get(0), simpleSelect.getWhereNode());
        for (int i = 1; i < tableItems.size(); i++) {
            TableNode tableItem = tableItems.get(i);
            SqlOperator current = PlannerUtil.plan(tableItem, simpleSelect.getWhereNode());
            if (current instanceof TableScanOperator) {
                JoinTableOperator joinTableOperator = new JoinTableOperator(operator, current, JoinTableOperator.JoinType.INNER);
                BooleanCalculator booleanCalculator = BooleanCalculatorUtil.createJoinTableOperatorCalculator(joinTableOperator, simpleSelect.getWhereNode());
                joinTableOperator.setBooleanCalculator(booleanCalculator);
                operator = joinTableOperator;
            } else if (current instanceof JoinTableOperator) {
                JoinTableOperator joinTableOperator = (JoinTableOperator) current;
                joinTableOperator.setLeftOperator(operator);
                BooleanCalculator booleanCalculator = BooleanCalculatorUtil.createJoinTableOperatorCalculator(joinTableOperator, simpleSelect.getWhereNode());
                joinTableOperator.setBooleanCalculator(booleanCalculator);
                operator = joinTableOperator;
            }
        }
        return operator;
    }
}
