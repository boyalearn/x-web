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
        http.authorizeRequests().mvcMatchers("/roles","/roles/**").permitAll()
                .mvcMatchers("/oauth/authorize").authenticated()
                .and()
                .formLogin().loginPage("/login").loginProcessingUrl("/login")
                .and()
                .csrf().disable();//.cors().configurationSource(corsConfigurationSource());
        http.headers().frameOptions().sameOrigin();
    }

    // 定义CORS配置源
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS")); // 允许的方法列表
        configuration.setAllowedHeaders(Arrays.asList("Authorization", "Cache-Control", "Content-Type")); // 允许的头部列表
        configuration.setAllowCredentials(true); // 允许携带cookie等认证信息
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration); // 对所有路径应用CORS配置
        return source;
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
