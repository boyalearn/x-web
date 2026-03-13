package com.xweb.mysql.driver;

import com.mysql.cj.jdbc.Driver;

import java.sql.DriverManager;
import java.sql.SQLException;

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
}
