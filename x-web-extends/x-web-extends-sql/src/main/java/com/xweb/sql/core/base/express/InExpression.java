package com.xweb.sql.core.base.express;

import com.xweb.sql.core.base.WhereItem;
import lombok.Data;

@Data
public class InExpression implements WhereItem {
    private Object left;

    private String not;

    private String in;
}
