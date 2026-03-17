package com.xweb.sql.core.common.item;

import com.xweb.sql.core.common.AbstractItem;
import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.Page;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class LimitPageItem extends AbstractItem implements Page {

    private String limit;

    private List<Item> limitItems = new ArrayList<>();
}
