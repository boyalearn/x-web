package com.web.api.controller;

import com.web.api.client.DemoClient;
import com.web.api.entity.RequestParameter;
import com.xweb.common.web.parameter.resolver.FormBody;
import com.xweb.common.web.response.RespResult;
import com.xweb.common.web.response.ResultBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoClient demoClient;

    @GetMapping("/demo")
    public Map<String, Object> demo() {
        Map<String, Object> header = new HashMap<>();
        header.put("header", "header");
        Map<String, Object> body = new HashMap<>();
        body.put("body", "body");
        demoClient.postHome(22L, header, body);
        demoClient.getHome(22L, header, body);

        return new HashMap<>();
    }

    @GetMapping("/home1")
    public Map<String, Object> home(HttpServletRequest request, @RequestHeader Map<String, Object> header, @RequestBody Map<String, Object> body) {
        Enumeration<String> headerNames = request.getParameterNames();
        while (headerNames.hasMoreElements()) {
            System.out.println(headerNames.nextElement());
        }
        return new HashMap<>();
    }

    @PostMapping("/home")
    public Map<String, Object> postHome(HttpServletRequest request, @RequestHeader Map<String, Object> header, @RequestBody Map<String, Object> body) {
        System.out.println(header);
        System.out.println(body);
        return new HashMap<>();
    }

    @ResultBody(field = @ResultBody.Field(exclude = "names"))
    @GetMapping("/parameter")
    public RespResult<String> parameter(@FormBody RequestParameter parameter) {
        System.out.println(parameter.toString());
        return RespResult.builder().data("222").build();
    }
}
