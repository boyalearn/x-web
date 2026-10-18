package com.xweb.sql.planner;

import com.xweb.sql.meta.Select;
import com.xweb.sql.meta.SimpleSelect;
import com.xweb.sql.operator.SqlOperator;
import com.xweb.sql.operator.exception.UnknownOperatorException;

public class LogicPlanner {

    private static SimpleSelectLogicPlanner simpleSelectLogicPlanner = new SimpleSelectLogicPlanner();

    private Select select;

    public LogicPlanner(Select select) {
        this.select = select;
    }

    public SqlOperator planQuery() {
        if (this.select instanceof SimpleSelect) {
            return simpleSelectLogicPlanner.plan((SimpleSelect) this.select);
        }
        throw new UnknownOperatorException("unknown implement operator!");
    }
}
