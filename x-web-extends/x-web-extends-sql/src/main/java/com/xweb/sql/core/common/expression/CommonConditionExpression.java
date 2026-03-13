package com.xweb.sql.core.common.expression;

import com.xweb.sql.core.common.BooleanExpression;
import lombok.Data;

@Data
public class CommonConditionExpression implements BooleanExpression {

    private Object left;

    private String op;

    private Object right;

    private String as;

    private String alias;
}
