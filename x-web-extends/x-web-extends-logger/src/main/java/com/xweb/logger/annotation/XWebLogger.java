package com.xweb.logger.annotation;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface XWebLogger {

    String model() default "";

    String option() default "";

    String description() default "";
}
