package com.xweb.config.exeception;

import com.xweb.config.exeception.process.EnableGlobalExceptionHandlerImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(EnableGlobalExceptionHandlerImportSelector.class)
public @interface EnableGlobalExceptionHandler {
    boolean value() default true;
}
