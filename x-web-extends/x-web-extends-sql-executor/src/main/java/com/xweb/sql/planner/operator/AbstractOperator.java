package com.xweb.sql.planner.operator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractOperator implements SqlOperator {
    private String alias;
}
