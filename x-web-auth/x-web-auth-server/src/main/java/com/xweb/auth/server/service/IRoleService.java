package com.xweb.auth.server.service;

import com.xweb.auth.server.entity.Role;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xweb.common.standard.PageEntity;
import com.xweb.common.standard.PageRequest;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhx
 * @since 2022-08-27
 */
public interface IRoleService extends IService<Role> {

    PageEntity<Role> selectRoles(PageRequest request);
}
