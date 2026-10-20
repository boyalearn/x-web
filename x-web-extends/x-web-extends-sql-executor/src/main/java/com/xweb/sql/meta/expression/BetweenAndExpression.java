package com.xweb.sql.meta.expression;

import com.xweb.sql.meta.Expression;
import com.xweb.sql.meta.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BetweenAndExpression implements Expression {

    private Item lower;

    private String lowerOp;

    private Item upper;

    private String upperOp;
}
