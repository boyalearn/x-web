package com.web.runner;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.web.entity.DataJson;
import com.xweb.common.jackson.NumEnumDeserializer;
import com.xweb.common.jackson.NumEnumSerializer;
import com.xweb.common.jackson.XWebJacksonAnnotationInterceptor;
import com.xweb.common.web.standard.IEnum;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

//@Component
public class ApplicationAfterRunner implements ApplicationRunner {

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


    @Override
    public void run(ApplicationArguments args) throws Exception {
        while (true) {
            init();
        }
    }
}
