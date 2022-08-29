package com.xweb.auth.server.service.impl;

import com.xweb.auth.server.service.IXAuthLoginService;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.oauth2.provider.AuthorizationRequest;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.Optional;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/8/28 0:25
 ******************************/
@Service
public class XAuthLoginServiceImpl implements IXAuthLoginService {

    private static final String ERROR_KEY = "error_msg";

    private static final String LOGIN_TEMPLATE = "xauth_login";

    private static final String GRANT_TEMPLATE = "xauth_grant.html";

    private static final String LAST_EXCEPTION_KEY = "SPRING_SECURITY_LAST_EXCEPTION";

    private static final String SCOPE = "scopes";

    private static final String CLIENT_ID = "clientId";

    private static final String AUTHORIZATION_REQUEST = "authorizationRequest";

    @Override
    public String doLogin(HttpServletRequest request, Model model) throws Exception {
        AuthenticationException exception = (AuthenticationException) request.getSession().getAttribute(LAST_EXCEPTION_KEY);
        if (Optional.ofNullable(exception).isPresent()) {
            model.addAttribute(ERROR_KEY, exception.getMessage());
        }
        return LOGIN_TEMPLATE;
    }

    @Override
    public ModelAndView doConfirm(Map<String, Object> model, HttpServletResponse response) throws Exception {
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) model.get(AUTHORIZATION_REQUEST);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(CLIENT_ID, authorizationRequest.getClientId());
        modelAndView.addObject(SCOPE, authorizationRequest.getScope());
        modelAndView.setViewName(GRANT_TEMPLATE);
        return modelAndView;
    }
}
