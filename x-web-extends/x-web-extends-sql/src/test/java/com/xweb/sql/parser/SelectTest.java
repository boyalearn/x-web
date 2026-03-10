package com.xweb.sql.parser;

import com.xweb.sql.core.select.DefaultSelectExprBaseVisitor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.Test;

public class SelectTest {
    public static void main(String[] args) {
        //ANTLRInputStream input = new ANTLRInputStream("select id,name[1],substr(aa,1,2) from aaa  where id = 222 and name[1]='zhx'");
        //ANTLRInputStream input = new ANTLRInputStream("select id id,name[1] name ,substr(aa,1,2) as subAA,(select substr(ccc,1,2) from ccc) as CF from aaa  where id = 222 and name[1]='zhx'");
        ANTLRInputStream input = new ANTLRInputStream("select id id,name[1] name  from aaa  where id = 222 and name[1]='zhx'");

        SelectExprLexer lexer = new SelectExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SelectExprParser parser = new SelectExprParser(tokens);

        /*SelectExprParser.SqlContext context = parser.sql();
        String parseTreeS = context.toStringTree(parser);
        System.out.println(parseTreeS);*/
        DefaultSelectExprBaseVisitor visitor = new DefaultSelectExprBaseVisitor();
        visitor.visit(parser.sql());
        System.out.println("reault" + visitor);

    }

    /**
     * common sql
     */
    @Test
    public void test00000000001() {
        ANTLRInputStream input = new ANTLRInputStream("select id id,name[1] name  from aaa  where id = 222 and name[1]='zhx'");
        SelectExprLexer lexer = new SelectExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SelectExprParser parser = new SelectExprParser(tokens);

        /*SelectExprParser.SqlContext context = parser.sql();
        String parseTreeS = context.toStringTree(parser);
        System.out.println(parseTreeS);*/
        DefaultSelectExprBaseVisitor visitor = new DefaultSelectExprBaseVisitor();
        visitor.visit(parser.sql());
        System.out.println("reault:" + visitor.toSql());
    }
}
