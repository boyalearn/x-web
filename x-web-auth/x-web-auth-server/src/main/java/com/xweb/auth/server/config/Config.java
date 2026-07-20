package com.xweb.auth.server.config;

import com.xweb.auth.server.oauth.XAuthAccessTokenEnhancer;
import com.xweb.auth.server.service.IUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableWebMvc
@Configuration
@EnableSwagger2
public class Config {

    @Value("${spring.swagger.enabled:false}")
    private boolean enable;

    @Value("${spring.token.signingKey:123}")
    private String signingKey;

    @Value("${spring.token.verifierKey:123}")
    private String verifierKey;

    @Bean
    public XAuthAccessTokenEnhancer accessTokenEnhancer(IUserService userService){
        XAuthAccessTokenEnhancer xAuthAccessTokenEnhancer = new XAuthAccessTokenEnhancer(userService);
        xAuthAccessTokenEnhancer.setSigningKey(signingKey);
        xAuthAccessTokenEnhancer.setVerifierKey(verifierKey);
        return xAuthAccessTokenEnhancer;
    }

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2).enable(enable)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("XAuth API").description("API 文档")
                .version("1.0").build();
    }
}
