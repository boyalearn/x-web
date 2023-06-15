package com.xweb.mybatis.sql;

import net.sf.jsqlparser.schema.Table;
import net.sf.jsqlparser.statement.select.Join;
import net.sf.jsqlparser.statement.select.PlainSelect;
import net.sf.jsqlparser.statement.select.Select;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class VisitorUtil {

    private static final Map<Class, Class> visitorDic = new HashMap<>();

    static {
        visitorDic.put(Select.class, SelectVisitor.class);
        visitorDic.put(PlainSelect.class, PlainSelectVisitor.class);
    }

    public static Visitor findVisitor(Object object) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class aClass = visitorDic.get(object.getClass());
        Constructor constructor = aClass.getConstructor(object.getClass());
        return (Visitor) constructor.newInstance(object);
    }

    public static Table findExistTable(PlainSelect plainSelect, String tableName) {
        Table fromTable = (Table) plainSelect.getFromItem();
        if (fromTable.getName().equals(tableName) || tableName.equals(fromTable.getAlias())) {
            return fromTable;
        } else if (Optional.ofNullable(plainSelect.getJoins()).isPresent()) {
            List<Join> joins = plainSelect.getJoins();
            for (Join join : joins) {
                Table rightTable = (Table) join.getRightItem();
                if (rightTable.getName().equals(tableName) || tableName.equals(rightTable.getAlias())) {
                    return rightTable;
                }
            }
        }
        return null;
    }

}
