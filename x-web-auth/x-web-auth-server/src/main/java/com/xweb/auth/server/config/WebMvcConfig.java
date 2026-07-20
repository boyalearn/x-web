package com.xweb.auth.server.config;

import com.xweb.auth.server.oauth.XAuthAccessTokenEnhancer;
import com.xweb.auth.server.service.IUserService;
import com.xweb.common.auth.XWebTokenEnhancer;
import com.xweb.common.auth.interceptor.XWebAuthInterceptor;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@AllArgsConstructor
public class WebMvcConfig implements WebMvcConfigurer {



    private XAuthAccessTokenEnhancer xAuthAccessTokenEnhancer;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new XWebAuthInterceptor(xAuthAccessTokenEnhancer));
    }



    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 解决静态资源⽆法访问
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/");
        // 解决swagger⽆法访问
        registry.addResourceHandler("/swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        // 解决swagger的js⽂件⽆法访问
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

}
