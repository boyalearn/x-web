package com.xweb.sql.meta;


import com.xweb.sql.meta.expression.BooleanExpression;
import com.xweb.sql.meta.item.AbstractItem;
import com.xweb.sql.meta.item.TableItem;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SimpleSelect extends AbstractItem implements Select {

    private List<Item> selectItems;

    private List<TableItem> tableItems;

    private BooleanExpression whereExpression;

    private List<Item> groupItems;

    private List<Item> orderItems;

    private BooleanExpression havingExpression;

    private PageExpression pageExpression;


}
