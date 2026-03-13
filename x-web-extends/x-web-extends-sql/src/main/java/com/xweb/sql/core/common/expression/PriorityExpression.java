package com.xweb.sql.core.common.expression;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.Table;
import lombok.Data;

@Data
public class PriorityExpression implements Table, Item {

    private Object expression;

    private String as;

    private String alias;

    public PriorityExpression(Object expression) {
        this.expression = expression;
    }
}
