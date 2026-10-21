package com.xweb.sql.meta.node;

import com.xweb.sql.meta.common.AbstractNode;
import com.xweb.sql.meta.table.SimpleTableNode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ColumnNode extends AbstractNode {
    private SimpleTableNode table;
    private String name;
}
