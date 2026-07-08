package com.xweb.excel.utils;

import com.xweb.excel.annotation.Cell;
import com.xweb.excel.entity.CellInfo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class ExcelReflectUtil {

    private static final String GET = "get";
    private static final String SET = "set";


    public static List<CellInfo> getFieldsCellInfo(Class<?> classType) {
        List<CellInfo> list = new ArrayList<CellInfo>();
        Field[] fields = classType.getDeclaredFields();
        for (Field field : fields) {
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation.annotationType().isAssignableFrom(Cell.class)) {
                    CellInfo cellInfo = new CellInfo();
                    Cell cell = (Cell) annotation;
                    cellInfo.setName(cell.name());
                    cellInfo.setOrder(cell.order());
                    cellInfo.setCellWidth(cell.cellWidth());
                    cellInfo.setFieldName(field.getName());
                    list.add(cellInfo);
                }
            }
        }
        return list;
    }


    public static Object getCellValue(org.apache.poi.ss.usermodel.Cell cell) {
        Object result = null;
        if (cell != null) {
            switch (cell.getCellType()) {
                case org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING:
                    result = cell.getStringCellValue();
                    break;
                case org.apache.poi.ss.usermodel.Cell.CELL_TYPE_NUMERIC:
                    result = cell.getNumericCellValue();
                    break;
                case org.apache.poi.ss.usermodel.Cell.CELL_TYPE_BOOLEAN:
                    result = cell.getBooleanCellValue();
                    break;
                default:
                    result = "";
            }
        }
        return result;
    }

    public static String getGetMethodName(String fieldName) {
        String getMethod = GET + upFist(fieldName);
        return getMethod;
    }

    public static String getSetMethodName(String fieldName) {
        String setMethod = SET + upFist(fieldName);
        return setMethod;
    }

    public static Map<String, Method> getMethodMap(Class<?> classType) {
        Map<String, Method> methodMap = new HashMap<>();
        Field[] fields = classType.getDeclaredFields();
        for (Field field : fields) {
            Method[] methods = classType.getDeclaredMethods();
            for (Method method : methods) {
                String getMethod = GET + upFist(field.getName());
                String setMethod = SET + upFist(field.getName());
                if (method.getName().equals(getMethod)) {
                    methodMap.put(getMethod, method);
                } else if (method.getName().equals(setMethod)) {
                    methodMap.put(setMethod, method);
                }
            }
        }
        return methodMap;
    }


    public static void setBeanMethodValue(Object bean, Method method, Object data) throws Exception {
        Class<?> paramType = method.getParameterTypes()[0];
        if (String.class.isAssignableFrom(paramType)) {
            invoke(bean, method, data);
        } else if (int.class.isAssignableFrom(paramType) || Integer.class.isAssignableFrom(paramType)) {
            invoke(bean, method, Double.valueOf(data.toString()).intValue());
        } else if (long.class.isAssignableFrom(paramType) || Long.class.isAssignableFrom(paramType)) {
            invoke(bean, method, Long.valueOf(data.toString()).longValue());
        } else if (Long.class.isAssignableFrom(paramType)) {
            invoke(bean, method, Double.valueOf(data.toString()).longValue());
        } else if (Date.class.isAssignableFrom(paramType)) {
            invoke(bean, method, data);
        } else if (Calendar.class.isAssignableFrom(paramType)) {
            invoke(bean, method, data);
        } else {
            throw new RuntimeException("set method invoke error!!!");
        }
    }


    /**
     * key         dataType
     * value       poiType
     */
    private static Map<Object, Object> POI_TYPE_MAPPING = new HashMap<Object, Object>();


    /**
     *  void setCellValue(double value);
     *  void setCellValue(Date value);
     *  void setCellValue(Calendar value);
     *  void setCellValue(RichTextString value);
     *  void setCellValue(String value);
     */
    static {
        POI_TYPE_MAPPING.put(String.class, String.class);
        POI_TYPE_MAPPING.put(Calendar.class, Calendar.class);
        POI_TYPE_MAPPING.put(Date.class, Date.class);
        POI_TYPE_MAPPING.put(Double.class, Double.class);
        POI_TYPE_MAPPING.put(Integer.class, Double.class);
        POI_TYPE_MAPPING.put(int.class, Double.class);
        POI_TYPE_MAPPING.put(long.class, Double.class);
        POI_TYPE_MAPPING.put(Long.class, Double.class);
    }


    public static void setCellValue(org.apache.poi.ss.usermodel.Cell cell, Object data, Class<?> paramType) {
        Class<?> poiCls = (Class<?>) POI_TYPE_MAPPING.get(paramType);
        if (null == poiCls) {
            cell.setCellValue(data.toString());
        } else if (poiCls.isAssignableFrom(Double.class)) {
            cell.setCellValue(Double.valueOf(data.toString()));
        } else if (poiCls.isAssignableFrom(Date.class)) {
            cell.setCellValue((Date) data);
        } else if (poiCls.isAssignableFrom(Calendar.class)) {
            cell.setCellValue((Calendar) data);
        } else {
            cell.setCellValue(data.toString());
        }
    }

    public static Object invoke(Object bean, Method method, Object... args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        return method.invoke(bean, args);
    }


    public static String upFist(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
