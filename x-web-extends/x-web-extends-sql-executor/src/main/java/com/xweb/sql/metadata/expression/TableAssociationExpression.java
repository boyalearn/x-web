package com.xweb.sql.metadata.expression;

import com.xweb.sql.metadata.Column;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class TableAssociationExpression implements Expression{
    private Column left;

    private Column right;

    private String op;
}
