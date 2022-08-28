package com.xweb.auth.server.controller;


import com.xweb.auth.server.entity.User;
import com.xweb.auth.server.service.IUserService;
import com.xweb.common.standard.RespResult;
import com.xweb.common.valid.Insert;
import io.swagger.annotations.Api;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理
 *
 * @author zhx
 * @since 2022-08-27
 */
@Api(tags = "用户管理")
@RestController
@RequestMapping("/users")
public class UserController {

    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public RespResult<String> register(@Validated(Insert.class) @RequestBody User user) {
        userService.save(user);
        return RespResult.builder().data("").message("注册成功").build();
    }
}

