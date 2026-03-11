package com.xweb.sql.core.base.express;

import com.xweb.sql.core.base.Item;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 带括号的表达式
 */
@Data
@AllArgsConstructor
public class SuperSimpleExpression implements Item {

    private Object item;

    private String as;

    private String aliasName;

    public SuperSimpleExpression(Object item) {
        this.item = item;
    }
}
