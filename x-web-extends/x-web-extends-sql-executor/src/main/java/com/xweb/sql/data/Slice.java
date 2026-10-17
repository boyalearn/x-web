package com.xweb.sql.data;

import com.xweb.sql.metadata.Column;

public interface Slice {

    Column getColumn();

    Object getData();
}
