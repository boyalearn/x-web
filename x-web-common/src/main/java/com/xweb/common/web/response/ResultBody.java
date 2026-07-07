package com.xweb.common.web.response;


import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ResultBody {

    /**
     *
     * @return
     */
    String[] fields() default {};

    OpType op() default OpType.INCLUDE;
}
