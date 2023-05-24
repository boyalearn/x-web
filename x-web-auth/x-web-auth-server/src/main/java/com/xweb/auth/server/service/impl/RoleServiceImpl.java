package com.xweb.auth.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xweb.auth.server.bean.Option;
import com.xweb.auth.server.bean.Transfer;
import com.xweb.auth.server.entity.Resource;
import com.xweb.auth.server.entity.Role;
import com.xweb.auth.server.entity.RoleResource;
import com.xweb.auth.server.mapper.RoleMapper;
import com.xweb.auth.server.request.RoleRequest;
import com.xweb.auth.server.service.IResourceService;
import com.xweb.auth.server.service.IRoleResourceService;
import com.xweb.auth.server.service.IRoleService;
import com.xweb.common.web.standard.PageEntity;
import com.xweb.common.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
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
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

    @Autowired
    private IRoleResourceService roleResourceService;

    @Autowired
    private IResourceService resourceService;

    @Override
    public PageEntity<Role> selectRoles(RoleRequest request) {
        PageUtil.startPageDefault(request);
        Role role = new Role();
        if (Optional.ofNullable(request.getClientId()).isPresent()) {
            role.setClientId(request.getClientId());
        }
        return PageUtil.buildResult(list(new QueryWrapper<>(role)));
    }

    @Override
    public Transfer selectRoleResources(String id) {
        Role role = getById(id);
        Resource resource = new Resource();
        resource.setClientId(role.getClientId());
        List<Resource> resources = resourceService.list(new QueryWrapper<>(resource));
        List<Option> options = new ArrayList<>();
        for (Resource r : resources) {
            Option option = new Option();
            option.setKey(String.valueOf(r.getId()));
            option.setPinyin(r.getName());
            option.setLabel(r.getName());
            options.add(option);
        }
        RoleResource roleResource = new RoleResource();
        roleResource.setRoleId(role.getId());
        List<RoleResource> roleResources = roleResourceService.list(new QueryWrapper<>(roleResource));
        List<String> selected = new ArrayList<>();
        for (RoleResource rr : roleResources) {
            selected.add(String.valueOf(rr.getResourceId()));
        }
        Transfer transfer = new Transfer();
        transfer.setSelected(selected);
        transfer.setOptions(options);
        return transfer;
    }

    @Override
    public void addResourceToRole(String id, String[] resourceIds) {
        RoleResource roleResource = new RoleResource();
        roleResource.setRoleId(Integer.valueOf(id));
        List<RoleResource> roleResources = roleResourceService.list(new QueryWrapper<>(roleResource));
        for (String resourceId : resourceIds) {
            if (!include(roleResources, resourceId)) {
                RoleResource addRoleResource = new RoleResource();
                addRoleResource.setResourceId(Integer.valueOf(resourceId));
                addRoleResource.setRoleId(Integer.valueOf(id));
                roleResourceService.save(addRoleResource);
            }
        }
        for (RoleResource rr : roleResources) {
            if (!include(resourceIds, String.valueOf(rr.getResourceId()))) {
                roleResourceService.remove(new QueryWrapper<>(rr));
            }
        }
    }

    private boolean include(List<RoleResource> userRoles, String item) {
        for (RoleResource role : userRoles) {
            if (role.getResourceId().equals(Integer.valueOf(item))) {
                return true;
            }
        }
        return false;
    }

    private boolean include(String[] arr, String item) {
        for (String s : arr) {
            if (s.equals(item)) {
                return true;
            }
        }
        return false;
    }
}
