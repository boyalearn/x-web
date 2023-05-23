package com.xweb.config.exeception.process;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(GlobalExceptionHandler.class)
public class CommonConfigurationProcessor implements BeanDefinitionRegistryPostProcessor {

    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        String[] beanDefinitionNames = beanDefinitionRegistry.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            if (!EnableGlobalExceptionHandlerImportSelector.ENABLE && GlobalExceptionHandler.class.getSimpleName().equalsIgnoreCase(beanDefinitionName)) {
                beanDefinitionRegistry.removeBeanDefinition(beanDefinitionName);
            }
        }
    }

    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

    }
}
