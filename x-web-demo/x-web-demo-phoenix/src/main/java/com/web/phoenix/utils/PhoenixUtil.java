package com.web.phoenix.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zouhuixing
 * @date 2024/3/22
 */
public class PhoenixUtil {

    private static Map<Integer, String> DATA_TYPE_NAME = new HashMap<Integer, String>();

    public static String indexOfDataType(Integer index) {
        return DATA_TYPE_NAME.get(index);
    }

    static {
        DATA_TYPE_NAME.put(1, "VARCHAR");
        DATA_TYPE_NAME.put(2, "CHAR");
        DATA_TYPE_NAME.put(3, "BOOLEAN");
        DATA_TYPE_NAME.put(4, "TINYINT");
        DATA_TYPE_NAME.put(5, "SMALLINT");
        DATA_TYPE_NAME.put(6, "INTEGER");
        DATA_TYPE_NAME.put(7, "BIGINT");
        DATA_TYPE_NAME.put(8, "FLOAT");
        DATA_TYPE_NAME.put(9, "DOUBLE");
        DATA_TYPE_NAME.put(10, "DECIMAL");
        DATA_TYPE_NAME.put(11, "TIMESTAMP");
        DATA_TYPE_NAME.put(12, "DATE");
        DATA_TYPE_NAME.put(13, "BINARY");
        DATA_TYPE_NAME.put(14, "VARBINARY");
    }
}
