package com.xweb.sql.core.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractItem implements Item {

    private String as;

    private String alias;
}
