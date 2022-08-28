package com.xweb.auth.server.controller;


import com.xweb.auth.server.auth.XAuthRole;
import com.xweb.auth.server.entity.Tenant;
import com.xweb.auth.server.service.ITenantService;
import com.xweb.common.auth.Auth;
import com.xweb.common.resolver.FormBody;
import com.xweb.common.standard.PageRequest;
import com.xweb.common.standard.RespPageResult;
import com.xweb.common.standard.RespResult;
import com.xweb.common.valid.Insert;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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
    public RespResult<String> addTenant(@Validated(Insert.class) @RequestBody Tenant tenant) {
        tenantService.save(tenant);
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
    public RespResult<String> deleteTenant(@PathVariable("id") String id) {
        tenantService.removeById(id);
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
    @Auth(roles = XAuthRole.SUPPER_ADMIN)
    public RespPageResult<Tenant> selectTenants(@FormBody PageRequest request) {
        return RespPageResult.builder()
                .data(tenantService.selectTenants(request)).message("查询成功").build();
    }

}

