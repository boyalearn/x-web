package com.xweb.sql.core.base;

import lombok.Data;

@Data
public class SelectAllItem implements Item {
    private String tableName;
    private String columnName;
    private String as;
    private String aliasName;


    public SelectAllItem(String columnName) {
        this.columnName = columnName;
    }

    public SelectAllItem(String tableName, String columnName) {
        this.tableName = tableName;
        this.columnName = columnName;
    }
}
