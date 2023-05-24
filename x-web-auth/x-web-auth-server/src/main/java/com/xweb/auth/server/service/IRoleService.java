package com.xweb.auth.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xweb.auth.server.bean.Transfer;
import com.xweb.auth.server.entity.Role;
import com.xweb.auth.server.request.RoleRequest;
import com.xweb.common.web.standard.PageEntity;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author zhx
 * @since 2022-08-27
 */
public interface IRoleService extends IService<Role> {

    PageEntity<Role> selectRoles(RoleRequest request);

    Transfer selectRoleResources(String id);

    void addResourceToRole(String id, String[] resourceIds);
}
