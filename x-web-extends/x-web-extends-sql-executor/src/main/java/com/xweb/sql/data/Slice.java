package com.xweb.sql.data;


import com.xweb.sql.meta.node.ColumnNode;

public interface Slice {

    ColumnNode getColumn();

    Object getData();
}
