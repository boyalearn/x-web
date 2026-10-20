package com.xweb.sql.operator;

import com.xweb.sql.data.Page;

public interface SqlOperator {
    void open();

    /**
     * 不能返回空
     *
     * @return
     */
    Page next();

    void close();
}
