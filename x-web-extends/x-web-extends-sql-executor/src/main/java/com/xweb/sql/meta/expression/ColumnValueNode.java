package com.xweb.sql.meta.expression;

import com.xweb.sql.meta.Select;
import com.xweb.sql.meta.common.AbstractNode;
import com.xweb.sql.meta.common.BooleanNode;
import com.xweb.sql.meta.node.ColumnNode;
import com.xweb.sql.meta.node.ConstantNode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ColumnValueNode extends AbstractNode implements BooleanNode {
    private ColumnNode column;

    private String op;

    private ConstantNode constant;

    private BooleanNode expression;

    private Select select;

    public ColumnValueNode(ColumnNode column, String op, ConstantNode constant) {
        this.column = column;
        this.op = op;
        this.constant = constant;
    }


    public ColumnValueNode(ColumnNode column, String op, BooleanNode expression) {
        this.column = column;
        this.op = op;
        this.expression = expression;
    }


    public ColumnValueNode(ColumnNode column, String op, Select select) {
        this.column = column;
        this.op = op;
        this.select = select;
    }
}
