package com.xweb.sql.planner.util;

import com.xweb.sql.meta.Node;
import com.xweb.sql.meta.expression.ComplexBoolNode;
import com.xweb.sql.meta.expression.TableAssociationNode;
import com.xweb.sql.meta.node.ColumnNode;
import com.xweb.sql.planner.operator.calculator.BooleanCalculator;
import com.xweb.sql.planner.operator.calculator.LogicBooleanCalculator;
import com.xweb.sql.planner.operator.calculator.TableAssociationExpressionCalculator;
import com.xweb.sql.planner.operator.calculator.TrueBooleanCalculator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;


public class TableAssociationCalculatorUtil {

    private static final Map<Class<? extends Node>, TableJoinCalculator> CALCULATOR = new HashMap<>();

    static {
        CALCULATOR.put(ComplexBoolNode.class, new ComplexBoolNodeTableJoinCalculator());
        CALCULATOR.put(TableAssociationNode.class, new TableAssociationNodeTableJoinCalculator());
    }

    public static BooleanCalculator create(String tableAliasA, String tableAliasB, Node node) {
        TableJoinCalculator tableJoinCalculator = CALCULATOR.get(node.getClass());
        if (Optional.ofNullable(tableJoinCalculator).isPresent()) {
            return tableJoinCalculator.create(tableAliasA, tableAliasB, node);
        }
        return new TrueBooleanCalculator();
    }


    interface TableJoinCalculator {
        BooleanCalculator create(String tableAliasA, String tableAliasB, Node node);
    }

    static class ComplexBoolNodeTableJoinCalculator implements TableJoinCalculator {

        @Override
        public BooleanCalculator create(String tableAliasA, String tableAliasB, Node node) {
            ComplexBoolNode complexBoolNode = (ComplexBoolNode) node;
            BooleanCalculator left = TableAssociationCalculatorUtil.create(tableAliasA, tableAliasB, complexBoolNode.getLeft());
            BooleanCalculator right = TableAssociationCalculatorUtil.create(tableAliasA, tableAliasB, complexBoolNode.getRight());
            return new LogicBooleanCalculator(left, complexBoolNode.getLogic(), right);
        }
    }

    static class TableAssociationNodeTableJoinCalculator implements TableJoinCalculator {


        @Override
        public BooleanCalculator create(String tableAliasA, String tableAliasB, Node node) {
            TableAssociationNode tableAssociationNode = (TableAssociationNode) node;
            setColumnTableName(tableAssociationNode);
            if (isTableAssociation(tableAliasA, tableAliasB, tableAssociationNode)) {
                return new TableAssociationExpressionCalculator(tableAssociationNode);
            }
            return new TrueBooleanCalculator();
        }

        private void setColumnTableName(TableAssociationNode tableAssociationNode) {
            final ColumnNode left = tableAssociationNode.getLeft();
            left.getTable().setName(PlannerContextHolder.getTableNameByAlias(left.getTable().getAlias()));
            final ColumnNode right = tableAssociationNode.getRight();
            right.getTable().setName(PlannerContextHolder.getTableNameByAlias(right.getTable().getAlias()));
        }


        private boolean isTableAssociation(String tableAliasA, String tableAliasB, TableAssociationNode tableAssociationNode) {
            String leftTableAlias = tableAssociationNode.getLeft().getTable().getAlias();
            String rightTableAlias = tableAssociationNode.getRight().getTable().getAlias();
            Set<String> tableSets = new HashSet<>();
            tableSets.add(leftTableAlias);
            tableSets.add(rightTableAlias);
            return tableSets.contains(tableAliasA) && tableSets.contains(tableAliasB);
        }

    }

}
