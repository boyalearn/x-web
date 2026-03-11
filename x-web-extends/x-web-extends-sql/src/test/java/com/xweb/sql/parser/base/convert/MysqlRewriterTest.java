package com.xweb.sql.parser.base.convert;

import com.xweb.sql.mysql.SqlToMysqlUtil;
import org.junit.jupiter.api.Test;

public class MysqlRewriterTest {

    /**
     * simple
     * select id, name  from aaa  where id = 222 and name='zhx'
     */
    @Test
    public void test00000000001() {
        String sql = "select id,nvl(name,'') name from aaa where id = 222 and (age= 22 or name= 'xxx') or xx = '33' and ss = 22";
        System.out.printf(sql);
        String afterSql = SqlToMysqlUtil.convert(sql);
        System.out.printf(afterSql);
    }
}
