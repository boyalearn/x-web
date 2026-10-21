package com.xweb.sql.meta.expression;

import com.xweb.sql.meta.Expression;
import com.xweb.sql.meta.Select;
import com.xweb.sql.meta.common.AbstractNode;
import com.xweb.sql.meta.node.ColumnNode;
import com.xweb.sql.meta.node.ConstantNode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ColumnValueExpression extends AbstractNode implements BooleanExpression {
    private ColumnNode column;

    private String op;

    private ConstantNode constant;

    private Expression expression;

    private Select select;

    public ColumnValueExpression(ColumnNode column, String op, ConstantNode constant) {
        this.column = column;
        this.op = op;
        this.constant = constant;
    }


    public ColumnValueExpression(ColumnNode column, String op, Expression expression) {
        this.column = column;
        this.op = op;
        this.expression = expression;
    }


    public ColumnValueExpression(ColumnNode column, String op, Select select) {
        this.column = column;
        this.op = op;
        this.select = select;
    }
}
