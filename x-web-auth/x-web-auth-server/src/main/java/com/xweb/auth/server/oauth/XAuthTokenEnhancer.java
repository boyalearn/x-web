package com.xweb.auth.server.oauth;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.google.common.collect.Lists;
import com.xweb.auth.server.entity.LoginUser;
import com.xweb.auth.server.entity.User;
import com.xweb.auth.server.service.IUserService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.jwt.JwtHelper;
import org.springframework.security.oauth2.common.*;
import org.springframework.security.oauth2.common.util.JsonParser;
import org.springframework.security.oauth2.common.util.JsonParserFactory;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

import java.util.*;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/8/27 4:09
 ******************************/
public class XAuthTokenEnhancer extends JwtAccessTokenConverter {


    private static final Set<String> CUSTOM_GRANT_TYPES = new HashSet<String>(Arrays.asList(new String[]{"password", "implicit"}));

    private JsonParser objectMapper = JsonParserFactory.create();

    private IUserService userService;

    public XAuthTokenEnhancer(IUserService userService) {
        this.userService = userService;
    }

    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
        DefaultOAuth2AccessToken result = new DefaultOAuth2AccessToken(accessToken);
        Map<String, Object> info = new LinkedHashMap(accessToken.getAdditionalInformation());
        String tokenId = result.getValue();
        if (!info.containsKey("jti")) {
            info.put("jti", tokenId);
        } else {
            tokenId = (String) info.get("jti");
        }

        //add customer info
        if (CUSTOM_GRANT_TYPES.contains(authentication.getOAuth2Request().getGrantType())) {
            customInfo(info, authentication);
        }
        //add customer info end
        result.setAdditionalInformation(info);
        result.setValue(this.encode(result, authentication));
        OAuth2RefreshToken refreshToken = result.getRefreshToken();
        if (refreshToken != null) {
            DefaultOAuth2AccessToken encodedRefreshToken = new DefaultOAuth2AccessToken(accessToken);
            encodedRefreshToken.setValue(refreshToken.getValue());
            encodedRefreshToken.setExpiration((Date) null);

            try {
                Map<String, Object> claims = this.objectMapper.parseMap(JwtHelper.decode(refreshToken.getValue()).getClaims());
                if (claims.containsKey("jti")) {
                    encodedRefreshToken.setValue(claims.get("jti").toString());
                }
            } catch (IllegalArgumentException var11) {
            }

            Map<String, Object> refreshTokenInfo = new LinkedHashMap(accessToken.getAdditionalInformation());
            refreshTokenInfo.put("jti", encodedRefreshToken.getValue());
            refreshTokenInfo.put("ati", tokenId);
            encodedRefreshToken.setAdditionalInformation(refreshTokenInfo);
            DefaultOAuth2RefreshToken token = new DefaultOAuth2RefreshToken(this.encode(encodedRefreshToken, authentication));
            if (refreshToken instanceof ExpiringOAuth2RefreshToken) {
                Date expiration = ((ExpiringOAuth2RefreshToken) refreshToken).getExpiration();
                encodedRefreshToken.setExpiration(expiration);
                token = new DefaultExpiringOAuth2RefreshToken(this.encode(encodedRefreshToken, authentication), expiration);
            }
            result.setRefreshToken((OAuth2RefreshToken) token);
        }
        return result;
    }

    private void customInfo(Map<String, Object> info, OAuth2Authentication authentication) {
        User user = new User();
        user.setAccount(String.valueOf(authentication.getPrincipal()));
        User dbUser = userService.getOne(new QueryWrapper<>(user));
        if (!Optional.ofNullable(dbUser).isPresent()) {
            throw new UsernameNotFoundException("用户名或密码错误");
        }
        LoginUser loginUser = userService.createLoginUser(dbUser, XAuthClientDetailsService.CLIENT.get());
        info.put("roles", loginUser.getRoles());
        info.put("resources", loginUser.getAuthorities());
        info.put("account", loginUser.getAccount());
        info.put("user_id", dbUser.getId());
        info.put("application_id", loginUser.getClientId());
    }

    public Map<String, Object> decode(String token) {
        return super.decode(token);
    }
}
