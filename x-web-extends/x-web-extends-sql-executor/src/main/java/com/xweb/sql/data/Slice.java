package com.xweb.sql.data;


import com.xweb.sql.meta.item.Column;

public interface Slice {

    Column getColumn();

    Object getData();
}
