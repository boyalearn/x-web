package com.xweb.auth.server.controller;


import com.xweb.auth.server.auth.XAuthRole;
import com.xweb.auth.server.bean.Transfer;
import com.xweb.auth.server.entity.Role;
import com.xweb.auth.server.request.RoleRequest;
import com.xweb.auth.server.service.IRoleService;
import com.xweb.common.auth.Auth;
import com.xweb.common.resolver.FormBody;
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
     *
     * @param role
     * @return
     */
    @ApiOperation(value = "添加角色")
    @PostMapping("")
    @Auth(roles = {XAuthRole.SUPPER_ADMIN})
    public RespResult<String> addRole(@Validated(Insert.class) @RequestBody Role role) {
        roleService.save(role);
        return RespResult.builder().data("").message("添加成功").build();
    }

    /**
     * 查询角色列表
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "查询角色列表")
    @GetMapping("")
    public RespPageResult<String> selectRoles(@FormBody RoleRequest request) {
        return RespPageResult.builder().data(roleService.selectRoles(request)).message("查询成功").build();
    }

    /**
     * @param id 角色ID
     * @return
     */
    @ApiOperation("删除角色")
    @DeleteMapping("/{id}")
    @Auth(roles = {XAuthRole.SUPPER_ADMIN})
    public RespResult<String> deleteRole(@PathVariable("id") String id) {
        roleService.removeById(id);
        return RespResult.builder().data("").message("删除成功").build();
    }

    /**
     * @param role Role
     * @return
     */
    @ApiOperation("更新角色")
    @PutMapping("/{id}")
    @Auth(roles = {XAuthRole.SUPPER_ADMIN})
    public RespResult<String> updateRole(@Validated @RequestBody Role role) {
        roleService.updateById(role);
        return RespResult.builder().data("").message("删除成功").build();
    }

    /**
     * @param id RoleId
     * @return
     */
    @ApiOperation("获取角色权限")
    @GetMapping("/{id}/resources")
    public RespResult<Transfer> updateRole(@PathVariable("id") String id) {
        return RespResult.builder().data(roleService.selectRoleResources(id)).message("查询成功").build();
    }

    /**
     * @param id RoleId
     * @return
     */
    @ApiOperation("修改角色权限")
    @PutMapping("/{id}/resources")
    @Auth(roles = {XAuthRole.SUPPER_ADMIN})
    public RespResult<String> addResourceToRole(@PathVariable("id") String id, @RequestBody String[] resourceIds) {
        roleService.addResourceToRole(id, resourceIds);
        return RespResult.builder().data("").message("修改成功").build();
    }
}

