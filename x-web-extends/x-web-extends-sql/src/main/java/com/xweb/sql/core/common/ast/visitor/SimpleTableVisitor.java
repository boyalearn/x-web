package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.ast.AstUtil;
import com.xweb.sql.core.common.table.SimpleTable;

public class SimpleTableVisitor implements AstVisitor {
    @Override
    public String visitor(Item item) {
        SimpleTable simpleTable = (SimpleTable) item;
        StringBuffer stringBuffer = new StringBuffer();
        if (AstUtil.isNotEmpty(simpleTable.getDatabase())) {
            stringBuffer.append(simpleTable.getDatabase() + AstUtil.DOT);
        }
        stringBuffer.append(simpleTable.getTableName());
        stringBuffer.append(AstUtil.toStringCommon(simpleTable));
        return stringBuffer.toString();
    }
}
