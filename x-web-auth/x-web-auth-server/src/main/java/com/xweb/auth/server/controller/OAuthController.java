package com.xweb.auth.server.controller;


import com.xweb.auth.server.oauth.XAuthAccessTokenEnhancer;
import com.xweb.auth.server.service.IXAuthLoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/8/27 14:05
 ******************************/
@Controller
@Api(tags = "授权管理")
@SessionAttributes("authorizationRequest")
public class OAuthController {


    private IXAuthLoginService loginService;


    public OAuthController(IXAuthLoginService loginService) {
        this.loginService = loginService;
    }

    /**
     * 登录
     *
     * @param request HttpServletRequest
     * @param model   Model
     * @throws Exception
     */
    @GetMapping("/login")
    public String doLogin(HttpServletRequest request, Model model) throws Exception {
        return loginService.doLogin(request, model);
    }


    /**
     * 默认首页
     *
     * @param request  HttpServletRequest
     * @param response HttpServletResponse
     * @throws Exception
     */
    @GetMapping("/home")
    public String home(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return "index";
    }

    /**
     * 应用授授权确认页面
     *
     * @param model
     * @param response
     * @throws Exception
     */
    @RequestMapping("/xauth/confirm_access")
    public ModelAndView confirm(Map<String, Object> model, HttpServletResponse response) throws Exception {
        return loginService.doConfirm(model, response);
    }

    /**
     * 错误页面
     * @param model
     * @return
     */
    @GetMapping("/xauth/error")
    public String getError(Model model,HttpServletRequest request) {
        System.out.println(request.getQueryString());
        OAuth2Exception auth2Exception = (OAuth2Exception)request.getAttribute("error");
        model.addAttribute("error",auth2Exception.getMessage());
        return "xauth-error";
    }

    @PostMapping("/xauth/error")
    public String postError(Model model,HttpServletRequest request) {
        System.out.println(request.getQueryString());
        OAuth2Exception auth2Exception = (OAuth2Exception)request.getAttribute("error");
        model.addAttribute("error",auth2Exception.getMessage());
        return "xauth-error";
    }


    /**
     * 解析token信息
     *
     * @param token
     * @return
     */
    @ApiOperation(value = "token解析")
    @GetMapping("/xauth/token")
    @ResponseBody
    public Map<String, Object> token(String token) {
        return null;//tokenEnhancer.decode(token);
    }
}
