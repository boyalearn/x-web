package com.xweb.sql.core.common.item;

import com.xweb.sql.core.common.Item;
import lombok.Data;

@Data
public class SelectAllItem implements Item {
    private String tableName;
    private String columnName;
    private String as;
    private String alias;


    public SelectAllItem(String columnName) {
        this.columnName = columnName;
    }

    public SelectAllItem(String tableName, String columnName) {
        this.tableName = tableName;
        this.columnName = columnName;
    }
}
