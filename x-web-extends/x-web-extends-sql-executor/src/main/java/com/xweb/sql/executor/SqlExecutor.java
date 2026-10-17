package com.xweb.sql.executor;

import com.xweb.sql.data.Page;

public interface SqlExecutor {

    Page execute(String sql);
}
