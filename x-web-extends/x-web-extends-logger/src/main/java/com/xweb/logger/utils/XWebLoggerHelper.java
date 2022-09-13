package com.xweb.logger.utils;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/9/13 11:00
 ******************************/
public class XWebLoggerHelper {

    private String description;

    private String userId;

    private String clientId;

    private String model;

    private String option;

    private static final ThreadLocal<XWebLoggerHelper> THREAD_LOCAL = new ThreadLocal<>();

    public static void init() {
        THREAD_LOCAL.set(new XWebLoggerHelper());
    }

    public static void setUserId(String userId) {
        THREAD_LOCAL.get().userId = userId;
    }

    public static void setClientId(String clientId) {
        THREAD_LOCAL.get().clientId = clientId;
    }

    public static void setModel(String model) {
        THREAD_LOCAL.get().model = model;
    }

    public static void setOption(String option) {
        THREAD_LOCAL.get().option = option;
    }

    public static void setDescription(String description) {
        THREAD_LOCAL.get().description = description;
    }

    public static String getUserId() {
        return THREAD_LOCAL.get().userId;
    }

    public static String getClientId() {
        return THREAD_LOCAL.get().clientId;
    }

    public static String getModel() {
        return THREAD_LOCAL.get().model;
    }

    public static String getOption() {
        return THREAD_LOCAL.get().option;
    }

    public static String getDescription() {
        return THREAD_LOCAL.get().description;
    }


    public static void clear() {
        THREAD_LOCAL.remove();
    }
}
