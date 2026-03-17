package com.xweb.sql.core.common.expression;

import com.xweb.sql.core.common.AbstractItem;
import com.xweb.sql.core.common.BooleanExpression;
import com.xweb.sql.core.common.Item;
import lombok.Data;

@Data
public class ConcatenationExpression extends LeftAndRightExpression {

    private Item left;

    private String concatenationOperator;

    private Item right;

}
