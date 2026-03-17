package com.xweb.sql.core.common.select;


import com.xweb.sql.core.common.AbstractItem;
import com.xweb.sql.core.common.BooleanExpression;
import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.Page;
import com.xweb.sql.core.common.Select;
import com.xweb.sql.core.common.Table;
import com.xweb.sql.core.common.order.OrderItem;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Select可以是一个子查询。所以子查询可以在Item中
 * Select也可以是一个表。所以也可以是Table
 * 所以这里需要实现Table和Item
 */
@Data
public class BaseSelect extends AbstractItem implements Table, Select {

    private String select;

    private List<Item> selectItems = new ArrayList<>();

    private String from;

    private List<Table> tableItems = new ArrayList<>();

    private String where;

    private BooleanExpression whereExpression;

    private String group;

    private List<Item> groupItems = new ArrayList<>();

    private String order;

    private List<OrderItem> orderItems = new ArrayList<>();

    private String having;

    private BooleanExpression havingExpression;

    private Page page;

}
