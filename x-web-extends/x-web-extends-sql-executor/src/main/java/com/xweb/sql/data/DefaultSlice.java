package com.xweb.sql.data;

import com.xweb.sql.meta.node.ColumnNode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DefaultSlice implements Slice{

    private ColumnNode column;

    private String type;

    private Object data;


    @Override
    public ColumnNode getColumn() {
        return this.column;
    }
}
