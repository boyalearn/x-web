package com.xweb.sql.core.base;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class BaseSelect implements Item {

    private List<Item> selectItems = new ArrayList<>();

    private List<TableItem> tableItems = new ArrayList<>();

    private List<WhereItem> whereItems = new ArrayList<>();

    private List<GroupItem> groupItems = new ArrayList<>();

    private List<OrderItem> orderItems = new ArrayList<>();

    private List<HavingItem> havingItems = new ArrayList<>();


}
