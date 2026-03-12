package com.xweb.sql.core.base.item;

import com.xweb.sql.core.base.Item;
import lombok.Data;

@Data
public class ConstantItem implements Item {

    private String constant;

    private String as;

    private String aliasName;
}
