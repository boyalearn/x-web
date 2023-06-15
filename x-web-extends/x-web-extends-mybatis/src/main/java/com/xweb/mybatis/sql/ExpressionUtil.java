package com.xweb.mybatis.sql;

import com.xweb.mybatis.sql.condition.ConditionUtil;
import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.select.PlainSelect;

public class ExpressionUtil {

    public static Expression createConditionExpression(PlainSelect plainSelect, String condition) throws JSQLParserException {
        Expression conditionExpression = CCJSqlParserUtil.parseExpression(condition);
        ConditionUtil.replaceConditionTable(plainSelect, conditionExpression);
        return conditionExpression;
    }
}
