package com.xweb.sql.operator;

public interface SqlOperator {
    void open();

    Object next();

    void close();
}
