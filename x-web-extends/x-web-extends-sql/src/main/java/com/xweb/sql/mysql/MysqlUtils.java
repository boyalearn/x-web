package com.xweb.sql.mysql;

import com.xweb.sql.core.common.Statement;
import com.xweb.sql.core.common.util.CommonSqlUtil;
import com.xweb.sql.core.convert.CommonSqlFilterVisitor;
import com.xweb.sql.core.convert.Filter;
import com.xweb.sql.mysql.filter.MysqlFilter;

import java.util.ServiceLoader;

public class MysqlUtils {

    private static CommonSqlFilterVisitor commonSqlFilterVisitor = new CommonSqlFilterVisitor();

    static {
        // 加载所有DatabaseOperation实现
        ServiceLoader<MysqlFilter> filters = ServiceLoader.load(MysqlFilter.class);

        // 遍历所有实现
        for (Filter filter : filters) {
            commonSqlFilterVisitor.addFilter(filter);
        }
    }

    public static String convert(String sql) {
        final Statement baseSelect = CommonSqlUtil.commonSqlToAST(sql);
        commonSqlFilterVisitor.visit(baseSelect);
        return CommonSqlUtil.astToSql(baseSelect);
    }
}
