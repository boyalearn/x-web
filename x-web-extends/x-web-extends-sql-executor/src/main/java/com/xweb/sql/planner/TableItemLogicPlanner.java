package com.xweb.sql.planner;

import com.xweb.sql.meta.common.BooleanNode;
import com.xweb.sql.meta.common.TableNode;
import com.xweb.sql.meta.table.SimpleTableNode;
import com.xweb.sql.operator.SqlOperator;
import com.xweb.sql.operator.TableScanOperator;

public class TableItemLogicPlanner implements SqlPlanner{

    SqlOperator plan(TableNode tableItem, BooleanNode booleanExpression){
        SimpleTableNode simpleTableItem = (SimpleTableNode) tableItem;
        LogicPlannerContext.setTableNameAlias(simpleTableItem.getAlias(), simpleTableItem.getName());
        return new TableScanOperator(simpleTableItem.getName(), simpleTableItem.getAlias());
    }
}
