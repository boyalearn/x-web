package com.xweb.auth.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xweb.auth.server.entity.Resource;
import com.xweb.auth.server.mapper.ResourceMapper;
import com.xweb.auth.server.service.IResourceService;
import com.xweb.common.standard.PageEntity;
import com.xweb.common.standard.PageRequest;
import com.xweb.common.utils.PageUtil;
import org.springframework.stereotype.Service;

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
    public PageEntity selectResources(PageRequest request) {
        PageUtil.startPageDefault(request);
        return PageUtil.buildResult(list());
    }
}
