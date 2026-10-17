package com.xweb.sql.data;

import com.xweb.sql.metadata.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DefaultSlice implements Slice{

    private Column column;

    private String type;

    private Object data;


    @Override
    public Column getColumn() {
        return this.column;
    }
}
