package com.web.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.web.entity.DataJson;
import com.xweb.common.exception.BusinessException;
import com.xweb.common.jackson.NumEnumDeserializer;
import com.xweb.common.jackson.NumEnumSerializer;
import com.xweb.common.jackson.XWebJacksonAnnotationInterceptor;
import com.xweb.common.web.response.RespResult;
import com.xweb.common.web.response.ResultBody;
import com.xweb.common.web.standard.IEnum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map;

@RestController
public class DemoController {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    static {
        objectMapper.setSerializationInclusion(JsonInclude.Include.ALWAYS);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, false);
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);

        SimpleModule simpleModule = new SimpleModule();
        simpleModule.addSerializer(IEnum.class, new NumEnumSerializer());
        simpleModule.addDeserializer(Enum.class, new NumEnumDeserializer(Enum.class));
        objectMapper.registerModule(simpleModule);
        objectMapper.setAnnotationIntrospector(new XWebJacksonAnnotationInterceptor());
    }

    @PostConstruct
    public void init() throws JsonProcessingException {
        DataJson dataJson = new DataJson();
        dataJson.setAge("23");
        dataJson.setUserName("小明");
        dataJson.setSex("男");
        DataJson data = new DataJson();
        dataJson.setData(data);
        data.setSex("女");
        System.out.println(objectMapper.writeValueAsString(dataJson));
    }

    @ResultBody(field = @ResultBody.Field(exclude = {"data.sex", "data.age", "age"}))
    @GetMapping("/demo")
    public RespResult<DataJson> demo() {
        DataJson dataJson = new DataJson();
        dataJson.setAge("23");
        dataJson.setUserName("小明");
        dataJson.setSex("男");
        DataJson data = new DataJson();
        dataJson.setData(data);
        data.setSex("女");
        return RespResult.builder().data(dataJson).build();
    }

    @GetMapping("/demo/exception")
    public RespResult<DataJson> demoException() throws BusinessException {
        throw new BusinessException("aaa", "sss");
    }

    @PostMapping("/key/v3/encrypt")
    public RespResult<DataJson> demo(HttpServletRequest request) throws BusinessException {
        try {
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
        } catch (Exception e) {


        } finally {
            System.out.println("");
        }
        return RespResult.builder().build();
    }

    @PostMapping("/key/v3/decrypt")
    public RespResult<DataJson> decom(HttpServletRequest request) throws BusinessException {
        try {
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
        } catch (Exception e) {


        } finally {
            System.out.println("");
        }
        return RespResult.builder().build();
    }
}
