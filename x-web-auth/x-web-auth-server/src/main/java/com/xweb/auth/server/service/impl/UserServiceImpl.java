package com.xweb.auth.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xweb.auth.server.entity.*;
import com.xweb.auth.server.mapper.UserMapper;
import com.xweb.auth.server.oauth.XAuthPasswordEncoder;
import com.xweb.auth.server.service.*;
import com.xweb.common.standard.PageEntity;
import com.xweb.common.standard.PageRequest;
import com.xweb.common.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zhx
 * @since 2022-08-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {


    @Autowired
    private IClientUserRoleService clientUserRoleService;

    @Autowired
    private IRoleResourceService roleResourceService;

    @Autowired
    private IRoleService roleService;

    @Autowired
    private IResourceService resourceService;

    @Autowired
    private XAuthPasswordEncoder passwordEncoder;

    @Override
    public LoginUser createLoginUser(User user, Client client) {
        LoginUser loginUser = new LoginUser();
        loginUser.setUserName(user.getName());
        loginUser.setAccount(user.getAccount());
        loginUser.setUserId(String.valueOf(user.getId()));

        ClientUserRole clientUserRole = new ClientUserRole();
        clientUserRole.setUserId(user.getId());
        clientUserRole.setClientId(client.getId());
        List<ClientUserRole> roleList = clientUserRoleService.list(new QueryWrapper<>(clientUserRole));

        Set<Integer> roleIds = roleList.stream().map(ClientUserRole::getRoleId).collect(Collectors.toSet());
        if (CollectionUtils.isEmpty(roleIds)) {
            return loginUser;
        }
        List<Role> roles = roleService.listByIds(roleIds);
        Set<String> roleCodes = roles.stream().map(Role::getCode).collect(Collectors.toSet());
        loginUser.setRoles(roleCodes);

        Set<Integer> resourceIds = new HashSet<>();
        roleList.forEach(userRole -> {
            RoleResource resource = new RoleResource();
            resource.setRoleId(userRole.getRoleId());
            List<RoleResource> list = roleResourceService.list(new QueryWrapper<>(resource));
            resourceIds.addAll(list.stream().map(RoleResource::getResourceId).collect(Collectors.toSet()));
        });
        if (CollectionUtils.isEmpty(resourceIds)) {
            return loginUser;
        }
        List<Resource> resources = resourceService.listByIds(resourceIds);
        Set<String> resourceSet = resources.stream().map(Resource::getCode).collect(Collectors.toSet());
        loginUser.setAuthorities(resourceSet);
        return loginUser;
    }

    @Override
    public void register(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        save(user);
    }

    @Override
    public PageEntity<User> selectUsers(PageRequest request) {
        PageUtil.startPageDefault(request);
        return PageUtil.buildResult(list());
    }
}
