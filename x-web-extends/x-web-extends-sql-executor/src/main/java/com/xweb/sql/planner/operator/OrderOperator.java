package com.xweb.sql.planner.operator;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.order.DefaultOrderItem;
import com.xweb.sql.data.Page;
import com.xweb.sql.data.Row;
import com.xweb.sql.data.Slice;
import com.xweb.sql.meta.Node;
import com.xweb.sql.meta.common.OrderNode;
import com.xweb.sql.meta.node.ColumnNode;
import com.xweb.sql.meta.node.DefaultOrderNode;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class OrderOperator implements SqlOperator {

    private SqlOperator operator;

    private List<OrderNode> orderItems;

    @Override
    public void open() {
        this.operator.open();
    }

    @Override
    public Page next() {
        Page result = new Page();
        Page next = operator.next();
        while (!next.isEmpty()) {
            result.addRows(next.getRows());
            next = operator.next();
        }
        compare(result);
        return result;
    }

    @Override
    public void close() {

    }


    private void compare(Page page) {
        page.getRows().sort((row1, row2) -> {
            for (OrderNode orderItem : orderItems) {
                DefaultOrderNode orderNode = (DefaultOrderNode) orderItem;
                ColumnNode node = (ColumnNode) orderNode.getNode();
                Slice slice1 = row1.getSliceByColumnName(node.getTable().getName(), node.getName());
                Slice slice2 = row2.getSliceByColumnName(node.getTable().getName(), node.getName());
                int c = compareSlice(slice1, slice2);
                if (Optional.ofNullable(orderNode.getOrder()).isPresent() && orderNode.getOrder().equals("desc")) {
                    c = -c;
                }
                if (c != 0) {
                    return c;
                }

            }
            return 0;
        });
    }

    private int compareSlice(Slice slice1, Slice slice2) {
        Object data1 = slice1.getData();
        Object data2 = slice2.getData();
        if (data1 instanceof Number) {
            return new BigDecimal(data1.toString()).compareTo(new BigDecimal(data2.toString()));
        } else if (data1 instanceof String) {
            return new BigDecimal(data1.toString()).compareTo(new BigDecimal(data2.toString()));
        } else {
            throw new RuntimeException();
        }
    }
}
