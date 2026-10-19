package com.xweb.sql.planner;

import com.xweb.sql.meta.Item;
import com.xweb.sql.meta.SimpleSelect;
import com.xweb.sql.meta.expression.BooleanExpression;
import com.xweb.sql.meta.item.OrderItem;
import com.xweb.sql.meta.item.TableItem;
import com.xweb.sql.operator.*;
import com.xweb.sql.operator.calculator.CalculatorAnalysis;

import java.util.List;
import java.util.Optional;

public class SimpleSelectLogicPlanner implements SqlPlanner{

    private static TableItemLogicPlanner tableItemLogicPlanner = new TableItemLogicPlanner();

    public SqlOperator plan(SimpleSelect simpleSelect) {
        List<TableItem> tableItems = simpleSelect.getTableItems();
        final List<Item> selectItems = simpleSelect.getSelectItems();
        if (tableItems.isEmpty()) {
            return new ProjectOperator(selectItems,null);
        }
        SqlOperator operator = planTables(simpleSelect);

        BooleanExpression whereExpression = simpleSelect.getWhereExpression();
        if (Optional.ofNullable(whereExpression).isPresent()) {
            final FilterOperator filterOperator = new FilterOperator(operator);
            CalculatorAnalysis.setCalculator(filterOperator, simpleSelect.getWhereExpression());
            operator = filterOperator;
        }
        final List<Item> groupItems =  simpleSelect.getGroupItems();
        final List<OrderItem> orderItems = simpleSelect.getOrderItems();
        if(Optional.ofNullable(groupItems).isPresent()&& !groupItems.isEmpty()){
            operator = new GroupOperator(operator,selectItems,groupItems);
            if(Optional.ofNullable(orderItems).isPresent() && !orderItems.isEmpty()){
                operator = new OrderOperator(operator,orderItems);
            }
            return operator;
        }
        operator = new ProjectOperator(simpleSelect.getSelectItems(), operator);
        if(Optional.ofNullable(orderItems).isPresent() && !orderItems.isEmpty()){
            operator = new OrderOperator(operator,orderItems);
        }
        return operator;
    }

    private SqlOperator planTables(SimpleSelect simpleSelect){
        List<TableItem> tableItems = simpleSelect.getTableItems();
        SqlOperator operator = tableItemLogicPlanner.plan(tableItems.get(0),simpleSelect.getWhereExpression());
        for (int i = 1; i < tableItems.size(); i++) {
            TableItem tableItem = tableItems.get(i);
            SqlOperator current = tableItemLogicPlanner.plan(tableItem,simpleSelect.getWhereExpression());
            if (current instanceof TableScanOperator) {
                JoinTableOperator joinTableOperator=new JoinTableOperator(operator, current, JoinTableOperator.JoinType.INNER);
                CalculatorAnalysis.setCalculator(joinTableOperator,simpleSelect.getWhereExpression());
                operator = joinTableOperator;
            } else if (current instanceof JoinTableOperator) {
                JoinTableOperator joinTableOperator = (JoinTableOperator) current;
                joinTableOperator.setLeftOperator(operator);
                CalculatorAnalysis.setCalculator(joinTableOperator,simpleSelect.getWhereExpression());
                operator = joinTableOperator;
            }
        }
        return operator;
    }

}
