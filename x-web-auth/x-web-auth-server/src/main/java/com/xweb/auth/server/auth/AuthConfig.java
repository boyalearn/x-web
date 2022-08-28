package com.xweb.auth.server.auth;

import com.xweb.auth.server.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/8/27 3:59
 ******************************/

@Configuration
public class AuthConfig {

    @Bean
    public XAuthAuthenticationDetailsSource authAuthenticationDetailsSource() {
        return new XAuthAuthenticationDetailsSource();
    }

    @Bean
    public XAuthUserDetailsService userDetailsService(IUserService userService) {
        return new XAuthUserDetailsService(userService);
    }

    @Bean
    public XAuthAuthenticationProvider authenticationProvider(XAuthUserDetailsService userDetailsService) {
        return new XAuthAuthenticationProvider(userDetailsService);
    }

    @Bean
    public XAuthTokenEnhancer authTokenEnhancer(IUserService userService) {
        XAuthTokenEnhancer tokenEnhancer = new XAuthTokenEnhancer(userService);
        tokenEnhancer.setSigningKey("1234");
        return tokenEnhancer;
    }

    @EnableAuthorizationServer
    @Configuration
    public class OAuth2AuthorizationServerConfigurerAdapter extends AuthorizationServerConfigurerAdapter {

        @Autowired
        private XAuthUserDetailsService userDetailsService;

        @Autowired
        private XAuthClientDetailsService clientDetailsService;

        @Autowired
        private XAuthTokenEnhancer tokenEnhancer;

        @Override
        public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
            security.tokenKeyAccess("permitAll()")
                    .checkTokenAccess("permitAll()")
                    .allowFormAuthenticationForClients()
                    .passwordEncoder(new XAuthPasswordEncoder());
        }

        /**
         * 客户端授权定义
         *
         * @param clients
         * @throws Exception
         */
        @Override
        public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
            clients.withClientDetails(clientDetailsService);
        }

        /**
         * token授权
         *
         * @param endpoints
         * @throws Exception
         */
        @Override
        public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {

            endpoints.authenticationManager(new XAuthAuthenticationManager())
                    .allowedTokenEndpointRequestMethods(HttpMethod.GET, HttpMethod.POST, HttpMethod.PUT, HttpMethod.DELETE)
                    .tokenStore(new InMemoryTokenStore())
                    .tokenEnhancer(tokenEnhancer)
                    .accessTokenConverter(new XAuthAccessTokenConverter())
                    .userDetailsService(userDetailsService);
            endpoints.pathMapping("/oauth/confirm_access", "/xauth/confirm_access")
                    .allowedTokenEndpointRequestMethods(HttpMethod.POST);
        }
    }

    @Configuration
    public class OAuth2WebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {

        @Autowired
        private XAuthAuthenticationProvider authenticationProvider;

        @Autowired
        private XAuthAuthenticationDetailsSource authenticationDetailsSource;

        @Autowired
        private XAuthUserDetailsService userDetailsService;

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
            http.authorizeRequests()
                    .antMatchers(
                            "/xauth/**",
                            "/login",
                            "/xauth/token"
                    )
                    .permitAll() // 允许匿名访问的地址
                    .and()
                    .authorizeRequests()
                    .anyRequest()
                    .authenticated() // 其它地址都需进行认证
                    .and()
                    .formLogin()
                    .loginPage("/login")
                    .loginProcessingUrl("/login")
                    .authenticationDetailsSource(authenticationDetailsSource)
                    .and()
                    .sessionManagement()
                    .and()
                    .csrf()
                    .disable();
        }

        @Override
        protected void configure(AuthenticationManagerBuilder auth) throws Exception {
            auth.authenticationProvider(authenticationProvider);
            auth.userDetailsService(userDetailsService).passwordEncoder(new XAuthPasswordEncoder());
        }

    }
}
