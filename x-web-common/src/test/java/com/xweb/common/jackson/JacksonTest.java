package com.xweb.common.jackson;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.xweb.common.entity.DataJson;
import com.xweb.common.web.standard.IEnum;
import com.xweb.common.web.response.RespResult;

public class JacksonTest {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    static {
        objectMapper.setSerializationInclusion(JsonInclude.Include.ALWAYS);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, false);
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);

        SimpleModule simpleModule = new SimpleModule();
        simpleModule.addSerializer(IEnum.class, new NumEnumSerializer());
        simpleModule.addDeserializer(Enum.class, new NumEnumDeserializer(Enum.class));
        //simpleModule.addSerializer(RespResult.class, new XWebJacksonSerializer(RespResult.class));
        objectMapper.setAnnotationIntrospector(new XWebJacksonAnnotationInterceptor());
        objectMapper.registerModule(simpleModule);

    }

    public static void main(String[] args) throws JsonProcessingException {

        DataJson dataJson = new DataJson();
        dataJson.setName("小米");
        dataJson.setSex("男");
        RespResult respResult = RespResult.builder().data(dataJson).build();
        System.out.println(objectMapper.writeValueAsString(respResult));

    }
}
