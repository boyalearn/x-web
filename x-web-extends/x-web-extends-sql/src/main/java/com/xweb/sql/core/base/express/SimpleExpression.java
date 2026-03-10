package com.xweb.sql.core.base.express;

import com.xweb.sql.core.base.HavingItem;
import com.xweb.sql.core.base.WhereItem;
import lombok.Data;

@Data
public class SimpleExpression implements WhereItem, HavingItem {

    private Object left;

    private String op;

    private Object right;
}
