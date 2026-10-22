package com.xweb.sql.core.common.order;

import com.xweb.sql.core.common.AbstractItem;
import com.xweb.sql.core.common.Item;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DefaultOrderItem extends AbstractItem implements OrderItem {

    private Item item;

    private String order;
}
