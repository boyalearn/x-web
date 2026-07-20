package com.xweb.auth.server.oauth;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2RefreshToken;

import java.util.Date;
import java.util.Map;
import java.util.Set;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/8/28 1:35
 ******************************/
@Getter
@Setter
public class XAuthOAuth2AccessToken extends DefaultOAuth2AccessToken {

    public XAuthOAuth2AccessToken(String value) {
        super(value);
    }

    public XAuthOAuth2AccessToken(OAuth2AccessToken accessToken) {
        super(accessToken);
    }
}
