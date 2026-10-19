package com.xweb.sql.operator.calculator;

import com.xweb.sql.meta.expression.BooleanExpression;
import com.xweb.sql.meta.expression.ColumnValueExpression;
import com.xweb.sql.meta.expression.ComplexBoolExpression;
import com.xweb.sql.meta.expression.TableAssociationExpression;
import com.xweb.sql.meta.item.Column;
import com.xweb.sql.operator.AbstractOperator;
import com.xweb.sql.operator.FilterOperator;
import com.xweb.sql.operator.JoinTableOperator;
import com.xweb.sql.planner.LogicPlannerContext;

public class CalculatorAnalysis {

    /**
     *
     * @param joinTableOperator
     * @param booleanExpression
     */
    public static void setCalculator(JoinTableOperator joinTableOperator, BooleanExpression booleanExpression){
        final AbstractOperator leftOperator = (AbstractOperator)joinTableOperator.getLeftOperator();
        final AbstractOperator rightOperator = (AbstractOperator)joinTableOperator.getRightOperator();
        joinTableOperator.setBooleanCalculator(createJoinCalculator(leftOperator.getAlias(), rightOperator.getAlias(), booleanExpression));
    }

    public static void setCalculator(FilterOperator filterOperator, BooleanExpression booleanExpression){
        filterOperator.setBooleanCalculator(createFilterCalculator(booleanExpression));
    }

    private static BooleanCalculator createFilterCalculator(BooleanExpression booleanExpression){
        if(booleanExpression instanceof ComplexBoolExpression){
            ComplexBoolExpression complexBoolExpression = (ComplexBoolExpression) booleanExpression;
            BooleanCalculator left = createFilterCalculator(complexBoolExpression.getLeft());
            BooleanCalculator right = createFilterCalculator(complexBoolExpression.getRight());
            return new LogicBooleanCalculator(left,complexBoolExpression.getLogic(),right);
        }  else if(booleanExpression instanceof ColumnValueExpression){
            ColumnValueExpression columnValueExpression = (ColumnValueExpression) booleanExpression;
            final Column column = columnValueExpression.getColumn();
            column.getTable().setName(LogicPlannerContext.getTableNameByAlias(column.getTable().getAlias()));
            return new ColumnValueExpressionCalculator(columnValueExpression);
        } else if(booleanExpression instanceof TableAssociationExpression){
            TableAssociationExpression tableAssociationExpression = (TableAssociationExpression) booleanExpression;
            setColumnTableName(tableAssociationExpression);
            return new TableAssociationExpressionCalculator(tableAssociationExpression);
        } else{
            return new TrueBooleanCalculator();
        }
    }

    private static BooleanCalculator createJoinCalculator(String tableAliasA, String tableAliasB, BooleanExpression booleanExpression){
        if(booleanExpression instanceof ComplexBoolExpression){
            ComplexBoolExpression complexBoolExpression = (ComplexBoolExpression) booleanExpression;
            BooleanCalculator left = createJoinCalculator(tableAliasA, tableAliasB, complexBoolExpression.getLeft());
            BooleanCalculator right = createJoinCalculator(tableAliasA, tableAliasB, complexBoolExpression.getRight());
            return new LogicBooleanCalculator(left,complexBoolExpression.getLogic(),right);
        }else if(booleanExpression instanceof TableAssociationExpression){
            TableAssociationExpression tableAssociationExpression = (TableAssociationExpression) booleanExpression;
            setColumnTableName(tableAssociationExpression);
            if(isTableAssociation(tableAliasA,tableAliasB,tableAssociationExpression)){
                return new TableAssociationExpressionCalculator(tableAssociationExpression);
            }
            return new TrueBooleanCalculator();
        } else{
            return new TrueBooleanCalculator();
        }
    }

    private static void setColumnTableName(TableAssociationExpression tableAssociationExpression){
        final Column left = tableAssociationExpression.getLeft();
        left.getTable().setName(LogicPlannerContext.getTableNameByAlias(left.getTable().getAlias()));
        final Column right = tableAssociationExpression.getRight();
        right.getTable().setName(LogicPlannerContext.getTableNameByAlias(right.getTable().getAlias()));
    }


    private static boolean isTableAssociation(String tableAliasA, String tableAliasB, TableAssociationExpression tableAssociationExpression){
        final Column left = tableAssociationExpression.getLeft();
        final Column right = tableAssociationExpression.getRight();
        if(tableAliasA.equals(left.getTable().getAlias())&&tableAliasB.equals(right.getTable().getAlias())){
            return true;
        }else if(tableAliasB.equals(left.getTable().getAlias())&&tableAliasA.equals(right.getTable().getAlias())){
            return true;
        }else{
            return false;
        }
    }
}
