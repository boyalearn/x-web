package com.xweb.auth.server.controller;


import com.xweb.auth.server.entity.Resource;
import com.xweb.auth.server.service.IResourceService;
import com.xweb.common.standard.RespResult;
import com.xweb.common.valid.Insert;
import io.swagger.annotations.Api;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping("")
    public RespResult<String> addResource(@Validated(Insert.class) @RequestBody Resource resource) {
        resourceService.save(resource);
        return RespResult.builder().data("").message("添加成功").build();
    }
}

