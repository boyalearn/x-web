package com.xweb.auth.server.auth;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collection;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/8/27 21:12
 ******************************/
@Slf4j
public class XAuthAuthenticationProvider implements AuthenticationProvider {

    private XAuthUserDetailsService userDetailsService;

    public XAuthAuthenticationProvider(XAuthUserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        XAuthWebAuthentication details = (XAuthWebAuthentication) (authentication.getDetails());

        String username = details.getUsername();
        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        String dbPassword = userDetails.getPassword();

        if(!dbPassword.equals(details.getPassword())){

            throw new UsernameNotFoundException("用户名密码错误");
        }

        Collection<GrantedAuthority> auths =
                (Collection<GrantedAuthority>) userDetails.getAuthorities();
        return new UsernamePasswordAuthenticationToken(details.getUsername(), details.getPassword(), auths);

    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
