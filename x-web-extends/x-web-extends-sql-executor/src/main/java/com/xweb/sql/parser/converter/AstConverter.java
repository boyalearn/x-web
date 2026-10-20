package com.xweb.sql.parser.converter;

import com.xweb.sql.meta.Item;

public interface AstConverter {

    Item convert(com.xweb.sql.core.common.Item item);
}
