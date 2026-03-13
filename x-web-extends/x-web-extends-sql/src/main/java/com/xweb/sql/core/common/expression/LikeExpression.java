package com.xweb.sql.core.common.expression;

import com.xweb.sql.core.common.AbstractItem;
import com.xweb.sql.core.common.BooleanExpression;
import lombok.Data;

@Data
public class LikeExpression extends AbstractItem implements BooleanExpression {

    private Object left;

    private String not;

    private String like;

    private Object pattern;

}
