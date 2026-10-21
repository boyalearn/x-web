package com.xweb.sql.planner;

import com.xweb.sql.meta.Node;
import com.xweb.sql.meta.select.SimpleSelect;
import com.xweb.sql.operator.SqlOperator;
import com.xweb.sql.operator.exception.UnknownOperatorException;

public class LogicPlanner {

    private static SimpleSelectLogicPlanner simpleSelectLogicPlanner = new SimpleSelectLogicPlanner();

    private Node node;

    public LogicPlanner(Node node) {
        this.node = node;
    }

    public SqlOperator planQuery() {
        if (this.node instanceof SimpleSelect) {
            return simpleSelectLogicPlanner.plan((SimpleSelect) this.node);
        }
        throw new UnknownOperatorException("unknown implement operator!");
    }
}
