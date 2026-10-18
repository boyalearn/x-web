package com.xweb.sql.meta.expression;

import com.xweb.sql.meta.Expression;
import com.xweb.sql.meta.Select;
import com.xweb.sql.meta.item.Column;
import com.xweb.sql.meta.item.Constant;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ColumnValueExpression implements BooleanExpression {
    private Column column;

    private String op;

    private Constant constant;

    private Expression expression;

    private Select select;

    public ColumnValueExpression(Column column,String op, Constant constant) {
        this.column = column;
        this.op = op;
        this.constant = constant;
    }


    public ColumnValueExpression(Column column,String op, Expression expression) {
        this.column = column;
        this.op = op;
        this.expression = expression;
    }


    public ColumnValueExpression(Column column,String op, Select select) {
        this.column = column;
        this.op = op;
        this.select = select;
    }
}
