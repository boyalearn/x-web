package com.xweb.sql.core.common.item;

import com.xweb.sql.core.common.BooleanExpression;
import com.xweb.sql.core.common.Item;
import lombok.Data;

@Data
public class WhenThenItem implements Item {

    private String when;

    private BooleanExpression condition;

    private String then;

    private Object result;

    private String as;

    private String alias;
}
