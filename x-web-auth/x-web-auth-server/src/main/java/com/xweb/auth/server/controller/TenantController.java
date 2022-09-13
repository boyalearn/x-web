package com.xweb.auth.server.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.xweb.auth.server.auth.XAuthRole;
import com.xweb.auth.server.entity.Tenant;
import com.xweb.auth.server.service.ITenantService;
import com.xweb.common.auth.Auth;
import com.xweb.common.exception.BusinessException;
import com.xweb.common.resolver.FormBody;
import com.xweb.common.standard.PageRequest;
import com.xweb.common.standard.RespPageResult;
import com.xweb.common.standard.RespResult;
import com.xweb.common.utils.JsonUtil;
import com.xweb.common.valid.Insert;
import com.xweb.logger.annotation.Option;
import com.xweb.logger.annotation.XWebLogger;
import com.xweb.logger.utils.XWebLoggerHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 租户管理
 *
 * @author zhx
 * @since 2022-08-27
 */
@Api(tags = "租户管理")
@RestController
@RequestMapping("/tenants")
public class TenantController {

    private final ITenantService tenantService;

    public TenantController(ITenantService tenantService) {
        this.tenantService = tenantService;
    }

    /**
     * 添加租户
     *
     * @param tenant
     * @return
     */
    @ApiOperation(value = "添加租户")
    @PostMapping("")
    @Auth(roles = {XAuthRole.SUPPER_ADMIN})
    @XWebLogger(model = "租户管理", option = Option.INSERT)
    public RespResult<String> addTenant(@Validated(Insert.class) @RequestBody Tenant tenant) throws BusinessException {
        tenantService.save(tenant);
        try {
            XWebLoggerHelper.setDescription("添加了租户详情为：" + JsonUtil.toJSON(tenant));
        } catch (JsonProcessingException e) {
            throw new BusinessException(BusinessException.BUSINESS_EXCEPTION, "JSON 解析异常");
        }
        return RespResult.builder().data("").message("添加成功").build();
    }

    /**
     * 删除租户
     *
     * @param id 租户ID
     * @return
     */
    @ApiOperation(value = "删除租户")
    @DeleteMapping("/{id}")
    @Auth(roles = {XAuthRole.SUPPER_ADMIN})
    @XWebLogger(model = "租户管理", option = Option.DELETE)
    public RespResult<String> deleteTenant(@PathVariable("id") String id) throws BusinessException {
        Tenant tenant = tenantService.getById(id);
        tenantService.removeById(id);
        try {
            XWebLoggerHelper.setDescription("删除了租户ID：" + id + ",详情为：" + JsonUtil.toJSON(tenant));
        } catch (JsonProcessingException e) {
            throw new BusinessException(BusinessException.BUSINESS_EXCEPTION, "JSON 解析异常");
        }
        return RespResult.builder().data("").message("删除成功").build();
    }

    /**
     * 查询租户列表
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "查询租户列表")
    @GetMapping()
    @XWebLogger(model = "租户管理", option = Option.SELECT, description = "查询了租户列表")
    public RespPageResult<Tenant> selectTenants(@FormBody PageRequest request) {
        return RespPageResult.builder()
                .data(tenantService.selectTenants(request)).message("查询成功").build();
    }

    /**
     * 查询租户列表
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "查询租户树")
    @GetMapping("/tree")
    @XWebLogger(model = "租户管理", option = Option.SELECT, description = "查询租户树列表")
    public RespResult<List> selectTenantTree(@FormBody PageRequest request) {
        return RespResult.builder()
                .data(tenantService.selectTree(request)).message("查询成功").build();
    }

    /**
     * @param tenantId
     * @param clientId
     * @param userId
     * @return
     */
    @ApiOperation(value = "查询住户应用用户的角色")
    @GetMapping("/{tenant_id}/clients/{client_id}/users/{user_id}")
    @XWebLogger(model = "租户管理", option = Option.SELECT)
    public RespResult selectRole(@PathVariable("tenant_id") String tenantId,
                                 @PathVariable("client_id") String clientId,
                                 @PathVariable("user_id") String userId) {
        XWebLoggerHelper.setDescription("查询了住户ID：" + tenantId + "的应用ID:" + clientId + "的用户ID" + userId + "的角色");
        return RespResult.builder()
                .data(tenantService.selectRole(tenantId, clientId, userId)).message("查询成功").build();
    }

}

