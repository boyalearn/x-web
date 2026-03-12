package com.xweb.sql.core.base.item;

import com.xweb.sql.core.base.Item;
import lombok.Data;

import java.util.List;

@Data
public class SubScriptItem implements Item {

    private Object value;

    private List<Object> indexes;

    private String as;

    private String aliasName;
}
