package com.xweb.sql.planner.operator;

import com.xweb.sql.data.Page;
import com.xweb.sql.data.Row;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class LimitOperator extends AbstractOperator {

    private SqlOperator operator;

    /**
     * 条数
     */
    private Long limit;

    /**
     * 偏移
     */
    private Long offset;

    @Override
    public void open() {

    }

    @Override
    public Page next() {
        Page result = new Page();
        long index = 0;
        Page next = operator.next();
        while (index < limit + offset && !next.isEmpty()) {
            final List<Row> rows = next.getRows();
            for (Row row : rows) {
                if (index >= offset) {
                    result.addRow(row);
                }
                index++;
            }
            next = operator.next();
        }
        return result;
    }

    @Override
    public void close() {

    }
}
