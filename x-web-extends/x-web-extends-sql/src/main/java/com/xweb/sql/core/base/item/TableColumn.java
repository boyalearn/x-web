package com.xweb.sql.core.base.item;


import com.xweb.sql.core.base.Item;
import lombok.Data;

@Data
public class TableColumn implements Item {
    private String tableName;

    private String columnName;

    private String as;

    private String aliasName;

}
