package com.xweb.sql.planner;

import com.xweb.sql.meta.Select;
import com.xweb.sql.parser.DefaultSqlParser;
import org.junit.Test;

public class SqlParserTest {

    @Test
    public void test_0000000000001() {
        DefaultSqlParser defaultSqlParser = new DefaultSqlParser();
        Select select = defaultSqlParser.parse("select * from aaaa a,bbbb b where a.aa=b.aab and b.aab='22'");
        System.out.println(select);
    }
}
