package com.xweb.mysql.driver;

import com.mysql.jdbc.Driver;

import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlExtendsDriver extends Driver {
    public MysqlExtendsDriver() throws SQLException {
    }

    static {
        try {
            DriverManager.registerDriver(new MysqlExtendsDriver());
        } catch (SQLException var1) {
            throw new RuntimeException("Can't register driver!");
        }
    }
}
