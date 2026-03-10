package com.xweb.sql.core.base.order;

import com.xweb.sql.core.base.OrderItem;
import lombok.Data;

@Data
public class SimpleOrderItem implements OrderItem {

    private String columnName;
}
