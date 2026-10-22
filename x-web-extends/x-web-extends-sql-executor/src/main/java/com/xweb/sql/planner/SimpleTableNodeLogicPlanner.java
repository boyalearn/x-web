package com.xweb.sql.planner;

import com.xweb.sql.meta.Node;
import com.xweb.sql.meta.common.BooleanNode;
import com.xweb.sql.meta.table.SimpleTableNode;
import com.xweb.sql.planner.operator.SqlOperator;
import com.xweb.sql.planner.operator.TableScanOperator;
import com.xweb.sql.planner.util.PlannerContextHolder;

public class SimpleTableNodeLogicPlanner implements SqlPlanner{

    @Override
    public SqlOperator plan(Node node, BooleanNode booleanNode) {
        SimpleTableNode simpleTableItem = (SimpleTableNode) node;
        PlannerContextHolder.setTableNameAlias(simpleTableItem.getAlias(), simpleTableItem.getName());
        return new TableScanOperator(simpleTableItem.getName(), simpleTableItem.getAlias());
    }
}
