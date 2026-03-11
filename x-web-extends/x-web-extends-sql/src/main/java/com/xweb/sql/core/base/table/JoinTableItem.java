package com.xweb.sql.core.base.table;

import com.xweb.sql.core.base.TableItem;
import lombok.Data;

@Data
public class JoinTableItem implements TableItem {

    private Object left;

    private String joinType;

    private Object right;

    private Object onConditions;

}
