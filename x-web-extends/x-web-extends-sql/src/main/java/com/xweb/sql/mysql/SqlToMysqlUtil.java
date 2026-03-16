package com.xweb.sql.mysql;

import com.xweb.sql.core.common.Statement;
import com.xweb.sql.core.common.util.SqlUtil;

public class SqlToMysqlUtil {

    private static MysqlRewriterVisitor mysqlRewriter = new MysqlRewriterVisitor();

    static {
        mysqlRewriter.addFilter(new NvlToIfNullFilter());
    }

    public static String convert(String sql) {
        final Statement baseSelect = SqlUtil.readSqlToAST(sql);
        mysqlRewriter.visit(baseSelect);
        return SqlUtil.astToSql(baseSelect);
    }
}
