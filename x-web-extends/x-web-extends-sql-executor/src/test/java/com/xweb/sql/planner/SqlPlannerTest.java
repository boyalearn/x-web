package com.xweb.sql.planner;


import com.xweb.sql.GlobalConfig;
import com.xweb.sql.data.Page;
import com.xweb.sql.executor.DefaultSqlExecutor;
import org.junit.Before;
import org.junit.Test;

public class SqlPlannerTest {

    private DefaultSqlExecutor sqlExecutor;

    @Before
    public void init(){
        sqlExecutor = new DefaultSqlExecutor();
        GlobalConfig.path = "E:\\IdeaWrokspace\\x-web\\x-web-extends\\x-web-extends-sql-executor\\src\\test\\resources\\";
    }

    @Test
    public void test_00000000000001(){
        String sql = "select * from aaaa a,bbbb b where a.aa=b.aab and b.aab='22'";
        final Page data = sqlExecutor.execute(sql);
        System.out.println(data.getRows());
    }
}
