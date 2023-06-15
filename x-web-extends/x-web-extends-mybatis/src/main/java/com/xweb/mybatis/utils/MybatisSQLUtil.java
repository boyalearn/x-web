package com.xweb.mybatis.utils;

import org.apache.ibatis.mapping.ParameterMapping;

import java.util.List;
import java.util.Map;

public final class MybatisSQLUtil {

    public static final String combineCompleteSQL(String parameterSql, List<ParameterMapping> parameterMaps, Object parameterObject) {
        for (ParameterMapping parameterMap : parameterMaps) {
            parameterSql = parameterSql.replace("?", getParameterPropertyValue(parameterObject, parameterMap));
        }
        return parameterSql;
    }

    private static String getParameterPropertyValue(Object parameter, ParameterMapping parameterMap) {
        if (parameter instanceof Map) {
            Map map = (Map) parameter;
            Object value = map.get(parameterMap.getProperty());
            if (value instanceof String) {
                return "'" + value + "'";
            }
            return String.valueOf(value);
        } else {
            return String.valueOf(ReflectionUtil.callGetMybatisObjectProperty(parameter, parameterMap.getProperty()));
        }
    }
}
