package com.xweb.auth.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xweb.auth.server.bean.Option;
import com.xweb.auth.server.bean.TenantClientTree;
import com.xweb.auth.server.entity.Client;
import com.xweb.auth.server.entity.ClientUserRole;
import com.xweb.auth.server.entity.Role;
import com.xweb.auth.server.entity.Tenant;
import com.xweb.auth.server.mapper.TenantMapper;
import com.xweb.auth.server.service.IClientService;
import com.xweb.auth.server.service.IClientUserRoleService;
import com.xweb.auth.server.service.IRoleService;
import com.xweb.auth.server.service.ITenantService;
import com.xweb.common.standard.PageEntity;
import com.xweb.common.standard.PageRequest;
import com.xweb.common.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
public class TenantServiceImpl extends ServiceImpl<TenantMapper, Tenant> implements ITenantService {

    @Autowired
    private IClientService clientService;

    @Autowired
    private IRoleService roleService;

    @Autowired
    private IClientUserRoleService clientUserRoleService;


    @Override
    public PageEntity<Tenant> selectTenants(PageRequest request) {
        PageUtil.startPageDefault(request);
        return PageUtil.buildResult(list());
    }

    @Override
    public List<TenantClientTree> selectTree(PageRequest request) {
        List<TenantClientTree> result = new ArrayList<>();
        List<Tenant> list = list();
        for (Tenant tenant : list) {
            TenantClientTree tenantClientTree = new TenantClientTree();
            tenantClientTree.setLabel(tenant.getName());
            tenantClientTree.setValue(String.valueOf(tenant.getId()));
            Client client = new Client();
            client.setTenantId(String.valueOf(tenant.getId()));
            List<Client> clients = clientService.list(new QueryWrapper<>(client));
            List<TenantClientTree> children = new ArrayList<>();
            for (Client c : clients) {
                TenantClientTree clientTree = new TenantClientTree();
                clientTree.setLabel(c.getName());
                clientTree.setValue(String.valueOf(c.getId()));
                children.add(clientTree);
            }
            tenantClientTree.setChildren(children);
            result.add(tenantClientTree);
        }
        return result;
    }

    @Override
    public Object selectRole(String tenantId, String clientId, String userId) {
        Map<String, Object> result = new HashMap<String, Object>();
        Role role = new Role();
        role.setClientId(Integer.valueOf(clientId));
        List<Role> roles = roleService.list(new QueryWrapper<>(role));
        List<Option> options = new ArrayList<>();
        for (Role r : roles) {
            Option option = new Option();
            option.setKey(String.valueOf(r.getId()));
            option.setPinyin(r.getName());
            option.setLabel(r.getName());
            options.add(option);
        }
        Map<String, Option> optionMap = options.stream().collect(Collectors.toMap(Option::getKey, o -> o));


        ClientUserRole clientUserRole = new ClientUserRole();
        clientUserRole.setUserId(Integer.valueOf(userId));
        clientUserRole.setClientId(Integer.valueOf(clientId));
        List<ClientUserRole> userRoles = clientUserRoleService.list(new QueryWrapper<>(clientUserRole));
        List<String> values = new ArrayList<>();
        for (ClientUserRole r : userRoles) {
            Option option = optionMap.get(String.valueOf(r.getRoleId()));
            values.add(option.getKey());
        }
        result.put("options", options);
        result.put("values", values);
        return result;

    }
}
