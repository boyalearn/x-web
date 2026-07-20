package com.xweb.auth.server.oauth;

import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.Collection;

/******************************
 * 用途说明: 密码式授权支持
 * 作者姓名: zouhuixing
 * 创建时间: 2022/8/27 4:27
 ******************************/
@AllArgsConstructor
public class XAuthAuthenticationManager implements AuthenticationManager {

    private XAuthUserDetailsService userDetailsService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        XAuthAuthentication authAuthentication = new XAuthAuthentication();
        authAuthentication.setDetails(authentication.getDetails());
        authAuthentication.setPrincipal(authentication.getPrincipal());
        authAuthentication.setCredentials(authentication.getCredentials());

        String userName = (String) authentication.getPrincipal();
        String password = (String) authentication.getCredentials();

        UserDetails userDetails = userDetailsService.loadUserByUsername(userName);
        String dbPassword = userDetails.getPassword();

        if(!dbPassword.equals(password)){
            throw new UsernameNotFoundException("用户名密码错误");
        }

        authAuthentication.setAuthenticated(true);
        authAuthentication.setAuthorities(authentication.getAuthorities());
        return authAuthentication;


    }
}
