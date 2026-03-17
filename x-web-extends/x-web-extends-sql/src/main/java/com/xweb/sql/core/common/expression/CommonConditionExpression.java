package com.xweb.sql.core.common.expression;

import com.xweb.sql.core.common.BooleanExpression;
import com.xweb.sql.core.common.Item;
import lombok.Data;

@Data
public class CommonConditionExpression implements BooleanExpression {

    private Item left;

    private String op;

    private Item right;

    private String as;

    private String alias;
}
