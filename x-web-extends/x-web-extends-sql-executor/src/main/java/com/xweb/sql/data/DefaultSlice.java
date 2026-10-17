package com.xweb.sql.data;

import com.xweb.sql.metadata.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DefaultSlice implements Slice{

    private Table table;

    private String columnName;

    private String type;

    private Object data;


    @Override
    public Table getTable() {
        return this.table;
    }

    @Override
    public String getColumn() {
        return this.getColumnName();
    }
}
