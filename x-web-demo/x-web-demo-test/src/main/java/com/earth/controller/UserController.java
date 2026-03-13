package com.earth.controller;


import com.earth.entity.User;
import com.earth.service.IUserService;
import com.xweb.common.exception.BusinessException;
import com.xweb.common.web.response.RespResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author zhx
 * @since 2024-08-21
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/login")
    public RespResult<User> login(@RequestBody User user) throws BusinessException {
        return RespResult.builder().data(userService.login(user)).build();
    }

}

