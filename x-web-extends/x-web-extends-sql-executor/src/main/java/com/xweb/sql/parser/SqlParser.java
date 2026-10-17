package com.xweb.sql.parser;

import com.xweb.sql.metadata.select.Select;

public interface SqlParser {

    Select parse(String sql);
}
