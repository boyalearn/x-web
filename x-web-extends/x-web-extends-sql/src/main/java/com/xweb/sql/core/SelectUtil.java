package com.xweb.sql.core;

import com.xweb.sql.core.base.BaseSelect;
import com.xweb.sql.core.base.DefaultQuerySqlBaseVisitor;
import com.xweb.sql.parser.QuerySqlBaseLexer;
import com.xweb.sql.parser.QuerySqlBaseParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;

public final class SelectUtil {
    public static BaseSelect readToAST(String sql) {

        CodePointCharStream input = CharStreams.fromString(sql);
        QuerySqlBaseLexer lexer = new QuerySqlBaseLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QuerySqlBaseParser parser = new QuerySqlBaseParser(tokens);

        DefaultQuerySqlBaseVisitor visitor = new DefaultQuerySqlBaseVisitor();
        visitor.visit(parser.query());
        return visitor.getBaseSelect();
    }

    public static String toSql(BaseSelect baseSelect) {
        return ItemStringUtil.toString(baseSelect);
    }
}
