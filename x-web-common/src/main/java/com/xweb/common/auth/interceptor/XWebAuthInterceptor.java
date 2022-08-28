package com.xweb.common.auth.interceptor;

import com.xweb.common.auth.Auth;
import com.xweb.common.auth.XWebTokenEnhancer;
import com.xweb.common.exception.BusinessException;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Optional;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/8/28 12:52
 ******************************/
public class XWebAuthInterceptor implements HandlerInterceptor {

    private XWebTokenEnhancer tokenEnhancer;

    public XWebAuthInterceptor(XWebTokenEnhancer tokenEnhancer) {
        this.tokenEnhancer = tokenEnhancer;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        Auth auth = method.getAnnotation(Auth.class);
        if (Optional.ofNullable(auth).isPresent()) {
            Map<String, Object> loginInfo;
            try {
                loginInfo = tokenEnhancer.decode(request.getHeader("token"));
            } catch (Exception e) {
                throw new BusinessException(BusinessException.SYSTEM_EXCEPTION, "token error");
            }
            checkRole(auth, loginInfo);
            checkResource(auth, loginInfo);
        }
        return true;
    }

    private void checkRole(Auth annotation, Map<String, Object> loginInfo) throws BusinessException {
        String[] roles = annotation.roles();
        if (null != roles && roles.length != 0) {
            Object userRoles = loginInfo.get("roles");
            if (null == userRoles) {
                throw new BusinessException(BusinessException.AUTH_EXCEPTION, "your role not access");
            }
            String roleStr = String.valueOf(userRoles);
            for (String role : roles) {
                if (!roleStr.contains(role)) {
                    throw new BusinessException(BusinessException.AUTH_EXCEPTION, "your role not access");
                }
            }
        }
    }

    private void checkResource(Auth annotation, Map<String, Object> loginInfo) throws BusinessException {
        String[] resources = annotation.resources();
        if (null != resources && resources.length != 0) {
            Object userResources = loginInfo.get("resources");
            if (null == userResources) {
                throw new BusinessException(BusinessException.AUTH_EXCEPTION, "your auth not access");
            }
            String resourceStr = String.valueOf(userResources);
            for (String resource : resources) {
                if (!resourceStr.contains(resource)) {
                    throw new BusinessException(BusinessException.AUTH_EXCEPTION, "your auth not access");
                }
            }
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
