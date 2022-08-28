package com.xweb.common.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BusinessException extends Exception {

    public static final String SUCCESS_CODE = "0000";

    public static final String PARAMETER_EXCEPTION = "PE.0001";

    public static final String SYSTEM_EXCEPTION = "SE.0001";

    public static final String BUSINESS_EXCEPTION = "BE.0001";

    public static final String TIMEOUT_EXCEPTION = "TE.0001";

    public static final String AUTH_EXCEPTION = "AE.0001";

    private String message;

    private String code;


    public BusinessException(String code, String message) {
        this.message = message;
        this.code = code;
    }

    /**
     * 业务编码
     *
     * @param code    code字母加4位数值的形式0000正常返回PE.0001参数异常SE.0001系统异常（不知道属于哪一类的都属于这类异常）BE.0001业务异常TE.0001超时异常
     * @param message
     * @param cause
     */
    public BusinessException(String code, String message, Throwable cause) {
        super(message, cause);
        this.message = message;
        this.code = code;
    }
}
