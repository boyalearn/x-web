package com.xweb.common.auth;

import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

import java.util.Map;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/8/28 12:58
 ******************************/
public class XWebTokenEnhancer extends JwtAccessTokenConverter {
    public Map<String, Object> decode(String token) {
        return super.decode(token);
    }
}
