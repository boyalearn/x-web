package com.xweb.sql.meta.node;

import com.xweb.sql.meta.common.AbstractNode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ConstantNode extends AbstractNode {
    private Object data;
}
