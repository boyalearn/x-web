package com.xweb.sql.core.common.item;

import com.xweb.sql.core.common.BooleanExpression;
import com.xweb.sql.core.common.Item;
import lombok.Data;

/**
 * 单个字段也可以放在where后面作为booleanExpression
 */
@Data
public class TableColumnItem implements Item, BooleanExpression {

    private String tableName;

    private String columnName;

    private String alias;

    private String as;

}
