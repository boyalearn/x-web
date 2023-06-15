package com.xweb.mybatis.utils;

import java.lang.reflect.Field;

public class ReflectionUtil {

    public static Object callGetObjectProperty(Object object, String fieldName) {
        return executeGetObjectPropertyValueBase(object, fieldName, false);
    }

    public static Object callGetMybatisObjectProperty(Object object, String fieldName) {
        return executeGetObjectPropertyValueBase(object, fieldName, true);
    }

    private static Object executeGetObjectPropertyValueBase(Object object, String fieldName, boolean mybatis) {
        try {
            Class<?> aClass = object.getClass();
            Field field = aClass.getDeclaredField(fieldName);
            field.setAccessible(true);
            Object value = field.get(object);
            field.setAccessible(false);
            if (mybatis) {
                if (field.getType().isAssignableFrom(String.class)) {
                    return "'" + value + "'";
                }
            }
            return value;
        } catch (Exception e) {
            return "";
        }
    }
}
