package com.xweb.sql.planner;

import com.xweb.sql.meta.common.BooleanNode;
import com.xweb.sql.meta.common.TableNode;
import com.xweb.sql.meta.table.SimpleTableNode;
import com.xweb.sql.planner.operator.SqlOperator;
import com.xweb.sql.planner.operator.TableScanOperator;

public class TableItemLogicPlanner implements SqlPlanner{

    SqlOperator plan(TableNode tableItem, BooleanNode booleanNode){
        SimpleTableNode simpleTableItem = (SimpleTableNode) tableItem;
        PlanContextHolder.setTableNameAlias(simpleTableItem.getAlias(), simpleTableItem.getName());
        return new TableScanOperator(simpleTableItem.getName(), simpleTableItem.getAlias());
    }
}
