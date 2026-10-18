package com.xweb.sql.meta.expression;

import com.xweb.sql.meta.item.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TableAssociationExpression implements BooleanExpression{
    private Column left;

    private String op;

    private Column right;
}
