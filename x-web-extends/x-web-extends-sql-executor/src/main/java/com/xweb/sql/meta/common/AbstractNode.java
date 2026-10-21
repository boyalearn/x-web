package com.xweb.sql.meta.common;

import com.xweb.sql.meta.Node;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AbstractNode implements Node {
    private String alias;
}
