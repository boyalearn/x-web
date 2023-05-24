package com.xweb.auth.server.service;

import com.xweb.auth.server.entity.Tenant;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xweb.common.web.standard.PageEntity;
import com.xweb.common.web.standard.PageRequest;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhx
 * @since 2022-08-27
 */
public interface ITenantService extends IService<Tenant> {

    PageEntity<Tenant> selectTenants(PageRequest request);

    List selectTree(PageRequest request);

    Object selectRole(String tenantId, String clientId, String userId);
}
