package com.xweb.sql.meta.expression;

import com.xweb.sql.meta.common.BooleanNode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * && ||
 */
@Getter
@Setter
@AllArgsConstructor
public class ComplexBoolNode implements BooleanNode {
    private BooleanNode left;

    private String logic;

    private BooleanNode right;
}
