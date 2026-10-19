package com.xweb.sql.core.common.item;

import com.xweb.sql.core.common.Item;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class ListItem<I> extends ArrayList implements Item {

    private String as;

    private String alias;

}
