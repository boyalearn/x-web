package com.xweb.sql.meta.table;

import com.xweb.sql.meta.common.AbstractNode;
import com.xweb.sql.meta.common.TableNode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SimpleTableNode extends AbstractNode implements TableNode {

    private String name;

    public SimpleTableNode(String name) {
        this.name = name;
    }

    public SimpleTableNode(String name, String alias) {
        this.name = name;
        super.setAlias(alias);
    }
}
