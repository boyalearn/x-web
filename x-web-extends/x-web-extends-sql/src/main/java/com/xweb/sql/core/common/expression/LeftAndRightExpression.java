package com.xweb.sql.core.common.expression;

import com.xweb.sql.core.common.AbstractItem;
import com.xweb.sql.core.common.BooleanExpression;
import com.xweb.sql.core.common.Item;
import lombok.Data;

@Data
public abstract class LeftAndRightExpression extends AbstractItem implements BooleanExpression {

    private Item left;

    private Item right;
}
