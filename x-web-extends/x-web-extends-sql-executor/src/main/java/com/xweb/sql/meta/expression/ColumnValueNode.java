package com.xweb.sql.meta.expression;

import com.xweb.sql.meta.Node;
import com.xweb.sql.meta.common.AbstractNode;
import com.xweb.sql.meta.common.BooleanNode;
import com.xweb.sql.meta.node.ColumnNode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ColumnValueNode extends AbstractNode implements BooleanNode {
    private ColumnNode column;

    private String op;

    /**
     * Constant || Select || BooleanNode
     */
    private Node value;

    public ColumnValueNode(ColumnNode column, String op, Node Node) {
        this.column = column;
        this.op = op;
        this.value = Node;
    }
}
