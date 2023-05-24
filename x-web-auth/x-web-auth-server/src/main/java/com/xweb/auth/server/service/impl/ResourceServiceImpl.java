package com.xweb.auth.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xweb.auth.server.entity.Resource;
import com.xweb.auth.server.mapper.ResourceMapper;
import com.xweb.auth.server.request.ResourceRequest;
import com.xweb.auth.server.service.IResourceService;
import com.xweb.common.web.standard.PageEntity;
import com.xweb.common.utils.PageUtil;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zhx
 * @since 2022-08-27
 */
@Service
public class ResourceServiceImpl extends ServiceImpl<ResourceMapper, Resource> implements IResourceService {

    @Override
    public PageEntity selectResources(ResourceRequest request) {
        PageUtil.startPageDefault(request);
        Resource resource = new Resource();
        if (Optional.ofNullable(request.getClientId()).isPresent()) {
            resource.setClientId(request.getClientId());
        }
        return PageUtil.buildResult(list(new QueryWrapper<>(resource)));
    }
}
