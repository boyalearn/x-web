package com.xweb.sql.operator;

import com.xweb.sql.result.Page;

public interface SqlOperator {
    void open();

    Page next();

    void close();
}
