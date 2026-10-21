package com.xweb.sql.planner;

import com.xweb.sql.meta.Node;
import com.xweb.sql.meta.table.SimpleTableNode;
import com.xweb.sql.planner.operator.SqlOperator;
import com.xweb.sql.planner.operator.TableScanOperator;

public class TableItemLogicPlanner implements SqlPlanner{

    public SqlOperator plan(Node node){
        SimpleTableNode simpleTableItem = (SimpleTableNode) node;
        PlanContextHolder.setTableNameAlias(simpleTableItem.getAlias(), simpleTableItem.getName());
        return new TableScanOperator(simpleTableItem.getName(), simpleTableItem.getAlias());
    }
}
