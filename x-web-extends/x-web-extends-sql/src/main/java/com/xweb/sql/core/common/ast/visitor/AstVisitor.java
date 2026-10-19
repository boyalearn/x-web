package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.Item;

public interface AstVisitor {
    String visitor(Item item);
}
