package com.xweb.auth.server.oauth;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xweb.auth.server.entity.LoginUser;
import com.xweb.auth.server.entity.User;
import com.xweb.auth.server.service.IUserService;
import com.xweb.common.auth.XWebTokenEnhancer;
import lombok.NoArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.oauth2.common.DefaultOAuth2RefreshToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2RefreshToken;
import org.springframework.security.oauth2.common.util.JsonParser;
import org.springframework.security.oauth2.common.util.JsonParserFactory;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.stereotype.Component;

import java.util.*;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/8/27 4:09
 ******************************/

@NoArgsConstructor
public class XAuthAccessTokenEnhancer extends XWebTokenEnhancer {


    private static final String ROLES = "roles";

    private static final String RESOURCES = "resources";

    private static final String USER_ID = "uid";

    private static final String CLIENT_ID = "cid";

    private IUserService userService;

    public XAuthAccessTokenEnhancer(IUserService userService) {
        this.userService = userService;
    }

    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
        XAuthOAuth2AccessToken result = new XAuthOAuth2AccessToken(accessToken);
        Map<String, Object> addition = new HashMap<>();
        LoginUser loginUser = customInfo(authentication);
        addition.put(ROLES,loginUser.getRoles());
        addition.put(RESOURCES,loginUser.getAuthorities());
        addition.put(USER_ID,loginUser.getUserId());
        addition.put(CLIENT_ID,loginUser.getClientId());
        result.setAdditionalInformation(addition);
        result.setValue(this.encode(result, authentication));
        OAuth2RefreshToken refreshToken = result.getRefreshToken();
        if (Optional.ofNullable(refreshToken).isPresent()) {
            XAuthOAuth2AccessToken encodedRefreshToken = new XAuthOAuth2AccessToken(accessToken);
            DefaultOAuth2RefreshToken token = new DefaultOAuth2RefreshToken(this.encode(encodedRefreshToken, authentication));
            result.setRefreshToken(token);
        }
        return result;
    }


    private LoginUser customInfo(OAuth2Authentication authentication) {
        User user = new User();
        user.setAccount(String.valueOf(authentication.getPrincipal()));
        User dbUser = userService.getOne(new QueryWrapper<>(user));
        if (!Optional.ofNullable(dbUser).isPresent()) {
            throw new UsernameNotFoundException("用户名或密码错误");
        }
        return userService.createLoginUser(dbUser, XAuthClientDetailsService.CLIENT.get());
    }

}
