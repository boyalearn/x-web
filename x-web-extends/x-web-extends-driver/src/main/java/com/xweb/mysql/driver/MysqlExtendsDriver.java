package com.xweb.mysql.driver;

import com.mysql.jdbc.Driver;
import com.xweb.mysql.driver.jdbc.ExtendsStatement;
import com.xweb.sql.mysql.MysqlUtils;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Properties;

public class MysqlExtendsDriver extends Driver {


    private final static String[] METHODS = {"prepareStatement"};

    public MysqlExtendsDriver() throws SQLException {
    }

    static {
        try {
            DriverManager.registerDriver(new MysqlExtendsDriver());
        } catch (SQLException var1) {
            throw new RuntimeException("Can't register driver!");
        }
    }

    @Override
    public Connection connect(String url, Properties info) throws SQLException {
        final Connection connect = super.connect(url, info);
        return ConnectionFactory.create(connect, new SqlChangeInterceptor(connect));

    }

    public class SqlChangeInterceptor implements MethodInterceptor {

        private Connection connection;

        public SqlChangeInterceptor(Connection connection) {
            this.connection = connection;
        }

        //经过严谨的分析这里才是最好的注入入口
        @Override
        public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
            if (Arrays.asList(METHODS).contains(method.getName())) {
                if (args instanceof Object[]) {
                    String originalSql = (String) args[0];
                    System.out.println("sql:" + originalSql);
                    if (originalSql.toUpperCase(Locale.ROOT).startsWith("SELECT")) {
                        System.out.println("s" + originalSql);
                        final String convertSql = MysqlUtils.convert(originalSql);
                        args[0] = convertSql;
                        System.out.println("d" + convertSql);
                    }

                }
                Object result = proxy.invoke(connection, args);
                /*ClientPreparedStatement clientPreparedStatement = (ClientPreparedStatement) result;
                ExtendsStatement extendsStatement = new ExtendsStatement(clientPreparedStatement);

                Enhancer enhancer = new Enhancer();
                enhancer.setSuperclass(ExtendsStatement.class);
                enhancer.setCallback(new JdbcStatementInterceptor(extendsStatement));
                ExtendsStatement statement = (ExtendsStatement) enhancer.create();
                statement.setClientPreparedStatement(clientPreparedStatement);
                return statement;*/
                return result;
            }
            Object result = proxy.invoke(connection, args);
            return result;
        }

        public class JdbcStatementInterceptor implements MethodInterceptor {

            public ExtendsStatement extendsStatement;

            public JdbcStatementInterceptor(ExtendsStatement extendsStatement) {
                this.extendsStatement = extendsStatement;
            }

            @Override
            public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                // 前置增强逻辑
                Object result = proxy.invoke(extendsStatement, args);
                return result;
            }
        }
    }
}
