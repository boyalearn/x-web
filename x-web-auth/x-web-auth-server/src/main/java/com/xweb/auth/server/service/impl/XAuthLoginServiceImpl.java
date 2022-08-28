package com.xweb.auth.server.service.impl;

import com.xweb.auth.server.service.IXAuthLoginService;
import com.xweb.auth.server.util.TemplateUtil;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.oauth2.provider.AuthorizationRequest;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/8/28 0:25
 ******************************/
@Service
public class XAuthLoginServiceImpl implements IXAuthLoginService {

    private static final String LOGIN_URL = "/login";

    private static final String LOGIN_KEY = "login_url";

    private static final String ERROR_KEY = "error_msg";

    private static final String CONTEXT_TYPE = "text/html;charset=UTF-8";

    private static final String LOGIN_TEMPLATE = "login.html";

    private static final String GRANT_TEMPLATE = "grant.html";

    private static final String LAST_EXCEPTION_KEY = "SPRING_SECURITY_LAST_EXCEPTION";

    private static final String SCOPE = "scopes";

    private static final String CLIENT_ID = "clientId";

    private static final String AUTHORIZATION_REQUEST = "authorizationRequest";

    @Override
    public void doLogin(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map model = new HashMap();
        model.put(LOGIN_KEY, LOGIN_URL);

        AuthenticationException exception = (AuthenticationException) request.getSession().getAttribute(LAST_EXCEPTION_KEY);
        if (Optional.ofNullable(exception).isPresent()) {
            model.put(ERROR_KEY, exception.getMessage());
        }
        String template = TemplateUtil.getTemplate(model, LOGIN_TEMPLATE);
        response.setContentType(CONTEXT_TYPE);
        response.setContentLength(template.getBytes(StandardCharsets.UTF_8).length);
        response.getWriter().write(template);
    }

    @Override
    public void doConfirm(Map<String, Object> model, HttpServletResponse response) throws Exception {
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) model.get(AUTHORIZATION_REQUEST);
        Map data = new HashMap();
        data.put(CLIENT_ID, authorizationRequest.getClientId());
        data.put(SCOPE, authorizationRequest.getScope());
        String template = TemplateUtil.getTemplate(data, GRANT_TEMPLATE);
        response.setContentType(CONTEXT_TYPE);
        response.setContentLength(template.getBytes(StandardCharsets.UTF_8).length);
        response.getWriter().write(template);
    }
}
