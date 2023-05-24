package com.xweb.common.web.parameter.resolver;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FormKey {
    String value() default "";
}
