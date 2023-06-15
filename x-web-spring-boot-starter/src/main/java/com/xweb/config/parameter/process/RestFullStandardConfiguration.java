package com.xweb.config.parameter.process;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.xweb.common.jackson.NumEnumDeserializer;
import com.xweb.common.jackson.NumEnumSerializer;
import com.xweb.common.jackson.XWebJacksonAnnotationInterceptor;
import com.xweb.common.web.parameter.converter.NumberEnumConverterFactory;
import com.xweb.common.web.parameter.resolver.FormParamHandlerMethodArgumentResolver;
import com.xweb.common.web.response.converter.ResponseBodyPreReturnHandler;
import com.xweb.common.web.standard.IEnum;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class RestFullStandardConfiguration implements WebMvcConfigurer {

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


    /**
     * Get请求中的枚举转换处理配置
     *
     * @param registry
     */
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.removeConvertible(String.class, Enum.class);
        registry.removeConvertible(Enum.class, String.class);
        registry.addConverterFactory(new NumberEnumConverterFactory());
    }

    /**
     * 注入参数解析处理器
     *
     * @param resolvers
     */
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        resolvers.add(new FormParamHandlerMethodArgumentResolver());
    }

    /**
     * JSON请求体转换配置
     *
     * @param converters
     */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {

        for (HttpMessageConverter<?> converter : converters) {
            if (converter instanceof StringHttpMessageConverter) {
                ((StringHttpMessageConverter) converter).setDefaultCharset(StandardCharsets.UTF_8);
            } else if (converter instanceof MappingJackson2HttpMessageConverter) {
                MappingJackson2HttpMessageConverter messageConverter = (MappingJackson2HttpMessageConverter) converter;
                messageConverter.setObjectMapper(objectMapper);
            }
        }
    }


    @Bean
    public ResponseBodyPreReturnHandler createResponseBodyReturnHandler(RequestMappingHandlerAdapter requestMappingHandlerAdapter) {
        ResponseBodyPreReturnHandler responseBodyReturnHandler = new ResponseBodyPreReturnHandler(objectMapper);
        ArrayList<HandlerMethodReturnValueHandler> returnValueHandlers = new ArrayList<>();
        returnValueHandlers.add(responseBodyReturnHandler);
        returnValueHandlers.addAll(requestMappingHandlerAdapter.getReturnValueHandlers());
        requestMappingHandlerAdapter.setReturnValueHandlers(returnValueHandlers);
        return responseBodyReturnHandler;
    }
}
