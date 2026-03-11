package com.xweb.sql.core.base.item;

import com.xweb.sql.core.base.Item;
import lombok.Data;

import java.util.List;


@Data
public class FunctionItem implements Item {

    private String name;

    private String quantifier;

    private List<Object> params;

    private String as;

    private String aliasName;
}
