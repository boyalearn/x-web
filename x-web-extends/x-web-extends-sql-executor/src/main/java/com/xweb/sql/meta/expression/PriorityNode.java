package com.xweb.sql.meta.expression;

import com.xweb.sql.meta.Node;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PriorityNode implements Node {

    private Node node;
}
