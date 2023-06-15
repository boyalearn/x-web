package com.xweb.mybatis.sql;

import net.sf.jsqlparser.JSQLParserException;

import java.lang.reflect.InvocationTargetException;

public interface Visitor {

    void addSelectItems(String tableName, String[] items) throws JSQLParserException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException;

    void addWhereAndCondition(String condition) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, JSQLParserException;

    void addJoinWhereCondition(String tableName, String joinCondition, String whereCondition);

}
