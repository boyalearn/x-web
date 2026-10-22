package com.xweb.sql.meta.select;


import com.xweb.sql.meta.Node;
import com.xweb.sql.meta.Page;
import com.xweb.sql.meta.Select;
import com.xweb.sql.meta.common.AbstractNode;
import com.xweb.sql.meta.common.BooleanNode;
import com.xweb.sql.meta.common.OrderNode;
import com.xweb.sql.meta.common.TableNode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SimpleSelect extends AbstractNode implements Select {

    private List<Node> itemNodes;

    private List<TableNode> tableNodes;

    private BooleanNode whereNode;

    private List<Node> groupItems;

    private List<OrderNode> orderNodes;

    private BooleanNode havingNode;

    private Page pageNode;


}
