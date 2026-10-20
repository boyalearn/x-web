package com.xweb.sql.parser.converter.util;

import com.xweb.sql.core.common.select.BaseSelect;
import com.xweb.sql.meta.Item;
import com.xweb.sql.parser.converter.AstConverter;
import com.xweb.sql.parser.converter.BaseSelectAstConverter;

import java.util.HashMap;
import java.util.Map;

public class AstConverterUtil {

    private static final Map<Class<?>, AstConverter> CONVERTER = new HashMap<>();

    static {
        CONVERTER.put(BaseSelect.class, new BaseSelectAstConverter());
    }

    public static Item convert(com.xweb.sql.core.common.Item item) {
        AstConverter astConverter = CONVERTER.get(item.getClass());
        if (null == astConverter) {
            throw new RuntimeException();
        }
        return astConverter.convert(item);
    }
}
