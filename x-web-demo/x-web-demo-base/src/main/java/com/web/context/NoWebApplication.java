package com.web.context;

import org.springframework.beans.BeanUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author zouhuixing
 * @date 2023/8/10
 */
public class NoWebApplication extends SpringApplication {
    @Override
    protected ConfigurableApplicationContext createApplicationContext() {
        Class<?> contextClass = null;
        try {
            contextClass = Class.forName("org.springframework.context.annotation.AnnotationConfigApplicationContext");
            super.setApplicationContextClass((Class<? extends ConfigurableApplicationContext>) contextClass);
        } catch (Exception e) {

        }
        return (ConfigurableApplicationContext) BeanUtils.instantiateClass(contextClass);

    }
}
