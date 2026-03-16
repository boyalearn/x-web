package com.xweb.sql.core.common.expression;

import com.xweb.sql.core.common.AbstractItem;
import com.xweb.sql.core.common.BooleanExpression;
import com.xweb.sql.core.common.Item;
import lombok.Data;

@Data
public class BetweenAndExpression extends AbstractItem implements BooleanExpression {

    private Item left;

    private String not;

    private String between;

    private Item lower;

    private String and;

    private Item upper;
}
