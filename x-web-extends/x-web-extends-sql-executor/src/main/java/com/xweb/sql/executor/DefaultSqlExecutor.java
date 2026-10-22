package com.xweb.sql.executor;

import com.xweb.sql.data.Page;
import com.xweb.sql.meta.Node;
import com.xweb.sql.planner.operator.SqlOperator;
import com.xweb.sql.parser.DefaultSqlParser;
import com.xweb.sql.parser.SqlParser;
import com.xweb.sql.planner.LogicPlanner;

public class DefaultSqlExecutor implements SqlExecutor {
    @Override
    public Page execute(String sql) {
        SqlParser sqlParser = new DefaultSqlParser();
        Node node = sqlParser.parse(sql);
        LogicPlanner logicPlanner = new LogicPlanner(node);

        final SqlOperator sqlOperator = logicPlanner.planQuery();

        Page page = new Page();
        Page next = sqlOperator.next();
        while (!next.isEmpty()) {
            page.addRows(next.getRows());
            next = sqlOperator.next();
        }
        return page;
    }
}
