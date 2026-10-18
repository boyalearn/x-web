package com.xweb.sql.planner;

import com.xweb.sql.meta.expression.BooleanExpression;
import com.xweb.sql.meta.item.SimpleTableItem;
import com.xweb.sql.meta.item.TableItem;
import com.xweb.sql.operator.SqlOperator;
import com.xweb.sql.operator.TableScanOperator;

public class TableItemLogicPlanner implements SqlPlanner{

    SqlOperator plan(TableItem tableItem, BooleanExpression booleanExpression){
        SimpleTableItem simpleTableItem = (SimpleTableItem) tableItem;
        LogicPlannerContext.setTableNameAlias(simpleTableItem.getAlias(), simpleTableItem.getName());
        return new TableScanOperator(simpleTableItem.getName(), simpleTableItem.getAlias());
    }
}
