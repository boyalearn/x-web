package com.xweb.sql.core.common.insert;

import com.xweb.sql.core.common.AbstractItem;
import com.xweb.sql.core.common.Insert;
import com.xweb.sql.core.common.Item;
import lombok.Data;

import java.util.List;


@Data
public class AbstractInsert extends AbstractItem implements Insert {

    private String insert;

    private String into;

    private String table;

    private List<Item> columns;
}
