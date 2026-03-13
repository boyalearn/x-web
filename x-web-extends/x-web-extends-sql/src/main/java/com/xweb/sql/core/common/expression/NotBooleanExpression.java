package com.xweb.sql.core.common.expression;

import com.xweb.sql.core.common.BooleanExpression;
import lombok.Data;

@Data
public class NotBooleanExpression implements BooleanExpression {

    private String not;

    private BooleanExpression expression;

    private String as;

    private String alias;
}
