package com.xweb.auth.server.auth;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.web.authentication.WebAuthenticationDetails;

import javax.servlet.http.HttpServletRequest;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/8/27 21:16
 ******************************/
@Getter
@Setter
public class XAuthWebAuthentication extends WebAuthenticationDetails {

    private String username;

    private String password;

    public XAuthWebAuthentication(HttpServletRequest request) {
        super(request);
        username = request.getParameter("username");
        password = request.getParameter("password");
    }

}
