package com.xweb.auth.server.controller;


import com.xweb.auth.server.entity.Role;
import com.xweb.auth.server.service.IRoleService;
import com.xweb.common.standard.PageRequest;
import com.xweb.common.standard.RespPageResult;
import com.xweb.common.standard.RespResult;
import com.xweb.common.valid.Insert;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
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

    /**
     * 添加角色
     * @param role
     * @return
     */
    @ApiOperation(value = "添加角色")
    @PostMapping("")
    public RespResult<String> addRole(@Validated(Insert.class) @RequestBody Role role) {
        roleService.save(role);
        return RespResult.builder().data("").message("添加成功").build();
    }

    /**
     * 查询角色列表
     * @param request
     * @return
     */
    @ApiOperation(value = "查询角色列表")
    @GetMapping("")
    public RespPageResult<String> selectRoles(PageRequest request) {
        return RespPageResult.builder().data(roleService.selectRoles(request)).message("查询成功").build();
    }
}

