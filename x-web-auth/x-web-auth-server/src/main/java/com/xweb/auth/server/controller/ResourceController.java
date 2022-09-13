package com.xweb.auth.server.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.xweb.auth.server.auth.XAuthRole;
import com.xweb.auth.server.entity.Resource;
import com.xweb.auth.server.request.ResourceRequest;
import com.xweb.auth.server.service.IResourceService;
import com.xweb.common.auth.Auth;
import com.xweb.common.exception.BusinessException;
import com.xweb.common.resolver.FormBody;
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

/**
 * 资源管理
 *
 * @author zhx
 * @since 2022-08-27
 */
@Api(tags = "资源管理")
@RestController
@RequestMapping("/resources")
public class ResourceController {

    private final IResourceService resourceService;

    public ResourceController(IResourceService resourceService) {
        this.resourceService = resourceService;
    }

    /**
     * 创建资源
     *
     * @param resource
     * @return
     */
    @ApiOperation(value = "创建资源")
    @PostMapping("")
    @Auth(roles = {XAuthRole.SUPPER_ADMIN})
    @XWebLogger(model = "资源管理", option = Option.INSERT)
    public RespResult<String> addResource(@Validated(Insert.class) @RequestBody Resource resource) throws BusinessException {
        resourceService.save(resource);
        try {
            XWebLoggerHelper.setDescription("新增了资源：" + JsonUtil.toJSON(resource));
        } catch (JsonProcessingException e) {
            throw new BusinessException(BusinessException.BUSINESS_EXCEPTION, "JSON 转换失败");
        }
        return RespResult.builder().data("").message("添加成功").build();
    }

    /**
     * 查询资源列表
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "查询资源列表")
    @GetMapping("")
    @XWebLogger(model = "资源管理", option = Option.SELECT, description = "查询了资源列表")
    public RespPageResult<Resource> selectResources(@FormBody ResourceRequest request) {
        return RespPageResult.builder().data(resourceService.selectResources(request)).message("查询成功").build();
    }

    /**
     * 删除资源
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "删除资源")
    @DeleteMapping("/{id}")
    @Auth(roles = {XAuthRole.SUPPER_ADMIN})
    @XWebLogger(model = "资源管理", option = Option.DELETE)
    public RespResult<String> deleteResource(@PathVariable("id") String id) throws BusinessException {
        Resource resource = resourceService.getById(id);
        resourceService.removeById(id);
        try {
            XWebLoggerHelper.setDescription("删除了资源ID为：" + id + "详情为：" + JsonUtil.toJSON(resource));
        } catch (JsonProcessingException e) {
            throw new BusinessException(BusinessException.BUSINESS_EXCEPTION, "json 异常");
        }
        return RespResult.builder().data("").message("删除成功").build();
    }

    /**
     * 更新资源
     *
     * @param resource Resource
     * @return
     */
    @ApiOperation(value = "修改资源")
    @PutMapping("/{id}")
    @Auth(roles = {XAuthRole.SUPPER_ADMIN})
    @XWebLogger(model = "资源管理", option = Option.UPDATE)
    public RespResult<String> updateResource(@Validated @RequestBody Resource resource) throws BusinessException {
        Resource before = resourceService.getById(resource.getId());
        resourceService.updateById(resource);
        Resource after = resourceService.getById(resource.getId());
        try {
            XWebLoggerHelper.setDescription("修改了资源，修改前：" + JsonUtil.toJSON(before) + ";修改后" + JsonUtil.toJSON(after));
        } catch (JsonProcessingException e) {
            throw new BusinessException(BusinessException.BUSINESS_EXCEPTION, "json 异常");
        }
        return RespResult.builder().data("").message("更新成功").build();
    }
}

