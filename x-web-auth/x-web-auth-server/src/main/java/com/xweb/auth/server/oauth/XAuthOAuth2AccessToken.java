package com.xweb.auth.server.oauth;

import lombok.Getter;
import lombok.Setter;
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
public class XAuthOAuth2AccessToken implements OAuth2AccessToken {

    private Map<String, Object> additionalInformation;

    private Set<String> scope;

    private OAuth2RefreshToken refreshToken;

    private String tokenType;

    private boolean expired;

    private Date expiration;

    private String value;

    private int expiresIn;

    @Override
    public Map<String, Object> getAdditionalInformation() {
        return additionalInformation;
    }

    @Override
    public Set<String> getScope() {
        return scope;
    }

    @Override
    public OAuth2RefreshToken getRefreshToken() {
        return null;
    }

    @Override
    public String getTokenType() {
        return tokenType;
    }

    @Override
    public boolean isExpired() {
        return expired;
    }

    @Override
    public Date getExpiration() {
        return expiration;
    }

    @Override
    public int getExpiresIn() {
        return expiresIn;
    }

    @Override
    public String getValue() {
        return value;
    }
}
