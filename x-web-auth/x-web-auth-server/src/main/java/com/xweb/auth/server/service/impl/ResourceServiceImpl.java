package com.xweb.auth.server.service.impl;

import com.xweb.auth.server.entity.Resource;
import com.xweb.auth.server.mapper.ResourceMapper;
import com.xweb.auth.server.service.IResourceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhx
 * @since 2022-08-27
 */
@Service
public class ResourceServiceImpl extends ServiceImpl<ResourceMapper, Resource> implements IResourceService {

}
