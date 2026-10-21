package com.xweb.sql.meta.expression;

import com.xweb.sql.meta.node.ColumnNode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TableAssociationExpression implements BooleanExpression{
    private ColumnNode left;

    private String op;

    private ColumnNode right;
}
