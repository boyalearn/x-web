package com.xweb.sql.parser.converter;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.meta.Node;

public interface AstConverter {

    Node convert(Item item);
}
