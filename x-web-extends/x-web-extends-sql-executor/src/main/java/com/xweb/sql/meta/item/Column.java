package com.xweb.sql.meta.item;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Column extends AbstractItem {
    private SimpleTableItem table;
    private String name;
}
