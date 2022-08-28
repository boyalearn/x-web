package com.xweb.auth.server.oauth;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;

import java.util.ArrayList;
import java.util.Collection;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/8/27 4:27
 ******************************/
public class XAuthAuthenticationManager implements AuthenticationManager {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        return new Authentication() {

            private boolean authenticated=false;

            @Override
            public Collection<? extends GrantedAuthority> getAuthorities() {
                return new ArrayList<>();
            }

            @Override
            public Object getCredentials() {
                return "123";
            }

            @Override
            public Object getDetails() {
                return "";
            }

            @Override
            public Object getPrincipal() {
                return "";
            }

            @Override
            public boolean isAuthenticated() {
                return this.authenticated;
            }

            @Override
            public void setAuthenticated(boolean b) throws IllegalArgumentException {
                this.authenticated=b;
            }

            @Override
            public String getName() {
                return "aa";
            }
        };
    }
}
