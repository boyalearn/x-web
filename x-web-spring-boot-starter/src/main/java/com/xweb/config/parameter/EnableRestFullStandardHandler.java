package com.xweb.config.parameter;

import com.xweb.config.exeception.EnableGlobalExceptionHandler;
import com.xweb.config.parameter.process.RestFullStandardConfigurationImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(RestFullStandardConfigurationImportSelector.class)
@EnableGlobalExceptionHandler
public @interface EnableRestFullStandardHandler {
}
