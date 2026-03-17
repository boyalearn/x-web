package com.xweb.sql.core.common.expression;

import lombok.Data;

@Data
public class CommonConditionExpression extends LeftAndRightExpression {

    private String op;

    private String as;

    private String alias;
}
