package com.xweb.sql.core.parser.base.convert;

import com.xweb.sql.mysql.MysqlUtils;
import org.junit.jupiter.api.Test;

public class MysqlRewriterTest {

    @Test
    public void test00000000001() {
        String sql = "select id,nvl(name,'') name from aaa where id = 222 and (age= 22 or name= 'xxx') or xx = '33' and ss = 22";
        System.out.println("s:" + sql);
        String afterSql = MysqlUtils.convert(sql);
        System.out.println("o:" + afterSql);
    }

    @Test
    public void test00000000002() {
        String sql = "select * from bbb where b.name is not null OFFSET 1 ROWS FETCH NEXT 10 ROWS ONLY";
        System.out.println("s:" + sql);
        String afterSql = MysqlUtils.convert(sql);
        System.out.println("o:" + afterSql);
    }

    @Test
    public void test00000000003() {
        String sql = "select name[1],data[2,5] from bbb where b.name is not null OFFSET 1 ROWS FETCH NEXT 10 ROWS ONLY";
        System.out.println("s:" + sql);
        String afterSql = MysqlUtils.convert(sql);
        System.out.println("o:" + afterSql);
    }

    @Test
    public void test00000000004() {
        String sql = "select name[1],data[2,5],id from (select name[1],data[2,5],id from bbb where b.name is not null group by 3,2,1) where b.name is not null group by 3,2,1";
        System.out.println("s:" + sql);
        String afterSql = MysqlUtils.convert(sql);
        System.out.println("o:" + afterSql);
    }
}
