package com.xweb.auth.server.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xweb.auth.server.bean.ResourceSelect;
import com.xweb.auth.server.entity.*;
import com.xweb.auth.server.request.ClientRequest;
import com.xweb.auth.server.request.ResourceRequest;
import com.xweb.auth.server.request.RoleRequest;
import com.xweb.auth.server.service.*;
import com.xweb.auth.server.ui.FromUtil;
import com.xweb.auth.server.util.PageUIUtil;
import com.xweb.common.resolver.FormBody;
import com.xweb.common.standard.PageEntity;
import com.xweb.common.standard.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/8/29 23:55
 ******************************/
@Controller
public class XAuthController {
    @Autowired
    private IClientService clientService;

    @Autowired
    private IUserService userService;

    @Autowired
    private IRoleService roleService;

    @Autowired
    private IResourceService resourceService;

    @Autowired
    private ITenantService tenantService;

    @Autowired
    private IXAuthService authService;

    @Autowired
    private IRoleResourceService roleResourceService;

    @GetMapping("/tenant_list.html")
    public ModelAndView tenant(@FormBody PageRequest request) {
        PageEntity<Tenant> tenantData = tenantService.selectTenants(request);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list", tenantData.getList());
        modelAndView.setViewName("business/tenant_list.html");
        PageUIUtil.buildPageInfo("/tenant_list.html", tenantData, modelAndView);
        return modelAndView;
    }

    @GetMapping("/client_list.html")
    public ModelAndView client(@FormBody ClientRequest request) {
        PageEntity<Client> clientData = clientService.selectClients(request);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list", clientData.getList());
        modelAndView.addObject("tenants", tenantService.list());
        modelAndView.setViewName("business/client_list.html");
        PageUIUtil.buildPageInfo("/client_list.html", clientData, modelAndView);

        return modelAndView;
    }

    @GetMapping("/client_detail.html")
    public ModelAndView clientDetail(@FormBody ClientRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("business/client_detail.html");
        return modelAndView;
    }


    @GetMapping("/user_list.html")
    public ModelAndView user(@FormBody PageRequest request) {
        PageEntity<User> userData = userService.selectUsers(request);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list", userData.getList());
        modelAndView.setViewName("business/user_list.html");
        PageUIUtil.buildPageInfo("/user_list.html", userData, modelAndView);
        return modelAndView;
    }

    @GetMapping("/role_list.html")
    public ModelAndView role(@FormBody RoleRequest request) {
        PageEntity<Role> roleData = roleService.selectRoles(request);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list", roleData.getList());
        modelAndView.addObject("tenants", tenantService.list());
        modelAndView.addObject("clients", clientService.list());
        modelAndView.setViewName("business/role_list.html");
        PageUIUtil.buildPageInfo("/role_list.html", roleData, modelAndView);
        return modelAndView;
    }

    @GetMapping("/role_detail.html")
    public ModelAndView roleDetail(String id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("business/role_detail.html");
        Role role = roleService.getById(id);
        if (!Optional.ofNullable(role).isPresent()) {
            return modelAndView;
        }
        Resource resource = new Resource();
        resource.setClientId(role.getClientId());
        List<Resource> list = resourceService.list(new QueryWrapper<>(resource));
        List<ResourceSelect> resourceSelects = buildResourceSelect(list, getRoleResource(role));
        modelAndView.addObject("resources", resourceSelects);
        return modelAndView;
    }

    private List<ResourceSelect> buildResourceSelect(List<Resource> all, List<Resource> selected) {
        List<ResourceSelect> list = new ArrayList<>();
        for (Resource resource : all) {
            ResourceSelect select = new ResourceSelect();
            select.setId(resource.getId());
            select.setName(resource.getName());
            select.setSelected(selected.contains(resource));
            list.add(select);
        }
        return list;
    }

    private List<Resource> getRoleResource(Role role) {
        if (!Optional.ofNullable(role).isPresent()) {
            return new ArrayList<>();
        }
        RoleResource roleResource = new RoleResource();
        roleResource.setRoleId(role.getId());
        Set<Integer> resourceIds = roleResourceService.list(new QueryWrapper<>(roleResource)).stream()
                .map(RoleResource::getResourceId).collect(Collectors.toSet());
        if (resourceIds.isEmpty()) {
            return new ArrayList<>();
        }
        return resourceService.listByIds(resourceIds);
    }

    @GetMapping("/resource_list.html")
    public ModelAndView resource(@FormBody ResourceRequest request) {
        PageEntity resourcesData = resourceService.selectResources(request);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list", resourcesData.getList());
        modelAndView.addObject("tenants", tenantService.list());
        modelAndView.addObject("clients", clientService.list());
        modelAndView.setViewName("business/resource_list.html");
        PageUIUtil.buildPageInfo("/resource_list.html", resourcesData, modelAndView);
        return modelAndView;
    }

    @GetMapping("/add.html")
    public ModelAndView add(String type) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("forms", FromUtil.buildForm(type));
        modelAndView.setViewName("business/add.html");
        modelAndView.addObject("url", type);
        return modelAndView;
    }
}
