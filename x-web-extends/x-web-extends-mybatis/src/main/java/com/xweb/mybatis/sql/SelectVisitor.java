package com.xweb.mybatis.sql;

import lombok.AllArgsConstructor;
import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.statement.select.Select;
import net.sf.jsqlparser.statement.select.SelectBody;

import java.lang.reflect.InvocationTargetException;

@AllArgsConstructor
public class SelectVisitor implements Visitor {

    private Select select;

    @Override
    public void addSelectItems(String tableName, String[] items) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, JSQLParserException {
        SelectBody selectBody = select.getSelectBody();
        Visitor visitor = VisitorUtil.findVisitor(selectBody);
        visitor.addSelectItems(tableName, items);
    }

    @Override
    public void addWhereAndCondition( String condition) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, JSQLParserException {
        SelectBody selectBody = select.getSelectBody();
        Visitor visitor = VisitorUtil.findVisitor(selectBody);
        visitor.addWhereAndCondition( condition);
    }

    @Override
    public void addJoinWhereCondition(String tableName, String joinCondition, String whereCondition) {

    }
}
