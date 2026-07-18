package com.xweb.auth.server.config;

import com.xweb.auth.server.oauth.XAuthAuthenticationManager;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class XAuthResourceWebSecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 支持授权码的方式
     *
     * @return
     * @throws Exception
     */
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return new XAuthAuthenticationManager();
    }

    /**
     * security配置
     *
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().mvcMatchers("/xauth/**","/xauth/**/**").permitAll()
                .and()
                .formLogin().loginPage("/login").loginProcessingUrl("/login")
                //.authenticationDetailsSource(authenticationDetailsSource)
                .and()
                .csrf().disable();
        http.headers().frameOptions().sameOrigin();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().mvcMatchers(
                "/xauth/**",
                "/swagger-ui.html",
                "/webjars/**",
                "/swagger-resources/**",
                "/v2/**");
    }
}
