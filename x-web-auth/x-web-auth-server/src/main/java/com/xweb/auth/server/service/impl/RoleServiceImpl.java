package com.xweb.auth.server.service.impl;

import com.xweb.auth.server.entity.Role;
import com.xweb.auth.server.mapper.RoleMapper;
import com.xweb.auth.server.service.IRoleService;
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
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
