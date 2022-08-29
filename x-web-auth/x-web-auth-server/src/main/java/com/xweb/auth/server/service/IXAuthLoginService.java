package com.xweb.auth.server.service;

import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/8/28 0:25
 ******************************/
public interface IXAuthLoginService {
    String doLogin(HttpServletRequest request, Model model) throws Exception;

    ModelAndView doConfirm(Map<String, Object> model, HttpServletResponse response) throws Exception;
}

