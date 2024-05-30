package com.web.controller;

import com.web.entity.DataJson;
import com.xweb.common.exception.BusinessException;
import com.xweb.common.web.response.RespResult;
import com.xweb.common.web.response.ResultBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map;

@RestController
public class DemoController {

    @ResultBody(field = @ResultBody.Field(exclude = "sex"))
    @GetMapping("/demo")
    public RespResult<DataJson> demo() {
        DataJson dataJson = new DataJson();
        dataJson.setAge("23");
        dataJson.setUserName("小明");
        return RespResult.builder().data(dataJson).build();
    }

    @GetMapping("/demo/exception")
    public RespResult<DataJson> demoException() throws BusinessException {
        throw new BusinessException("aaa", "sss");
    }

    @PostMapping("//key/v3/encrypt")
    public RespResult<DataJson> demo(HttpServletRequest request) throws BusinessException {
        try{
                // 获取请求体
                StringBuilder sb = new StringBuilder();
                String line;
                try (BufferedReader reader = request.getReader()) {
                    while ((line = reader.readLine()) != null) {
                        sb.append(line).append('\n');
                    }
                }
            System.out.println(sb.toString());

                // 处理请求体
                // ...
            }catch (Exception e){


        }finally {
            System.out.println("");
        }
        return RespResult.builder().build();
    }

    @PostMapping("//key/v3/decrypt")
    public RespResult<DataJson> decom(HttpServletRequest request) throws BusinessException {
        try{
            // 获取请求体
            StringBuilder sb = new StringBuilder();
            String line;
            try (BufferedReader reader = request.getReader()) {
                while ((line = reader.readLine()) != null) {
                    sb.append(line).append('\n');
                }
            }
            System.out.println(sb.toString());

            // 处理请求体
            // ...
        }catch (Exception e){


        }finally {
            System.out.println("");
        }
        return RespResult.builder().build();
    }
}
