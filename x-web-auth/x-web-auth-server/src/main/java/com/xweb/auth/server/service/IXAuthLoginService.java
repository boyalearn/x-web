package com.xweb.auth.server.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/8/28 0:25
 ******************************/
public interface IXAuthLoginService {
    void doLogin(HttpServletRequest request, HttpServletResponse response) throws Exception;

    void doConfirm(Map<String, Object> model, HttpServletResponse response) throws Exception;
}

