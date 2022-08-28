package com.xweb.auth.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xweb.auth.server.entity.Role;
import com.xweb.auth.server.mapper.RoleMapper;
import com.xweb.auth.server.service.IRoleService;
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
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

    @Override
    public PageEntity<Role> selectRoles(PageRequest request) {
        PageUtil.startPage(request);
        return PageUtil.buildResult(list());
    }
}
