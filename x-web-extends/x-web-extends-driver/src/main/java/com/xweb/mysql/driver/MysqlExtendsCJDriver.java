package com.xweb.mysql.driver;

import com.mysql.cj.jdbc.Driver;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MysqlExtendsCJDriver extends Driver {
    public MysqlExtendsCJDriver() throws SQLException {

    }

    static {
        try {
            DriverManager.registerDriver(new MysqlExtendsCJDriver());
        } catch (SQLException var1) {
            throw new RuntimeException("Can't register driver!");
        }
    }

    @Override
    public Connection connect(String url, Properties info) throws SQLException {
        final Connection connect = super.connect(url, info);
        return ConnectionFactory.create(connect, new SqlChangeInterceptor(connect));
    }

    class SqlChangeInterceptor implements MethodInterceptor {

        private Connection connection;

        public SqlChangeInterceptor(Connection connection) {
            this.connection = connection;
        }

        @Override
        public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
            // 前置增强逻辑
            System.out.println("方法调用前：" + method.getName());
            Object result = proxy.invokeSuper(connection, args);
            // 后置增强逻辑
            System.out.println("方法调用后：" + method.getName());
            return result;
        }
    }
}


