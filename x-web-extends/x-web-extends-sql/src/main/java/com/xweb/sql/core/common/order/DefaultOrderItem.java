package com.xweb.sql.core.common.order;

import com.xweb.sql.core.common.Item;
import lombok.Data;

@Data
public class DefaultOrderItem implements OrderItem {

    private Item item;

    private String order;
}
