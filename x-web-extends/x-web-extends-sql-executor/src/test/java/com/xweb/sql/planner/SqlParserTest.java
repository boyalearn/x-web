package com.xweb.sql.planner;

import com.xweb.sql.meta.Node;
import com.xweb.sql.parser.DefaultSqlParser;
import org.junit.Test;

public class SqlParserTest {

    @Test
    public void test_0000000000001() {
        DefaultSqlParser defaultSqlParser = new DefaultSqlParser();
        Node select = defaultSqlParser.parse("select a.aa,a.bb from aaaa a,bbbb b where a.aa=b.aab and b.aab='22'");
        System.out.println(select);
    }
}
