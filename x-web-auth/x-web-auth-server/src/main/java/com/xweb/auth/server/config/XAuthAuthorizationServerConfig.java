package com.xweb.auth.server.config;

import com.xweb.auth.server.oauth.*;
import com.xweb.auth.server.service.IClientService;
import com.xweb.auth.server.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;

@Configuration
@EnableAuthorizationServer
@AllArgsConstructor
public class XAuthAuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

    private IClientService clientService;

    private IUserService userService;


    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        security.tokenKeyAccess("permitAll()")
                .checkTokenAccess("permitAll()")
                .allowFormAuthenticationForClients();
    }

    /**
     * 客户端授权定义
     *
     * @param clients
     * @throws Exception
     *
     */
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.withClientDetails(new XAuthClientDetailsService(clientService));
    }

    /**
     * token授权
     *
     * @param endpoints
     * @throws Exception
     */
    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.authenticationManager(new XAuthAuthenticationManager(new XAuthUserDetailsService(userService)))
                .tokenStore(new InMemoryTokenStore())
                .exceptionTranslator(new XAuthWebResponseExceptionTranslator())
                .tokenEnhancer(new XAuthAccessTokenEnhancer())
                .accessTokenConverter(new XAuthAccessTokenConverter())
                .userDetailsService(new XAuthUserDetailsService(userService))
                .pathMapping("/oauth/confirm_access", "/xauth/confirm_access")
                .pathMapping("/oauth/error", "/xauth/error")
                .allowedTokenEndpointRequestMethods(HttpMethod.GET, HttpMethod.POST, HttpMethod.PUT, HttpMethod.DELETE);
    }


}
