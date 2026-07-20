package com.xweb.auth.server.oauth;

import com.xweb.auth.server.service.IUserService;
import lombok.NoArgsConstructor;
import org.springframework.security.oauth2.common.DefaultOAuth2RefreshToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2RefreshToken;
import org.springframework.security.oauth2.common.util.JsonParser;
import org.springframework.security.oauth2.common.util.JsonParserFactory;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/8/27 4:09
 ******************************/

@NoArgsConstructor
public class XAuthAccessTokenEnhancer extends JwtAccessTokenConverter {


    private static final Set<String> CUSTOM_GRANT_TYPES = new HashSet<String>(Arrays.asList(new String[]{"password", "implicit"}));

    private static JsonParser objectMapper = JsonParserFactory.create();

    private IUserService userService;

    public XAuthAccessTokenEnhancer(IUserService userService) {
        this.userService = userService;
    }

    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
        XAuthOAuth2AccessToken result = new XAuthOAuth2AccessToken(accessToken);
        OAuth2RefreshToken refreshToken = result.getRefreshToken();
        result.setValue(this.encode(result, authentication));
        if (refreshToken != null) {
            XAuthOAuth2AccessToken encodedRefreshToken = new XAuthOAuth2AccessToken(accessToken);

            DefaultOAuth2RefreshToken token = new DefaultOAuth2RefreshToken(this.encode(encodedRefreshToken, authentication));

            result.setRefreshToken(token);
        }
        return result;
    }

}
