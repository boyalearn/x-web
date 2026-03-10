package com.xweb.sql.core.base;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BaseTableItem implements TableItem {
    private String tableName;
}
