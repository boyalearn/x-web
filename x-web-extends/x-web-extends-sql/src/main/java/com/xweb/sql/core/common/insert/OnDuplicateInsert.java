package com.xweb.sql.core.common.insert;

import com.xweb.sql.core.common.AbstractItem;
import com.xweb.sql.core.common.Insert;
import com.xweb.sql.core.common.Item;
import lombok.Data;

import java.util.List;

@Data
public class OnDuplicateInsert extends AbstractItem implements Insert {

    private SimpleInsert insert;

    private String on;

    private String duplicate;

    private String key;

    private String update;

    private List<Item> updateColumns;
}
