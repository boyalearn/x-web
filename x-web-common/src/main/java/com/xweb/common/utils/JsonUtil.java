package com.xweb.common.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/8/27 11:24
 ******************************/
public class JsonUtil {

    private static ObjectMapper MAPPER = new ObjectMapper();

    public static String toJSON(Object obj) throws JsonProcessingException {
        return MAPPER.writeValueAsString(obj);
    }

    public static Object toObject(String json, Class<?> clazz) throws JsonProcessingException {
        return MAPPER.readValue(json, clazz);
    }
}
