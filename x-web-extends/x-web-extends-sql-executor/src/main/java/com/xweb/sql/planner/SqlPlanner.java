package com.xweb.sql.planner;

import com.xweb.sql.meta.Node;
import com.xweb.sql.planner.operator.SqlOperator;

public interface SqlPlanner {

    SqlOperator plan(Node node);
}
