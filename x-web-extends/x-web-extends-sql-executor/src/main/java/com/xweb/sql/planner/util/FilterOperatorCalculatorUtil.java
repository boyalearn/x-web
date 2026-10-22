package com.xweb.sql.planner.util;

import com.xweb.sql.meta.Node;
import com.xweb.sql.meta.Select;
import com.xweb.sql.meta.expression.ColumnValueNode;
import com.xweb.sql.meta.expression.ComplexBoolNode;
import com.xweb.sql.meta.expression.PriorityBooleanNode;
import com.xweb.sql.meta.expression.PriorityNode;
import com.xweb.sql.meta.expression.TableAssociationNode;
import com.xweb.sql.meta.node.ColumnNode;
import com.xweb.sql.planner.operator.SqlOperator;
import com.xweb.sql.planner.operator.calculator.BooleanCalculator;
import com.xweb.sql.planner.operator.calculator.ColumnValueExpressionCalculator;
import com.xweb.sql.planner.operator.calculator.ColumnValueSubSelectCalculator;
import com.xweb.sql.planner.operator.calculator.LogicBooleanCalculator;
import com.xweb.sql.planner.operator.calculator.PriorityBooleanExpressionCalculator;
import com.xweb.sql.planner.operator.calculator.TableAssociationExpressionCalculator;
import com.xweb.sql.planner.operator.calculator.TrueBooleanCalculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FilterOperatorCalculatorUtil {
    private static final Map<Class<? extends Node>, FilterOperatorCalculator> CALCULATOR = new HashMap<>();

    static {
        CALCULATOR.put(ComplexBoolNode.class, new ComplexBoolNodeFilterOperatorCalculator());
        CALCULATOR.put(TableAssociationNode.class, new TableAssociationNodeFilterOperatorCalculator());
        CALCULATOR.put(ColumnValueNode.class, new ColumnValueNodeFilterOperatorCalculator());
        CALCULATOR.put(PriorityBooleanNode.class, new PriorityBooleanNodeFilterOperatorCalculator());
    }

    public static BooleanCalculator create(Node node) {
        FilterOperatorCalculator filterOperatorCalculator = CALCULATOR.get(node.getClass());
        if (Optional.ofNullable(filterOperatorCalculator).isPresent()) {
            return filterOperatorCalculator.create(node);
        }
        return new TrueBooleanCalculator();
    }


    interface FilterOperatorCalculator {
        BooleanCalculator create(Node node);
    }

    static class ComplexBoolNodeFilterOperatorCalculator implements FilterOperatorCalculator {

        @Override
        public BooleanCalculator create(Node node) {
            ComplexBoolNode complexBoolNode = (ComplexBoolNode) node;
            BooleanCalculator left = FilterOperatorCalculatorUtil.create(complexBoolNode.getLeft());
            BooleanCalculator right = FilterOperatorCalculatorUtil.create(complexBoolNode.getRight());
            return new LogicBooleanCalculator(left, complexBoolNode.getLogic(), right);
        }
    }

    static class TableAssociationNodeFilterOperatorCalculator implements FilterOperatorCalculator {

        @Override
        public BooleanCalculator create(Node node) {
            TableAssociationNode tableAssociationNode = (TableAssociationNode) node;
            setColumnTableName(tableAssociationNode);
            return new TableAssociationExpressionCalculator(tableAssociationNode);
        }

        private void setColumnTableName(TableAssociationNode tableAssociationNode) {
            final ColumnNode left = tableAssociationNode.getLeft();
            left.getTable().setName(PlannerContextHolder.getTableNameByAlias(left.getTable().getAlias()));
            final ColumnNode right = tableAssociationNode.getRight();
            right.getTable().setName(PlannerContextHolder.getTableNameByAlias(right.getTable().getAlias()));
        }

    }

    static class ColumnValueNodeFilterOperatorCalculator implements FilterOperatorCalculator {

        @Override
        public BooleanCalculator create(Node node) {
            ColumnValueNode columnValueNode = (ColumnValueNode) node;
            final ColumnNode column = columnValueNode.getColumn();
            column.getTable().setName(PlannerContextHolder.getTableNameByAlias(column.getTable().getAlias()));
            Node value = columnValueNode.getValue();

            if (value instanceof Select) {
                SqlOperator operator = PlannerUtil.plan(value, null);
                return new ColumnValueSubSelectCalculator(columnValueNode, operator);
            } else if (value instanceof PriorityNode) {
                PriorityNode priorityNode = (PriorityNode) value;
                if (priorityNode.getNode() instanceof Select) {
                    SqlOperator operator = PlannerUtil.plan(priorityNode.getNode(), null);
                    return new ColumnValueSubSelectCalculator(columnValueNode, operator);
                } else {
                    throw new RuntimeException();
                }
            }
            return new ColumnValueExpressionCalculator(columnValueNode);
        }


    }

    static class PriorityBooleanNodeFilterOperatorCalculator implements FilterOperatorCalculator {

        @Override
        public BooleanCalculator create(Node node) {
            PriorityBooleanNode priorityBooleanNode = (PriorityBooleanNode) node;
            return new PriorityBooleanExpressionCalculator(FilterOperatorCalculatorUtil.create(priorityBooleanNode.getBooleanNode()));
        }
    }
}
