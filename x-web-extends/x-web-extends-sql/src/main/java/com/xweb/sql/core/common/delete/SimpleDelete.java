package com.xweb.sql.core.common.delete;

import com.xweb.sql.core.common.AbstractItem;
import com.xweb.sql.core.common.BooleanExpression;
import com.xweb.sql.core.common.Delete;
import lombok.Data;


@Data
public class SimpleDelete extends AbstractItem implements Delete {

    private String delete;

    private String from;

    private String table;

    private String where;

    private BooleanExpression whereExpression;

}
