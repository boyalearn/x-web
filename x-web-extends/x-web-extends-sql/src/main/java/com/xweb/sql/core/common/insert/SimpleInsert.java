package com.xweb.sql.core.common.insert;

import com.xweb.sql.core.common.Insert;
import com.xweb.sql.core.common.Item;
import lombok.Data;

import java.util.List;

@Data
public class SimpleInsert implements Insert {

    private String insert;

    private String into;

    private String table;

    private List<Item> columns;

    private String values;

    private List<Item> valueItems;
}
