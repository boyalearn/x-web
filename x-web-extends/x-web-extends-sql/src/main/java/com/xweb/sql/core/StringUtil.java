package com.xweb.sql.core;


public final class StringUtil {

    public static boolean isEmpty(String str) {
        return str == null || str.trim() == "";
    }

    public static String replaceAllEmpty(String str) {
        String result = str.replaceAll("\\s+", "");
        return result;
    }
}
