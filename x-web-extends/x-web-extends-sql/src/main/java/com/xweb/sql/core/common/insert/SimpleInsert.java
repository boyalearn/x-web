package com.xweb.sql.core.common.insert;

import com.xweb.sql.core.common.Item;
import lombok.Data;

import java.util.List;

@Data
public class SimpleInsert extends AbstractInsert {

    private String values;

    private List<Item> valueItems;
}
