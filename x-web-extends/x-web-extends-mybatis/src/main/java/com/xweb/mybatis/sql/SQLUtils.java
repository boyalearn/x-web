package com.xweb.mybatis.sql;

import net.sf.jsqlparser.JSQLParserException;

import java.lang.reflect.InvocationTargetException;


/**
 * 功能1 添加一个筛选条件，添加要给查询字段
 */
public class SQLUtils {


    public static void main(String[] args) throws JSQLParserException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        String sql = "select u.aa from user u,goods g where g.user_id=u.id and u.id in (select user_id from goods ) and u.p=222 and u.tid=555";
        SqlVisitor sqlVisitor = new SqlVisitor(sql);
        String resultSql = sqlVisitor.addWhereCondition("user.name like '234%'");
        System.out.println(resultSql);
    }
}
