package com.xweb.auth.server.oauth;

import org.springframework.security.authentication.AuthenticationDetailsSource;

import javax.servlet.http.HttpServletRequest;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/8/27 21:34
 ******************************/
public class XAuthAuthenticationDetailsSource implements AuthenticationDetailsSource<HttpServletRequest, XAuthWebAuthentication> {
    @Override
    public XAuthWebAuthentication buildDetails(HttpServletRequest httpServletRequest) {
        return new XAuthWebAuthentication(httpServletRequest);
    }
}
