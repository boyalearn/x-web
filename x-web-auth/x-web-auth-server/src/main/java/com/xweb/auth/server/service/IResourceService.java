package com.xweb.auth.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xweb.auth.server.entity.Resource;
import com.xweb.auth.server.request.ResourceRequest;
import com.xweb.common.web.standard.PageEntity;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author zhx
 * @since 2022-08-27
 */
public interface IResourceService extends IService<Resource> {

    PageEntity selectResources(ResourceRequest request);
}
