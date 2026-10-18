package com.xweb.sql.parser;


import com.xweb.sql.meta.Select;

public interface SqlParser {

    Select parse(String sql);
}
