package com.xweb.sql.parser.base;

import com.xweb.sql.core.base.DefaultSqlBaseVisitor;
import com.xweb.sql.parser.SqlBaseLexer;
import com.xweb.sql.parser.SqlBaseParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.Locale;

public class SqlBaseQueryTest {
    /**
     * simple
     * select id, name  from aaa  where id = 222 and name='zhx'
     */
    @Test
    public void test00000000001() {
        String sql = "select id, name  from aaa  where id = 222 and name='zhx'".toUpperCase(Locale.ROOT);
        CodePointCharStream input = CharStreams.fromString(sql);
        SqlBaseLexer lexer = new SqlBaseLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SqlBaseParser parser = new SqlBaseParser(tokens);

        DefaultSqlBaseVisitor visitor = new DefaultSqlBaseVisitor(parser);
        visitor.visit(parser.query());
        Assert.isTrue(visitor.getAfterSql().equals(sql), "此sql不转换");
    }

    /**
     * index sql
     * select id id,name[1] name  from aaa  where id = 222 and name[1]='zhx' group by name,id
     */
    @Test
    public void test00000000002() {
        CodePointCharStream input = CharStreams.fromString("select id id,name[1] name  from aaa  where id = 222 and name[1]='zhx' group by name,id".toUpperCase(Locale.ROOT));
        SqlBaseLexer lexer = new SqlBaseLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SqlBaseParser parser = new SqlBaseParser(tokens);

        DefaultSqlBaseVisitor visitor = new DefaultSqlBaseVisitor(parser);
        visitor.visit(parser.query());
        String afterSql = "SELECT ID ID,SUBSTRING(NAME,0,2) NAME  FROM AAA  WHERE ID = 222 AND SUBSTRING(NAME,0,2)='ZHX' GROUP BY NAME,ID";
        Assert.isTrue(visitor.getAfterSql().equals(afterSql), "此sql转换异常");

    }

    /**
     * index sql
     * select id id,name[1] name  from aaa  where id = 222 and name[1]='zhx' group by name,id order by name[1] having count(*)>20
     */
    @Test
    public void test00000000003() {
        CodePointCharStream input = CharStreams.fromString("select id id,name[1] name  from aaa  where id = 222 and name[1]='zhx' group by name,id order by name[1] having count(*)>20".toUpperCase(Locale.ROOT));
        SqlBaseLexer lexer = new SqlBaseLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SqlBaseParser parser = new SqlBaseParser(tokens);

        DefaultSqlBaseVisitor visitor = new DefaultSqlBaseVisitor(parser);
        visitor.visit(parser.query());
        String afterSql = "SELECT ID ID,SUBSTRING(NAME,0,2) NAME  FROM AAA  WHERE ID = 222 AND SUBSTRING(NAME,0,2)='ZHX' GROUP BY NAME,ID ORDER BY SUBSTRING(NAME,0,2) HAVING COUNT(*)>20";
        Assert.isTrue(visitor.getAfterSql().equals(afterSql), "此sql转换异常");
    }


    /**
     * index sql
     * select id id,name[1] name  from aaa  where id = 222 and name[1]='zhx' order by name[1]
     */
    @Test
    public void test00000000004() {
        CodePointCharStream input = CharStreams.fromString("select id id,name[1] name  from aaa  where id = 222 and name[1]='zhx' order by name[1]".toUpperCase(Locale.ROOT));
        SqlBaseLexer lexer = new SqlBaseLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SqlBaseParser parser = new SqlBaseParser(tokens);

        DefaultSqlBaseVisitor visitor = new DefaultSqlBaseVisitor(parser);
        visitor.visit(parser.query());
        String afterSql = "SELECT ID ID,SUBSTRING(NAME,0,2) NAME  FROM AAA  WHERE ID = 222 AND SUBSTRING(NAME,0,2)='ZHX' ORDER BY SUBSTRING(NAME,0,2)";
        Assert.isTrue(visitor.getAfterSql().equals(afterSql), "此sql转换异常");
    }
}
