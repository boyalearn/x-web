package com.xweb.auth.server.config;

import com.xweb.auth.server.oauth.XAuthAuthenticationProvider;
import com.xweb.auth.server.oauth.XAuthPasswordEncoder;
import com.xweb.auth.server.oauth.XAuthUserDetailsService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;
import java.util.Collections;

@Configuration
@AllArgsConstructor
public class XAuthResourceWebSecurityConfig extends WebSecurityConfigurerAdapter {

    private XAuthUserDetailsService userDetailsService;

    /**
     * security配置
     *
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().mvcMatchers("/oauth/authorize").authenticated()
                .and()
                .formLogin().loginPage("/login").loginProcessingUrl("/login")
                .and()
                .csrf().disable();
        http.headers().frameOptions().sameOrigin();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(new XAuthAuthenticationProvider(userDetailsService));
        auth.userDetailsService(userDetailsService).passwordEncoder(new XAuthPasswordEncoder());
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
