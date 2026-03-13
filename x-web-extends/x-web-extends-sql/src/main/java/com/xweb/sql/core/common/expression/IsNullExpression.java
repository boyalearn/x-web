package com.xweb.sql.core.common.expression;

import com.xweb.sql.core.common.AbstractItem;
import com.xweb.sql.core.common.BooleanExpression;
import lombok.Data;

@Data
public class IsNullExpression extends AbstractItem implements BooleanExpression {

    private Object left;

    private String is;

    private String not;

    private String nullName;
}
