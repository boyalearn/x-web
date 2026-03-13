package com.xweb.mysql.driver;


import com.mysql.cj.jdbc.JdbcConnection;

public class HideParameterUtil {

    private static ThreadLocal<JdbcConnection> connectionThreadLocal = new ThreadLocal<JdbcConnection>();

    private static ThreadLocal<String> dbThreadLocal = new ThreadLocal<String>();

    public static JdbcConnection connection() {
        return connectionThreadLocal.get();
    }

    public static void connection(JdbcConnection connection) {
        connectionThreadLocal.set(connection);
    }

    public static String db() {
        return dbThreadLocal.get();
    }

    public static void db(String db) {
        dbThreadLocal.set(db);
    }
}
