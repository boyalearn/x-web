package com.xweb.sql.planner.util;

import com.xweb.sql.meta.Node;
import com.xweb.sql.meta.common.BooleanNode;
import com.xweb.sql.planner.operator.AbstractOperator;
import com.xweb.sql.planner.operator.JoinTableOperator;
import com.xweb.sql.planner.operator.calculator.BooleanCalculator;

public class BooleanCalculatorUtil {

    public static BooleanCalculator createJoinTableOperatorCalculator(JoinTableOperator operator, BooleanNode booleanNode) {
        final AbstractOperator leftOperator = (AbstractOperator) operator.getLeftOperator();
        final AbstractOperator rightOperator = (AbstractOperator) operator.getRightOperator();
        return TableAssociationCalculatorUtil.create(leftOperator.getAlias(), rightOperator.getAlias(), booleanNode);
    }

    public static BooleanCalculator createFilterOperatorCalculator(Node node) {
        return FilterOperatorCalculatorUtil.create(node);
    }
}
