package com.xweb.sql.core.common.expression;

import com.xweb.sql.core.common.AbstractItem;
import com.xweb.sql.core.common.BooleanExpression;
import com.xweb.sql.core.common.Item;
import lombok.Data;

@Data
public class IntervalExpression extends AbstractItem implements BooleanExpression {

    private Item left;

    private String operator;

    private String interval;

    private String stringIntervalField;

    private String sign;

    private String number;

    private String intervalField;

}
