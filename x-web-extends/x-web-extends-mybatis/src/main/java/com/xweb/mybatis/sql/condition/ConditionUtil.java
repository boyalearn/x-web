package com.xweb.mybatis.sql.condition;

import net.sf.jsqlparser.expression.BinaryExpression;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.expression.StringValue;
import net.sf.jsqlparser.schema.Column;
import net.sf.jsqlparser.statement.select.PlainSelect;

import java.util.HashMap;
import java.util.Map;

public class ConditionUtil {

    private static final Map<Class, ConditionVisitor> conditionVisitorDic = new HashMap<>();

    static {
        conditionVisitorDic.put(BinaryExpression.class, new BinaryExpressionConditionVisitor());
        conditionVisitorDic.put(StringValue.class, new StringValueConditionVisitor());
        conditionVisitorDic.put(Column.class,new ColumnConditionVisitor());
    }

    public static void replaceConditionTable(PlainSelect plainSelect, Expression conditionExpression) {
        Class<? extends Expression> aClass = conditionExpression.getClass();
        if (BinaryExpression.class.isAssignableFrom(aClass)) {
            ConditionVisitor conditionVisitor = conditionVisitorDic.get(BinaryExpression.class);
            conditionVisitor.modifyTable(conditionExpression, plainSelect);
        } else {
            ConditionVisitor conditionVisitor = conditionVisitorDic.get(conditionExpression.getClass());
            conditionVisitor.modifyTable(conditionExpression, plainSelect);
        }

    }
}
