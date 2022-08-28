package com.xweb.common.process;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(EnableGlobalExceptionHandlerImportSelector.class)
public @interface EnableGlobalExceptionHandler {
    boolean value() default false;
}
