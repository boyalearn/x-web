package com.web.api.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xweb.common.web.parameter.resolver.FormParamHandlerMethodArgumentResolver;
import com.xweb.common.web.response.converter.ResponseBodyPreReturnHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        resolvers.add(new FormParamHandlerMethodArgumentResolver());
    }

    @Autowired
    RequestMappingHandlerAdapter requestMappingHandlerAdapter;

    @Bean
    public ResponseBodyPreReturnHandler createResponseBodyReturnHandler() {
        ResponseBodyPreReturnHandler responseBodyReturnHandler = new ResponseBodyPreReturnHandler(new ObjectMapper());

        ArrayList<HandlerMethodReturnValueHandler> returnValueHandlers = new ArrayList<>();
        returnValueHandlers.add(responseBodyReturnHandler);
        returnValueHandlers.addAll(requestMappingHandlerAdapter.getReturnValueHandlers());
        requestMappingHandlerAdapter.setReturnValueHandlers(returnValueHandlers);

        return responseBodyReturnHandler;
    }

}
