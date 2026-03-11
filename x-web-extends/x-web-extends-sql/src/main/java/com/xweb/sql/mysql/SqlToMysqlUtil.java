package com.xweb.sql.mysql;

import com.xweb.sql.core.SelectUtil;
import com.xweb.sql.core.base.BaseSelect;

public class SqlToMysqlUtil {
    private static MysqlRewriter mysqlRewriter = new MysqlRewriter();

    static {
        mysqlRewriter.addFilter(new NvlToIfNullFilter());
    }

    public static String convert(String sql) {
        final BaseSelect baseSelect = SelectUtil.readToAST(sql);
        mysqlRewriter.visit(baseSelect);
        return SelectUtil.toSql(baseSelect);
    }
}
