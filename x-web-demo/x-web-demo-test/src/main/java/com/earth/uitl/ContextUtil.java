package com.earth.uitl;

import org.springframework.context.ApplicationContext;

public class ContextUtil {

    private static ApplicationContext context;

    public static void init(ApplicationContext context) {
        ContextUtil.context = context;
    }

    public static ApplicationContext context() {
        return context;
    }
}
