package com.xweb.sql.core.common.update;

import com.xweb.sql.core.common.AbstractItem;
import com.xweb.sql.core.common.BooleanExpression;
import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.Update;
import lombok.Data;

import java.util.List;

@Data
public class SimpleUpdate extends AbstractItem implements Update {

    private String update;

    private String table;

    private String set;

    private List<Item> updateItems;

    private String where;

    private BooleanExpression whereExpression;
}
