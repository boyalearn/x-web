package com.xweb.sql.meta.expression;

import com.xweb.sql.meta.common.BooleanNode;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class NotBooleanNode implements BooleanNode {
    private BooleanNode booleanNode;
}
