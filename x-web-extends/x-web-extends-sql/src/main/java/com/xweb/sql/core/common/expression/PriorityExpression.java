package com.xweb.sql.core.common.expression;

import com.xweb.sql.core.common.AbstractItem;
import com.xweb.sql.core.common.BooleanExpression;
import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.Table;
import lombok.Data;

@Data
public class PriorityExpression extends AbstractItem implements BooleanExpression, Table, Item {

    private Item expression;

    public PriorityExpression(Item expression) {
        this.expression = expression;
    }
}
