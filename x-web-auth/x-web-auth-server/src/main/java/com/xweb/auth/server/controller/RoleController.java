package com.xweb.auth.server.controller;


import com.xweb.auth.server.entity.Role;
import com.xweb.auth.server.service.IRoleService;
import com.xweb.common.standard.RespResult;
import com.xweb.common.valid.Insert;
import io.swagger.annotations.Api;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * 角色管理
 *
 * @author zhx
 * @since 2022-08-27
 */
@Api(tags = "角色管理")
@RestController
@RequestMapping("/roles")
public class RoleController {

    private final IRoleService roleService;

    public RoleController(IRoleService roleService) {
        this.roleService = roleService;
    }

    @PostMapping("")
    public RespResult<String> addRole(@Validated(Insert.class) @RequestBody Role role) {
        roleService.save(role);
        return RespResult.builder().data("").message("添加成功").build();
    }
}

