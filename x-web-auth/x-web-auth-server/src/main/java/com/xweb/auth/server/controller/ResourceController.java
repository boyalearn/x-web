package com.xweb.auth.server.controller;


import com.xweb.auth.server.entity.Resource;
import com.xweb.auth.server.request.ResourceRequest;
import com.xweb.auth.server.service.IResourceService;
import com.xweb.common.resolver.FormBody;
import com.xweb.common.standard.RespPageResult;
import com.xweb.common.standard.RespResult;
import com.xweb.common.valid.Insert;
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
    public RespResult<String> addResource(@Validated(Insert.class) @RequestBody Resource resource) {
        resourceService.save(resource);
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
    public RespResult<String> deleteResource(@PathVariable("id") String id) {
        resourceService.removeById(id);
        return RespResult.builder().data("").message("删除成功").build();
    }

    /**
     * 更新资源
     *
     * @param resource Resource
     * @return
     */
    @ApiOperation(value = "删除资源")
    @PutMapping("/{id}")
    public RespResult<String> updateResource(@Validated @RequestBody Resource resource) {
        resourceService.updateById(resource);
        return RespResult.builder().data("").message("更新成功").build();
    }
}

