package com.xweb.mysql.driver;

import com.mysql.cj.jdbc.ConnectionImpl;

public class MysqlExtendsCJConnection extends ConnectionImpl {
    public ConnectionImpl connection;

    public MysqlExtendsCJConnection(ConnectionImpl connection) {
        this.connection = connection;

    }
}
