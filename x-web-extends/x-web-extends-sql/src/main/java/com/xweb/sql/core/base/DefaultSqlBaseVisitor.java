package com.xweb.sql.core.base;

import com.xweb.sql.parser.SqlBaseBaseVisitor;
import com.xweb.sql.parser.SqlBaseParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;
import java.util.stream.Collectors;

public class DefaultSqlBaseVisitor extends SqlBaseBaseVisitor {

    StringBuffer sqlBuffer = new StringBuffer();

    String sql = "";

    int index = 0;


    SqlBaseParser sqlBaseParser;

    public DefaultSqlBaseVisitor(SqlBaseParser sqlBaseParser) {
        this.sqlBaseParser = sqlBaseParser;
        this.sql = sqlBaseParser.getInputStream().getTokenSource().getInputStream().toString();
    }

    @Override
    public Object visitIndexConstructor(SqlBaseParser.IndexConstructorContext ctx) {
        final List<TerminalNode> terminalNodes = ctx.INTEGER_VALUE();

        if (ctx.getStart().getStartIndex() > index) {
            sqlBuffer.append(this.sql.substring(this.index, ctx.getStart().getStartIndex()));
            this.index = ctx.getStop().getStopIndex() + 1;

        }
        final SqlBaseParser.IdentifierContext identifier = ctx.identifier();
        sqlBuffer.append("SUBSTRING(");
        sqlBuffer.append(identifier.getText());
        if (terminalNodes.size() == 1) {
            int index = new Integer(terminalNodes.get(0).getText());
            sqlBuffer.append("," + (index - 1));
            sqlBuffer.append("," + (index + 1));
        } else {

        }
        sqlBuffer.append(")");
        System.out.println("result" + identifier.getText() + String.join(",", terminalNodes.stream().map(r -> r.getText()).collect(Collectors.toList())));
        return super.visitIndexConstructor(ctx);
    }

    public String getAfterSql() {
        if (this.index < this.sql.length()) {
            this.sqlBuffer.append(this.sql.substring(this.index, this.sql.length()));
            this.index = this.sql.length() - 1;
        }
        return this.sqlBuffer.toString();
    }
}
