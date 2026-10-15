package com.xweb.sql.planner;


import com.xweb.sql.GlobalConfig;
import com.xweb.sql.SqlExecutor;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class SqlPlannerTest {

    private SqlExecutor sqlExecutor;

    @Before
    public void init(){
        sqlExecutor = new SqlExecutor();
        GlobalConfig.path = "E:\\IdeaWrokspace\\x-web\\x-web-extends\\x-web-extends-sql-executor\\src\\test\\resources\\";
    }

    @Test
    public void test_00000000000001(){
        String sql = "select * from aaaa a,bbbb b where a.aa=b.aab and b.aab='22'";
        sqlExecutor.execute(sql);
        List<Object> data= sqlExecutor.getOutPut();
        System.out.println(data);
    }
}
