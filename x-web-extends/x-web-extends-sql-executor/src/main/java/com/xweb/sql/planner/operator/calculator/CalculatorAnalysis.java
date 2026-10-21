package com.xweb.sql.planner.operator.calculator;

import com.xweb.sql.meta.Node;
import com.xweb.sql.meta.Select;
import com.xweb.sql.meta.common.BooleanNode;
import com.xweb.sql.meta.expression.*;
import com.xweb.sql.meta.node.ColumnNode;
import com.xweb.sql.planner.operator.AbstractOperator;
import com.xweb.sql.planner.operator.FilterOperator;
import com.xweb.sql.planner.operator.JoinTableOperator;
import com.xweb.sql.planner.PlanContextHolder;

public class CalculatorAnalysis {

    /**
     *
     * @param joinTableOperator
     * @param booleanExpression
     */
    public static void setCalculator(JoinTableOperator joinTableOperator, BooleanNode booleanExpression){
        final AbstractOperator leftOperator = (AbstractOperator)joinTableOperator.getLeftOperator();
        final AbstractOperator rightOperator = (AbstractOperator)joinTableOperator.getRightOperator();
        joinTableOperator.setBooleanCalculator(createJoinCalculator(leftOperator.getAlias(), rightOperator.getAlias(), booleanExpression));
    }

    public static void setCalculator(FilterOperator filterOperator, BooleanNode booleanExpression){
        filterOperator.setBooleanCalculator(createFilterCalculator(booleanExpression));
    }

    private static BooleanCalculator createFilterCalculator(Node booleanExpression){
        if(booleanExpression instanceof ComplexBoolNode){
            ComplexBoolNode complexBoolExpression = (ComplexBoolNode) booleanExpression;
            BooleanCalculator left = createFilterCalculator(complexBoolExpression.getLeft());
            BooleanCalculator right = createFilterCalculator(complexBoolExpression.getRight());
            return new LogicBooleanCalculator(left,complexBoolExpression.getLogic(),right);
        }  else if(booleanExpression instanceof ColumnValueNode){
            ColumnValueNode columnValueExpression = (ColumnValueNode) booleanExpression;
            final ColumnNode column = columnValueExpression.getColumn();
            column.getTable().setName(PlanContextHolder.getTableNameByAlias(column.getTable().getAlias()));
            if(columnValueExpression.getValue() instanceof Select || columnValueExpression.getValue() instanceof PriorityNode){
                System.out.println("aab");
            }
            return new ColumnValueExpressionCalculator(columnValueExpression);
        } else if(booleanExpression instanceof PriorityNode){
            PriorityNode priorityBooleanExpression = (PriorityNode) booleanExpression;
            return new PriorityBooleanExpressionCalculator(createFilterCalculator(priorityBooleanExpression.getNode()));

        } else if(booleanExpression instanceof TableAssociationNode){
            TableAssociationNode tableAssociationExpression = (TableAssociationNode) booleanExpression;
            setColumnTableName(tableAssociationExpression);
            return new TableAssociationExpressionCalculator(tableAssociationExpression);
        } else{
            return new TrueBooleanCalculator();
        }
    }

    private static BooleanCalculator createJoinCalculator(String tableAliasA, String tableAliasB, BooleanNode booleanExpression){
        if(booleanExpression instanceof ComplexBoolNode){
            ComplexBoolNode complexBoolExpression = (ComplexBoolNode) booleanExpression;
            BooleanCalculator left = createJoinCalculator(tableAliasA, tableAliasB, complexBoolExpression.getLeft());
            BooleanCalculator right = createJoinCalculator(tableAliasA, tableAliasB, complexBoolExpression.getRight());
            return new LogicBooleanCalculator(left,complexBoolExpression.getLogic(),right);
        }else if(booleanExpression instanceof TableAssociationNode){
            TableAssociationNode tableAssociationExpression = (TableAssociationNode) booleanExpression;
            setColumnTableName(tableAssociationExpression);
            if(isTableAssociation(tableAliasA,tableAliasB,tableAssociationExpression)){
                return new TableAssociationExpressionCalculator(tableAssociationExpression);
            }
            return new TrueBooleanCalculator();
        } else{
            return new TrueBooleanCalculator();
        }
    }

    private static void setColumnTableName(TableAssociationNode tableAssociationExpression){
        final ColumnNode left = tableAssociationExpression.getLeft();
        left.getTable().setName(PlanContextHolder.getTableNameByAlias(left.getTable().getAlias()));
        final ColumnNode right = tableAssociationExpression.getRight();
        right.getTable().setName(PlanContextHolder.getTableNameByAlias(right.getTable().getAlias()));
    }


    private static boolean isTableAssociation(String tableAliasA, String tableAliasB, TableAssociationNode tableAssociationExpression){
        final ColumnNode left = tableAssociationExpression.getLeft();
        final ColumnNode right = tableAssociationExpression.getRight();
        if(tableAliasA.equals(left.getTable().getAlias())&&tableAliasB.equals(right.getTable().getAlias())){
            return true;
        }else if(tableAliasB.equals(left.getTable().getAlias())&&tableAliasA.equals(right.getTable().getAlias())){
            return true;
        }else{
            return false;
        }
    }
}
