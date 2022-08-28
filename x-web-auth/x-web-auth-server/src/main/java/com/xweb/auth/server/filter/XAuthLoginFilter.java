package com.xweb.auth.server.filter;

import com.xweb.common.exception.BusinessException;
import com.xweb.common.standard.RespResult;
import com.xweb.common.utils.JsonUtil;
import org.springframework.security.web.authentication.ui.DefaultLoginPageGeneratingFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/8/27 10:39
 ******************************/
public class XAuthLoginFilter extends DefaultLoginPageGeneratingFilter {

    private final String loginUrl = "/login";

    private final String errorUrl = "/error";

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        if (!matches(request, this.loginUrl)) {
            chain.doFilter(request, response);
        } else if (matches(request, this.errorUrl)) {
            String data = JsonUtil.toJSON(RespResult.builder().code(BusinessException.BUSINESS_EXCEPTION).message("错误").build());
            response.setContentType("application/json;charset=UTF-8");
            response.setContentLength(data.getBytes(StandardCharsets.UTF_8).length);
            response.getWriter().write(data);
        } else {
            String data = JsonUtil.toJSON(RespResult.builder().code(BusinessException.BUSINESS_EXCEPTION).message("登录失败").build());
            response.setContentType("application/json;charset=UTF-8");
            response.setContentLength(data.getBytes(StandardCharsets.UTF_8).length);
            response.getWriter().write(data);
        }
    }

    private boolean matches(HttpServletRequest request, String url) {
        if ("GET".equals(request.getMethod()) && url != null) {
            String uri = request.getRequestURI();
            int pathParamIndex = uri.indexOf(59);
            if (pathParamIndex > 0) {
                uri = uri.substring(0, pathParamIndex);
            }

            if (request.getQueryString() != null) {
                uri = uri + "?" + request.getQueryString();
            }

            return "".equals(request.getContextPath()) ? uri.equals(url) : uri.equals(request.getContextPath() + url);
        } else {
            return false;
        }
    }
}
