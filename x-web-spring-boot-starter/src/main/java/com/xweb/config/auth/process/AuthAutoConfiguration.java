package com.xweb.config.auth.process;

import com.xweb.common.auth.XWebTokenEnhancer;
import com.xweb.common.auth.interceptor.XWebAuthInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AuthAutoConfiguration implements WebMvcConfigurer {

    @Autowired
    private XWebAuthInterceptor authInterceptor;

    @Bean
    public XWebTokenEnhancer webTokenEnhancer() {
        XWebTokenEnhancer webTokenEnhancer = new XWebTokenEnhancer();
        webTokenEnhancer.setSigningKey("1234");
        return webTokenEnhancer;
    }

    @Bean
    public XWebAuthInterceptor authInterceptor(XWebTokenEnhancer webTokenEnhancer) {
        return new XWebAuthInterceptor(webTokenEnhancer);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authInterceptor);
    }
}
