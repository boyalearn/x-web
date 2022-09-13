package com.xweb.common.utils;

import java.util.HashMap;
import java.util.Map;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/9/13 17:12
 ******************************/
public class XWebAuthHelper {

    private static final ThreadLocal<Map> THREAD_LOCAL = new ThreadLocal<>();

    public static void init() {
        THREAD_LOCAL.set(new HashMap());
    }

    public static Map<String, Object> getLoginInfo() {
        return THREAD_LOCAL.get();
    }

    public static void setLoginInfo(Map<String, Object> userInfo) {
        THREAD_LOCAL.set(userInfo);
    }
}
