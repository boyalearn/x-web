package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.ast.AstUtil;
import com.xweb.sql.core.common.insert.AbstractInsert;
import com.xweb.sql.core.common.insert.AsQueryInsert;

public class AsQueryInsertVisitor implements AstVisitor{
    @Override
    public String visitor(Item item) {
        AsQueryInsert asQueryInsert = (AsQueryInsert) item;
            StringBuffer sql = new StringBuffer();
            sql.append(AstUtil.toSql((AbstractInsert) asQueryInsert));
            sql.append(AstUtil.SPACE);
            sql.append(AstUtil.toSql(asQueryInsert.getQuery()));
            return sql.toString();
    }
}
