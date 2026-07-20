package com.xweb.common.auth.interceptor;

import com.xweb.common.auth.Auth;
import com.xweb.common.auth.XWebTokenEnhancer;
import com.xweb.common.exception.BusinessException;
import com.xweb.common.utils.XWebAuthHelper;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/8/28 12:52
 ******************************/
public class XWebAuthInterceptor implements HandlerInterceptor {

    private static final String ACCESS_TOKEN_KEY = "x-access-token";

    private static final String ROLE_KEY = "roles";

    private static final String RESOURCE_KEY = "resources";

    private static final String USER_KEY = "user";

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
                loginInfo = tokenEnhancer.decode(request.getHeader(ACCESS_TOKEN_KEY));
                XWebAuthHelper.setLoginInfo(loginInfo);

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
            Object userRoles = loginInfo.get(ROLE_KEY);
            if (null == userRoles) {
                throw new BusinessException(BusinessException.AUTH_EXCEPTION, "无权限");
            }
            List tokenRoles = (List)userRoles;
            for (String role : roles) {
                if (!tokenRoles.contains(role)) {
                    throw new BusinessException(BusinessException.AUTH_EXCEPTION, "无权限");
                }
            }
        }
    }

    private void checkResource(Auth annotation, Map<String, Object> loginInfo) throws BusinessException {
        String[] resources = annotation.resources();
        if (null != resources && resources.length != 0) {
            Object userResources = loginInfo.get(RESOURCE_KEY);
            if (null == userResources) {
                throw new BusinessException(BusinessException.AUTH_EXCEPTION, "无权限");
            }
            List tokenResource = (List)userResources;
            for (String resource : resources) {
                if (!tokenResource.contains(resource)) {
                    throw new BusinessException(BusinessException.AUTH_EXCEPTION, "无权限");
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
