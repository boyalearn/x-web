package com.xweb.config.exeception.process;

import com.xweb.common.exception.BusinessException;
import com.xweb.common.standard.RespResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.UnexpectedTypeException;

/**
 * 异常处理参考统一异常处理类定义
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {


    @ResponseBody
    @ExceptionHandler(value = BusinessException.class)
    public RespResult businessExceptionHandler(BusinessException e) {
        log.error("BusinessException", e);
        return RespResult.builder().code(e.getCode()).message(e.getMessage()).build();
    }

    @ResponseBody
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public RespResult MethodArgumentNotValidHandler(MethodArgumentNotValidException e) {
        log.error("MethodArgumentNotValidException", e);
        FieldError error = e.getBindingResult().getFieldErrors().get(0);
        return RespResult.builder().code(BusinessException.PARAMETER_EXCEPTION).message(error.getDefaultMessage()).build();
    }

    @ResponseBody
    @ExceptionHandler(value = BindException.class)
    public RespResult bindExceptionHandler(BindException e) {
        log.error("BindException", e);
        FieldError error = e.getBindingResult().getFieldErrors().get(0);
        return RespResult.builder().code(BusinessException.PARAMETER_EXCEPTION).message(error.getDefaultMessage()).build();
    }

    @ResponseBody
    @ExceptionHandler(value = UnexpectedTypeException.class)
    public RespResult unexpectedTypeExceptionHandler(UnexpectedTypeException e) {
        log.error("UnexpectedTypeException", e);
        return RespResult.builder().code(BusinessException.PARAMETER_EXCEPTION).message(e.getMessage()).build();
    }

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public RespResult exceptionHandler(Exception e) {
        log.error("Exception", e);
        return RespResult.builder().code(BusinessException.SYSTEM_EXCEPTION).message(e.getMessage()).build();
    }

}
