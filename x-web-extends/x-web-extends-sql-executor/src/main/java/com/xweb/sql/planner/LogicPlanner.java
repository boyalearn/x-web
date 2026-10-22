package com.xweb.sql.planner;

import com.xweb.sql.meta.Node;
import com.xweb.sql.planner.operator.SqlOperator;
import com.xweb.sql.planner.util.PlannerUtil;

public class LogicPlanner {

    private Node node;

    public LogicPlanner(Node node) {
        this.node = node;
    }

    public SqlOperator planQuery() {
        return PlannerUtil.plan(this.node,null);
    }
}
