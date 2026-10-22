package com.xweb.sql.planner.simple;

import com.xweb.sql.GlobalConfig;
import com.xweb.sql.data.Page;
import com.xweb.sql.data.util.PageUtil;
import com.xweb.sql.executor.DefaultSqlExecutor;
import org.junit.Before;
import org.junit.Test;

import java.util.Properties;

public class SimpleTest {

    private DefaultSqlExecutor sqlExecutor;

    @Before
    public void init() {
        sqlExecutor = new DefaultSqlExecutor();
        String path = System.getProperty("user.dir");
        GlobalConfig.path = path + "\\src\\test\\resources\\simple\\";
    }

    @Test
    public void test_00000000000001() {
        String sql = "select a.aa,a.bb from aaaa a,bbbb b where a.aa=b.aab";
        Page data = sqlExecutor.execute(sql);
        PageUtil.show(data);
        assert data.getRows().size() == 5;
    }

    @Test
    public void test_000000000000002() {
        String sql = "select a.aa from aaaa a,bbbb b where a.aa=b.aab and a.aa between 11 and 99";
        Page data = sqlExecutor.execute(sql);
        PageUtil.show(data);
    }

    @Test
    public void test_000000000000003() {
        String sql = "select a.aa from aaaa a,bbbb b where a.aa=b.aab and a.aa = (select c.aab from bbbb c where c.bbb=22)";
        Page data = sqlExecutor.execute(sql);
        PageUtil.show(data);
    }

    @Test
    public void test_000000000000004() {
        String sql = "select a.aa from aaaa a,bbbb b where a.aa=b.aab and (a.aa=77 or b.ccb=22)";
        Page data = sqlExecutor.execute(sql);
        PageUtil.show(data);
    }

    @Test
    public void test_000000000000005() {
        String sql = "select a.aa,a.bb from aaaa a,bbbb b where a.aa=b.aab order by a.aa desc,a.bb asc";
        Page data = sqlExecutor.execute(sql);
        PageUtil.show(data);
    }
}
