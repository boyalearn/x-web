package com.xweb.sql.core.common.expression;

import com.xweb.sql.core.common.AbstractItem;
import com.xweb.sql.core.common.BooleanExpression;
import com.xweb.sql.core.common.Item;
import lombok.Data;

import java.util.List;

@Data
public class InExpression extends AbstractItem implements BooleanExpression {

    private Object left;

    private String not;

    private String in;

    private List<Item> items;
}
