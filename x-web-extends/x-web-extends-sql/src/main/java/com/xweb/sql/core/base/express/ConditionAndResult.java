package com.xweb.sql.core.base.express;

import lombok.Data;

@Data
public class ConditionAndResult {

    private SimpleExpression condition;

    private Object result;
}
