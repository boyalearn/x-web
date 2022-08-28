package com.xweb.common.logs;

public interface OptionalExecutor<T> {

    /**
     * 方法内部不能够对外抛出异常
     *
     * @param logging   日志注解
     * @param args      方法参数
     * @param result    方法返回值
     * @param exception 异常
     * @return 日志记录对象
     */
    T collect(Logging logging, Object[] args, Object result, Exception exception);


    /**
     * 方法内部不能够对外抛出异常
     *
     * @param data 日志记录对象
     */
    void save(T data);
}
