package com.xweb.sql.parser;


import com.xweb.sql.meta.Node;

public interface SqlParser {

    Node parse(String sql);
}
