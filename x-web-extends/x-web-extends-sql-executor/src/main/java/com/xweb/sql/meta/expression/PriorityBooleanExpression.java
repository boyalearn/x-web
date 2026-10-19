package com.xweb.sql.meta.expression;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PriorityBooleanExpression implements BooleanExpression{

    private BooleanExpression expression;
}
