package com.xweb.logger.interceptor;

import com.xweb.common.auth.XWebTokenEnhancer;
import com.xweb.common.exception.BusinessException;
import com.xweb.common.utils.XWebAuthHelper;
import com.xweb.logger.annotation.XWebLogger;
import com.xweb.logger.entity.LoggerBean;
import com.xweb.logger.service.ILoggerService;
import com.xweb.logger.utils.XWebLoggerHelper;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.Optional;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/9/13 10:15
 ******************************/
public class XWebLoggerInterceptor implements HandlerInterceptor {

    private static final String ACCESS_TOKEN_KEY = "x-access-token";

    private ILoggerService loggerService;

    private XWebTokenEnhancer tokenEnhancer;

    public XWebLoggerInterceptor(ILoggerService loggerService, XWebTokenEnhancer tokenEnhancer) {
        this.loggerService = loggerService;
        this.tokenEnhancer = tokenEnhancer;

    }


    @Override
    public boolean preHandle(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, Object handler) throws Exception {
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        XWebLogger loggerAnnotation = method.getAnnotation(XWebLogger.class);
        if (Optional.ofNullable(loggerAnnotation).isPresent()) {
            XWebLoggerHelper.init();
            XWebLoggerHelper.setModel(loggerAnnotation.model());
            XWebLoggerHelper.setOption(loggerAnnotation.option());
            XWebLoggerHelper.setDescription(loggerAnnotation.description());
            Map<String, Object> loginInfo;
            try {
                loginInfo = tokenEnhancer.decode(request.getHeader(ACCESS_TOKEN_KEY));
                XWebAuthHelper.setLoginInfo(loginInfo);

            } catch (Exception e) {
                throw new BusinessException(BusinessException.SYSTEM_EXCEPTION, "token error");
            }
            if (Optional.ofNullable(loginInfo).isPresent()) {
                Object userId = loginInfo.get("user_id");
                Object applicationId = loginInfo.get("application_id");
                XWebLoggerHelper.setUserId(String.valueOf(userId));
                XWebLoggerHelper.setClientId(String.valueOf(applicationId));
            }
        }
        return true;
    }

    @Override
    public void postHandle(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, Object handler, Exception ex) throws Exception {
        if (!(handler instanceof HandlerMethod)) {
            return;
        }
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        XWebLogger loggerAnnotation = method.getAnnotation(XWebLogger.class);
        if (Optional.ofNullable(loggerAnnotation).isPresent()) {
            LoggerBean systemLogger = new LoggerBean();
            systemLogger.setUserId(XWebLoggerHelper.getUserId() == null ? null : Integer.valueOf(XWebLoggerHelper.getUserId()));
            systemLogger.setClientId(XWebLoggerHelper.getClientId() == null ? null : Integer.valueOf(XWebLoggerHelper.getClientId()));
            systemLogger.setModel(XWebLoggerHelper.getModel());
            systemLogger.setDescription(XWebLoggerHelper.getDescription());
            systemLogger.setOption(XWebLoggerHelper.getOption());
            loggerService.saveLogger(systemLogger);
        }
    }
}
