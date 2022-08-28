package com.xweb.common.resolver;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FormKey {
    String value() default "";
}
