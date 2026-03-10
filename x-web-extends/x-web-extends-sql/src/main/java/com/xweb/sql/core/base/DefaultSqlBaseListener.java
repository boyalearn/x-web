package com.xweb.sql.core.base;

import com.xweb.sql.parser.SqlBaseBaseListener;
import com.xweb.sql.parser.SqlBaseParser;

public class DefaultSqlBaseListener extends SqlBaseBaseListener {
    @Override
    public void exitIndexConstructor(SqlBaseParser.IndexConstructorContext ctx) {
        super.exitIndexConstructor(ctx);
    }
}
