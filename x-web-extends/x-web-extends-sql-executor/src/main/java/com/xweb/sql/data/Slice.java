package com.xweb.sql.data;

import com.xweb.sql.metadata.Table;

public interface Slice {

    Table getTable();

    String getColumn();

    Object getData();
}
