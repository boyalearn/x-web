package com.xweb.auth.server.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class XAuthResourceWebSecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * security配置
     *
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().mvcMatchers("/xauth/**","/xauth/**/**").permitAll()
                .mvcMatchers("/oauth/authorize").authenticated()
                .and()
                .formLogin().loginPage("/login").loginProcessingUrl("/login")
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
