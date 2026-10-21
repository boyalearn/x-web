package com.xweb.sql.meta.select;


import com.xweb.sql.meta.Node;
import com.xweb.sql.meta.PageExpression;
import com.xweb.sql.meta.Select;
import com.xweb.sql.meta.common.AbstractNode;
import com.xweb.sql.meta.common.OrderNode;
import com.xweb.sql.meta.common.TableNode;
import com.xweb.sql.meta.expression.BooleanExpression;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SimpleSelect extends AbstractNode implements Select {

    private List<Node> selectItems;

    private List<TableNode> tableItems;

    private BooleanExpression whereExpression;

    private List<Node> groupItems;

    private List<OrderNode> orderItems;

    private BooleanExpression havingExpression;

    private PageExpression pageExpression;


}
