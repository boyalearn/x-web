package com.xweb.sql.core.common.table;

import com.xweb.sql.core.common.AbstractItem;
import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.Table;
import lombok.Data;

import java.util.List;

@Data
public class UnionTableTable extends AbstractItem implements Table {

    private Table left;

    private List<UnionTableItem> unionTableItems;

    @Data
    public static class UnionTableItem extends AbstractItem {
        private String union;

        private String all;

        private Table right;
    }
}
