package com.web.custom;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.Lifecycle;
import org.springframework.context.SmartLifecycle;
import org.springframework.context.support.DefaultLifecycleProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

/**
 * @author zouhuixing
 * @date 2023/8/9
 */
//@Component
public class StopTomcatStartProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof DefaultLifecycleProcessor) {
            DefaultLifecycleProcessor defaultLifecycleProcessor = (DefaultLifecycleProcessor) bean;
            DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory) getBeanFactory(defaultLifecycleProcessor);
            String[] beanNames = beanFactory.getBeanNamesForType(Lifecycle.class, false, false);
            /*for (String name : beanNames) {
                System.out.println(name);
                if(name.equals("lifecycleProcessor")||name.equals("documentationPluginsBootstrapper")||name.equals("webServerStartStop")){
                    beanFactory.removeBeanDefinition(name);
                }
            }*/
            return new DefaultLifecycleProcessorProxy((DefaultLifecycleProcessor) bean);
        }
        return bean;
    }

    private ConfigurableListableBeanFactory getBeanFactory(DefaultLifecycleProcessor defaultLifecycleProcessor) {
        try {
            Field beanFactory = null;
            beanFactory = DefaultLifecycleProcessor.class.getDeclaredField("beanFactory");
            beanFactory.setAccessible(true);
            return (ConfigurableListableBeanFactory) beanFactory.get(defaultLifecycleProcessor);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
