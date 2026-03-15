package com.xweb.sql.core.common.util;

import com.xweb.sql.core.common.CommonAstToSqlVisitor;
import com.xweb.sql.core.common.CommonSqlQuerySqlBaseVisitor;
import com.xweb.sql.core.common.Statement;
import com.xweb.sql.core.parser.QuerySqlBaseLexer;
import com.xweb.sql.core.parser.QuerySqlBaseParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;

public final class SqlUtil {

    private static final CommonAstToSqlVisitor commonAstToSqlVisitor = new CommonAstToSqlVisitor();

    public static Statement readSqlToAST(String sql) {
        CodePointCharStream input = CharStreams.fromString(sql);
        QuerySqlBaseLexer lexer = new QuerySqlBaseLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QuerySqlBaseParser parser = new QuerySqlBaseParser(tokens);
        CommonSqlQuerySqlBaseVisitor visitor = new CommonSqlQuerySqlBaseVisitor();
        return (Statement) visitor.visit(parser.statement());
    }

    public static String astToSql(Statement select) {
        return commonAstToSqlVisitor.visit(select);
    }
}
