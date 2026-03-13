package com.xweb.sql.core.common.table;

import com.xweb.sql.core.common.Table;
import lombok.Data;

@Data
public class SimpleTable implements Table {

    private String database;

    private String tableName;

    private String as;

    private String alias;
}
