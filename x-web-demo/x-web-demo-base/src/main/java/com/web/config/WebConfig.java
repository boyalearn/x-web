package com.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author zouhuixing
 * @date 2023/6/14
 */
public class WebConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(new ApiInfoBuilder().title("aaa").build())
                .enable(true).select().apis(RequestHandlerSelectors.basePackage("com.web.controller"))
                .paths(PathSelectors.any()).build();
    }
}
