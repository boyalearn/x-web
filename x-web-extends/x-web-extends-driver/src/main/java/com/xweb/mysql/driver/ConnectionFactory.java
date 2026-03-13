package com.xweb.mysql.driver;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;

import java.sql.Connection;

public class ConnectionFactory {

    public static final Connection create(Connection connect, Callback callback) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(connect.getClass());
        enhancer.setCallback(callback);
        Connection proxy = (Connection) enhancer.create();
        return proxy;
    }
}
