package com.xweb.sql.parser.base;

import com.xweb.sql.core.base.DefaultQuerySqlBaseVisitor;
import com.xweb.sql.parser.QuerySqlBaseLexer;
import com.xweb.sql.parser.QuerySqlBaseParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.Test;

public class QuerySqlBaseQueryTest {

    /**
     * simple
     * select id, name  from aaa  where id = 222 and name='zhx'
     */
    @Test
    public void test00000000001() {
        String sql = "select id, name  from aaa  where id = 222 and ( age= 22 or name= 'xxx')";
        CodePointCharStream input = CharStreams.fromString(sql);
        QuerySqlBaseLexer lexer = new QuerySqlBaseLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QuerySqlBaseParser parser = new QuerySqlBaseParser(tokens);

        DefaultQuerySqlBaseVisitor visitor = new DefaultQuerySqlBaseVisitor();
        visitor.visit(parser.query());
        System.out.println(visitor.getBaseSelect());
    }

    /**
     * simple
     * select id, name  from aaa  where id = 222 and name='zhx'
     */
    @Test
    public void test00000000002() {
        String sql = "select id, name  from aaa  where (id = 222 and  age= 22 )or name= 'xxx' ";
        CodePointCharStream input = CharStreams.fromString(sql);
        QuerySqlBaseLexer lexer = new QuerySqlBaseLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QuerySqlBaseParser parser = new QuerySqlBaseParser(tokens);

        DefaultQuerySqlBaseVisitor visitor = new DefaultQuerySqlBaseVisitor();
        visitor.visit(parser.query());
        System.out.println(visitor.getBaseSelect());
    }

    /**
     * simple
     * select id, name  from aaa  where id = 222 and name='zhx'
     */
    @Test
    public void test00000000003() {
        String sql = "select id, name  from aaa  where id = 222 and  age= 22 or name= 'xxx' group by name,id ";
        CodePointCharStream input = CharStreams.fromString(sql);
        QuerySqlBaseLexer lexer = new QuerySqlBaseLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QuerySqlBaseParser parser = new QuerySqlBaseParser(tokens);

        DefaultQuerySqlBaseVisitor visitor = new DefaultQuerySqlBaseVisitor();
        visitor.visit(parser.query());
        System.out.println(visitor.getBaseSelect());
    }

    /**
     * simple
     * select id, name  from aaa  where id = 222 and name='zhx'
     */
    @Test
    public void test00000000004() {
        String sql = "select id, name  from aaa  where id = 222 and  age= 22 or name= 'xxx' group by name,id  order by name,id";
        CodePointCharStream input = CharStreams.fromString(sql);
        QuerySqlBaseLexer lexer = new QuerySqlBaseLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QuerySqlBaseParser parser = new QuerySqlBaseParser(tokens);

        DefaultQuerySqlBaseVisitor visitor = new DefaultQuerySqlBaseVisitor();
        visitor.visit(parser.query());
        System.out.println(visitor.getBaseSelect());
    }

    /**
     * simple
     * select id, name  from aaa  where id = 222 and name='zhx'
     */
    @Test
    public void test00000000005() {
        String sql = "select id, name  from aaa  where id = 222 and  age= 22 or name= 'xxx' group by name,id  order by name,id having id>20";
        CodePointCharStream input = CharStreams.fromString(sql);
        QuerySqlBaseLexer lexer = new QuerySqlBaseLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QuerySqlBaseParser parser = new QuerySqlBaseParser(tokens);

        DefaultQuerySqlBaseVisitor visitor = new DefaultQuerySqlBaseVisitor();
        visitor.visit(parser.query());
        System.out.println(visitor.getBaseSelect());
    }

    /**
     * sub query
     * select id, name  from aaa  where id = 222 and name='zhx'
     */
    @Test
    public void test00000000006() {
        String sql = "select name,(select id from a where id=2) as currentId  from aaa  where id = 222 and  age= 22 or name= 'xxx' group by name,id  order by name,id having id>20";
        CodePointCharStream input = CharStreams.fromString(sql);
        QuerySqlBaseLexer lexer = new QuerySqlBaseLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QuerySqlBaseParser parser = new QuerySqlBaseParser(tokens);

        DefaultQuerySqlBaseVisitor visitor = new DefaultQuerySqlBaseVisitor();
        visitor.visit(parser.query());
        System.out.println(visitor.getBaseSelect());
    }
}
