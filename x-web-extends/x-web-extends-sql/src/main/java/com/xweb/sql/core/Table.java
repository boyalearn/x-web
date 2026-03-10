package com.xweb.sql.core;

import lombok.Data;

@Data
public class Table {

    private String tableName;

    private String alias;

    private String as;

    private String sqlTable;

    public String toString() {
        StringBuffer tableStringName = new StringBuffer();
        tableStringName.append(tableName);
        if (null != as) {
            tableStringName.append(" as ");
        }
        if (null != alias) {
            tableStringName.append(alias);
        }
        return tableStringName.toString();
    }
}
