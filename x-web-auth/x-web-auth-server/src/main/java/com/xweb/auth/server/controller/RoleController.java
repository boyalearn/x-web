package com.xweb.auth.server.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.xweb.auth.server.auth.XAuthRole;
import com.xweb.auth.server.bean.Transfer;
import com.xweb.auth.server.entity.Role;
import com.xweb.auth.server.request.RoleRequest;
import com.xweb.auth.server.service.IRoleService;
import com.xweb.common.auth.Auth;
import com.xweb.common.exception.BusinessException;
import com.xweb.common.web.parameter.resolver.FormBody;
import com.xweb.common.web.response.RespPageResult;
import com.xweb.common.web.response.RespResult;
import com.xweb.common.utils.JsonUtil;
import com.xweb.common.web.parameter.valid.Insert;
import com.xweb.logger.annotation.Option;
import com.xweb.logger.annotation.XWebLogger;
import com.xweb.logger.utils.XWebLoggerHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

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
    @XWebLogger(model = "角色管理", option = Option.INSERT)
    public RespResult<String> addRole(@Validated(Insert.class) @RequestBody Role role) throws BusinessException {
        roleService.save(role);
        try {
            XWebLoggerHelper.setDescription("添加了角色详情为：" + JsonUtil.toJSON(role));
        } catch (JsonProcessingException e) {
            throw new BusinessException(BusinessException.BUSINESS_EXCEPTION, "JSON 解析异常");
        }
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
    @XWebLogger(model = "角色管理", option = Option.SELECT, description = "查询了角色列表")
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
    @XWebLogger(model = "角色管理", option = Option.DELETE)
    public RespResult<String> deleteRole(@PathVariable("id") String id) throws BusinessException {
        Role role = roleService.getById(id);
        roleService.removeById(id);
        try {
            XWebLoggerHelper.setDescription("删除了角色，角色ID:" + id + ";详情为：" + JsonUtil.toJSON(role));
        } catch (JsonProcessingException e) {
            throw new BusinessException(BusinessException.BUSINESS_EXCEPTION, "JSON 解析异常");
        }
        return RespResult.builder().data("").message("删除成功").build();
    }

    /**
     * @param role Role
     * @return
     */
    @ApiOperation("更新角色")
    @PutMapping("/{id}")
    @Auth(roles = {XAuthRole.SUPPER_ADMIN})
    @XWebLogger(model = "角色管理", option = Option.UPDATE)
    public RespResult<String> updateRole(@Validated @RequestBody Role role) throws BusinessException {
        Role before = roleService.getById(role.getId());
        roleService.updateById(role);
        Role after = roleService.getById(role.getId());
        try {
            XWebLoggerHelper.setDescription("修改了角色，修改前：" + JsonUtil.toJSON(before) + ";修改后" + JsonUtil.toJSON(after));
        } catch (JsonProcessingException e) {
            throw new BusinessException(BusinessException.BUSINESS_EXCEPTION, "json 异常");
        }
        return RespResult.builder().data("").message("删除成功").build();
    }

    /**
     * @param id RoleId
     * @return
     */
    @ApiOperation("获取角色权限")
    @GetMapping("/{id}/resources")
    @XWebLogger(model = "角色管理", option = Option.SELECT)
    public RespResult<Transfer> getRoleResources(@PathVariable("id") String id) {
        XWebLoggerHelper.setDescription("查询角色ID:" + id + "的资源数据");
        return RespResult.builder().data(roleService.selectRoleResources(id)).message("查询成功").build();
    }

    /**
     * @param id RoleId
     * @return
     */
    @ApiOperation("修改角色权限")
    @PutMapping("/{id}/resources")
    @Auth(roles = {XAuthRole.SUPPER_ADMIN})
    @XWebLogger(model = "角色管理", option = Option.UPDATE)
    public RespResult<String> addResourceToRole(@PathVariable("id") String id, @RequestBody String[] resourceIds) {
        roleService.addResourceToRole(id, resourceIds);
        XWebLoggerHelper.setDescription("修改了角色ID:" + id + "的权限资源为：" + Arrays.toString(resourceIds));
        return RespResult.builder().data("").message("修改成功").build();
    }
}

