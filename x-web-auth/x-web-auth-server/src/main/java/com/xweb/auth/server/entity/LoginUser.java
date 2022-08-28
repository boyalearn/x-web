package com.xweb.auth.server.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/8/28 14:08
 ******************************/

@Getter
@Setter
public class LoginUser {
    private String account;

    private String userName;

    private String clientId;

    private Set<String> roles;

    private Set<String> authorities;
}
