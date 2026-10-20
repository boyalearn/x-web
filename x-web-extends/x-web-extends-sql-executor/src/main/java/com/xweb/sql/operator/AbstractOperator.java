package com.xweb.sql.operator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractOperator implements SqlOperator {
    private String alias;
}
