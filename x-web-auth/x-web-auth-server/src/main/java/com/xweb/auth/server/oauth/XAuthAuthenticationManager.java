package com.xweb.auth.server.oauth;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;

import java.util.ArrayList;
import java.util.Collection;

/******************************
 * 用途说明: 密码式生成器
 * 作者姓名: zouhuixing
 * 创建时间: 2022/8/27 4:27
 ******************************/
public class XAuthAuthenticationManager implements AuthenticationManager {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        XAuthAuthentication authAuthentication = new XAuthAuthentication();
        authAuthentication.setDetails(authentication.getDetails());
        authAuthentication.setPrincipal(authentication.getPrincipal());
        authAuthentication.setCredentials(authentication.getCredentials());
        authAuthentication.setAuthenticated(true);
        authAuthentication.setAuthorities(authentication.getAuthorities());
        return authAuthentication;


    }
}
