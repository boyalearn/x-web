package com.xweb.sql.core.base.table;

import com.xweb.sql.core.base.TableItem;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BaseTableItem implements TableItem {
    private String tableName;

    private String as;

    private String aliasName;

    public BaseTableItem(String tableName) {
        this.tableName = tableName;
    }
}
