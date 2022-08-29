package com.xweb.auth.server.controller;

import com.xweb.auth.server.entity.Client;
import com.xweb.auth.server.request.ClientRequest;
import com.xweb.auth.server.service.IClientService;
import com.xweb.common.resolver.FormBody;
import com.xweb.common.standard.PageEntity;
import com.xweb.common.standard.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/8/29 23:55
 ******************************/
@Controller
public class XAuthController {
    @Autowired
    private IClientService clientService;

    @GetMapping("/tenant_list.html")
    public String tenant() {
        return "tenant_list";
    }

    @GetMapping("/client_list.html")
    public ModelAndView client( @FormBody ClientRequest request) {
        PageEntity<Client> clientData= clientService.selectClients(request);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list",clientData.getList());
        modelAndView.setViewName("client_list.html");
        return modelAndView;
    }

    @GetMapping("/user_list.html")
    public ModelAndView user(@FormBody ClientRequest request) {
        PageEntity<Client> clientData= clientService.selectClients(request);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list",clientData.getList());
        modelAndView.setViewName("user_list.html");
        return modelAndView;
    }

    @GetMapping("/role_list.html")
    public String role() {
        return "role_list";
    }

    @GetMapping("/resource_list.html")
    public String resource() {
        return "resource_list";
    }
}
