package com.xweb.sql.operator;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public abstract class AbstractOperator implements SqlOperator{

    private List<SqlOperator> subOperators;
}
