package com.xweb.auth.server.oauth;

import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.AccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

import java.util.Map;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/8/27 4:14
 ******************************/
public class XAuthAccessTokenConverter extends JwtAccessTokenConverter {
    @Override
    public Map<String, ?> convertAccessToken(OAuth2AccessToken oAuth2AccessToken, OAuth2Authentication oAuth2Authentication) {
        return super.convertAccessToken(oAuth2AccessToken,oAuth2Authentication);
    }

    @Override
    public OAuth2AccessToken extractAccessToken(String s, Map<String, ?> map) {
        return super.extractAccessToken(s,map);
    }

    @Override
    public OAuth2Authentication extractAuthentication(Map<String, ?> map) {
        return super.extractAuthentication(map);
    }
}
