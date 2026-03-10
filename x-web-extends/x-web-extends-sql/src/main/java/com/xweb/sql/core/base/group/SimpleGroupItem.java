package com.xweb.sql.core.base.group;

import com.xweb.sql.core.base.GroupItem;
import lombok.Data;

@Data
public class SimpleGroupItem implements GroupItem {
    private String tableName;
    private String columnName;
}
