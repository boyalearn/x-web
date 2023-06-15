package com.xweb.mybatis.sql;

import lombok.AllArgsConstructor;
import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;

import java.lang.reflect.InvocationTargetException;

@AllArgsConstructor
public class SqlVisitor {

    private String sql;

    public String addSelectItems(String tableName, String[] items) throws JSQLParserException,
            InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        Statement statement = CCJSqlParserUtil.parse(sql);
        Visitor visitor = VisitorUtil.findVisitor(statement);
        visitor.addSelectItems(tableName, items);
        return statement.toString();
    }

    public String addWhereCondition(String condition) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, JSQLParserException {
        Statement statement = CCJSqlParserUtil.parse(sql);
        Visitor visitor = VisitorUtil.findVisitor(statement);
        visitor.addWhereAndCondition(condition);
        return statement.toString();
    }

    public void addJoinWhereCondition(String tableName, String joinCondition, String whereCondition) {

    }
}
