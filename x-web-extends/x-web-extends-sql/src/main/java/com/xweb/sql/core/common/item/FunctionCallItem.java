package com.xweb.sql.core.common.item;

import com.xweb.sql.core.common.AbstractItem;
import com.xweb.sql.core.common.Item;
import lombok.Data;

import java.util.List;

@Data
public class FunctionCallItem extends AbstractItem {

    private String name;

    private String quantifier;

    private List<Item> params;
}
