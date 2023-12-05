package com.web.custom;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.Lifecycle;
import org.springframework.context.support.DefaultLifecycleProcessor;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zouhuixing
 * @date 2023/8/10
 */
public class DefaultLifecycleProcessorProxy extends DefaultLifecycleProcessor {
    private DefaultLifecycleProcessor defaultLifecycleProcessor;

    public DefaultLifecycleProcessorProxy(DefaultLifecycleProcessor defaultLifecycleProcessor) {
        this.defaultLifecycleProcessor = defaultLifecycleProcessor;
    }

    @Override
    public void setTimeoutPerShutdownPhase(long timeoutPerShutdownPhase) {
        super.setTimeoutPerShutdownPhase(timeoutPerShutdownPhase);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) {
        super.setBeanFactory(beanFactory);
    }

    @Override
    public void start() {
    }

    @Override
    public void stop() {
    }

    @Override
    public void onRefresh() {
    }

    @Override
    public void onClose() {
    }

    @Override
    public boolean isRunning() {
        return true;
    }

    @Override
    protected Map<String, Lifecycle> getLifecycleBeans() {
        return new HashMap<>();
    }

    @Override
    protected int getPhase(Lifecycle bean) {
        return super.getPhase(bean);
    }
}
