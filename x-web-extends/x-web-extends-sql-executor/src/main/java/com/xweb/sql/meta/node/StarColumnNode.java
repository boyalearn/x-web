package com.xweb.sql.meta.node;

import com.xweb.sql.meta.common.AbstractNode;
import com.xweb.sql.meta.table.SimpleTableNode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class StarColumnNode extends AbstractNode {
    private SimpleTableNode table;
}