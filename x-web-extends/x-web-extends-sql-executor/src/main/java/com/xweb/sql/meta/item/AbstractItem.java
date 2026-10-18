package com.xweb.sql.meta.item;

import com.xweb.sql.meta.Item;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractItem implements Item {

    private String alias;
}
