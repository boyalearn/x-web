package com.xweb.sql.operator;

import com.xweb.sql.data.Page;
import com.xweb.sql.data.Row;
import com.xweb.sql.meta.Item;
import com.xweb.sql.meta.item.AllColumnItem;
import com.xweb.sql.meta.item.Column;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class ProjectOperator extends AbstractOperator {

    private List<Item> items;

    private SqlOperator operator;

    @Override
    public void open() {

    }

    @Override
    public Page next() {
        Page result = new Page();
        Page next = operator.next();
        while (!next.isEmpty()) {

            result.addRows(filterItem(next.getRows()));
            next = operator.next();
        }
        return result;
    }

    private List<Row> filterItem(List<Row> rows) {
        if (this.items.size() == 1 && this.items.get(0) instanceof AllColumnItem) {
            return rows;
        }
        List<Row> result = new ArrayList<>();
        for (Row row : rows) {
            Row r = new Row();
            for (Item item : this.items) {
                if (item instanceof Column) {
                    Column column = (Column) item;
                    r.addSlice(row.getSliceByColumnName(column.getTable().getName(), column.getName()));
                }
            }
            result.add(r);
        }

        return result;
    }

    @Override
    public void close() {

    }
}
