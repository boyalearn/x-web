package com.xweb.sql.meta.expression;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * && ||
 */
@Getter
@Setter
@AllArgsConstructor
public class ComplexBoolExpression implements BooleanExpression{
    private BooleanExpression left;

    private String logic;

    private BooleanExpression right;
}
