package com.xweb.sql.core.base.table;

import com.xweb.sql.core.base.TableItem;
import lombok.Data;

@Data
public class AliasComplexTableItem  implements TableItem {

    private Object table;

    private String as;

    private String aliasName;
}
