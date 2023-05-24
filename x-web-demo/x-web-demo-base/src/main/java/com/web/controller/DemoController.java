package com.web.controller;

import com.web.entity.DataJson;
import com.xweb.common.exception.BusinessException;
import com.xweb.common.web.response.RespResult;
import com.xweb.common.web.response.ResultBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DemoController {

    @ResultBody(field = @ResultBody.Field(exclude = "sex"))
    @GetMapping("/demo")
    public RespResult<DataJson> demo() {
        DataJson dataJson = new DataJson();
        dataJson.setAge("23");
        dataJson.setUserName("my name");
        return RespResult.builder().data(dataJson).build();
    }

    @GetMapping("/demo/exception")
    public RespResult<DataJson> demoException() throws BusinessException {
        throw new BusinessException("aaa", "sss");
    }
}
