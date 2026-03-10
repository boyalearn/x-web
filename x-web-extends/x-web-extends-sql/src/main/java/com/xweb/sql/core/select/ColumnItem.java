package com.xweb.sql.core.select;


import lombok.Data;

@Data
public class ColumnItem implements SelectItem {

    private String name;


    public ColumnItem(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

}
