package com.xweb.auth.server.auth;

import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.AccessTokenConverter;

import java.util.Map;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/8/27 4:14
 ******************************/
public class XAuthAccessTokenConverter implements AccessTokenConverter {
    @Override
    public Map<String, ?> convertAccessToken(OAuth2AccessToken oAuth2AccessToken, OAuth2Authentication oAuth2Authentication) {
        return null;
    }

    @Override
    public OAuth2AccessToken extractAccessToken(String s, Map<String, ?> map) {
        return null;
    }

    @Override
    public OAuth2Authentication extractAuthentication(Map<String, ?> map) {
        return null;
    }
}
