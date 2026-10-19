package com.xweb.sql.core.common.util;

import com.xweb.sql.core.common.CommonAstToSqlVisitor;
import com.xweb.sql.core.common.Statement;
import com.xweb.sql.core.common.ast.AstBuilder;
import com.xweb.sql.core.parser.SqlBaseLexer;
import com.xweb.sql.core.parser.SqlBaseParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;

public final class CommonSqlUtil {

    private static final CommonAstToSqlVisitor commonAstToSqlVisitor = new CommonAstToSqlVisitor();

    public static Statement commonSqlToAST(String sql) {
        CodePointCharStream input = CharStreams.fromString(sql);
        SqlBaseLexer lexer = new SqlBaseLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SqlBaseParser parser = new SqlBaseParser(tokens);
        AstBuilder visitor = new AstBuilder();
        return (Statement) visitor.visit(parser.statement());
    }

    public static String astToSql(Statement statement) {
        return commonAstToSqlVisitor.visit(statement);
    }
}
