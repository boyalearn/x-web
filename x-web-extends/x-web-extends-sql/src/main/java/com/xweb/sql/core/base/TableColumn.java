package com.xweb.sql.core.base;


import lombok.Data;

@Data
public class TableColumn implements Item {
    private String tableName;

    private String columnName;

    private String aliasName;

}
