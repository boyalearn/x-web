package com.xweb.sql.planner.util;

import com.xweb.sql.meta.Node;
import com.xweb.sql.meta.common.BooleanNode;
import com.xweb.sql.meta.select.SimpleSelect;
import com.xweb.sql.meta.table.SimpleTableNode;
import com.xweb.sql.planner.SimpleSelectLogicPlanner;
import com.xweb.sql.planner.SimpleTableNodeLogicPlanner;
import com.xweb.sql.planner.SqlPlanner;
import com.xweb.sql.planner.operator.SqlOperator;
import com.xweb.sql.planner.operator.exception.UnknownOperatorException;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PlannerUtil {

    private static final Map<Class<? extends Node>, SqlPlanner> PLANNER = new HashMap<>();

    static {
        PLANNER.put(SimpleSelect.class,new SimpleSelectLogicPlanner());
        PLANNER.put(SimpleTableNode.class,new SimpleTableNodeLogicPlanner());
    }

    public static SqlOperator plan(Node node, BooleanNode booleanNode){
        final SqlPlanner sqlPlanner = PLANNER.get(node.getClass());
        if(Optional.ofNullable(sqlPlanner).isPresent()){
            return sqlPlanner.plan(node,booleanNode);
        }
        throw new UnknownOperatorException(node.getClass().getName());
    }

}
