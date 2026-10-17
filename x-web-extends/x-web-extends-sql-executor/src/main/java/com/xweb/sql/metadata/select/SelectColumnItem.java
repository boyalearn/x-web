package com.xweb.sql.metadata.select;

import com.xweb.sql.metadata.Column;
import com.xweb.sql.metadata.Table;

public class SelectColumnItem extends Column implements SelectItem{
    public SelectColumnItem(Table table, String name) {
        super(table, name);
    }
}
