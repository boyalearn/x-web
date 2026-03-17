package com.xweb.sql.core.convert;

import com.xweb.sql.core.common.Item;

public interface Filter {
    boolean support(Item item);

    Item change(Item item);


}
