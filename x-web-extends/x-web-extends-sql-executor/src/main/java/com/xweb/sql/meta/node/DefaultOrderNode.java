package com.xweb.sql.meta.node;

import com.xweb.sql.meta.Node;
import com.xweb.sql.meta.common.OrderNode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DefaultOrderNode implements OrderNode {

    private Node node;

    private String order;
}
