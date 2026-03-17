package com.xweb.sql.core.common.expression;

import com.xweb.sql.core.common.AbstractItem;
import com.xweb.sql.core.common.BooleanExpression;
import com.xweb.sql.core.common.Item;
import lombok.Data;

@Data
public class ExistExpression extends AbstractItem implements BooleanExpression {

    private Item left;

    private String not;

    private String exist;

    private Item expression;

}
