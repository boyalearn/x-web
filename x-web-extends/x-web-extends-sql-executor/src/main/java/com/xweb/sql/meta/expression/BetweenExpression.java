package com.xweb.sql.meta.expression;

import com.xweb.sql.meta.Expression;
import com.xweb.sql.meta.Node;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BetweenExpression implements Expression {

    private Node lower;

    private String lowerOp;

    private Node upper;

    private String upperOp;
}
