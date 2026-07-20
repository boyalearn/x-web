package com.xweb.auth.server.config;

import com.xweb.auth.server.oauth.XAuthAccessTokenEnhancer;
import com.xweb.common.auth.interceptor.XWebAuthInterceptor;
import com.xweb.logger.interceptor.XWebLoggerInterceptor;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@AllArgsConstructor
public class WebMvcConfig implements WebMvcConfigurer {

    private XAuthAccessTokenEnhancer xAuthAccessTokenEnhancer;

    private XWebLoggerInterceptor xWebLoggerInterceptor;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new XWebAuthInterceptor(xAuthAccessTokenEnhancer));
        registry.addInterceptor(xWebLoggerInterceptor);
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
