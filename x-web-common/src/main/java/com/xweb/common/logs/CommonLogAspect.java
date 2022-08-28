package com.xweb.common.logs;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.lang.reflect.Method;

@Aspect
public class CommonLogAspect implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Pointcut("@annotation(com.huacloud.common.web.logs.Logging)")
    public void logsPointCut() {
    }


    @Around(value = "logsPointCut()")
    public Object doCacheAround(ProceedingJoinPoint pjp) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) pjp.getSignature();
        Method method = methodSignature.getMethod();
        Object[] args = pjp.getArgs();
        Logging logging = method.getAnnotation(Logging.class);
        Exception exception = null;
        Object object = null;
        try {
            object = pjp.proceed(args);
            return object;
        } catch (Exception e) {
            exception = e;
            throw exception;
        } finally {
            OptionalExecutor executor = (OptionalExecutor) this.applicationContext.getBean(logging.executor());
            Object collectData = executor.collect(logging, args, object, exception);
            executor.save(collectData);
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
