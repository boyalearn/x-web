package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.ast.AstUtil;
import com.xweb.sql.core.common.insert.AsQueryInsert;

public class AsQueryInsertVisitor implements AstVisitor{

    private AbstractInsertVisitor abstractInsertVisitor=new AbstractInsertVisitor();

    @Override
    public String visitor(Item item) {
        AsQueryInsert asQueryInsert = (AsQueryInsert) item;
            StringBuffer sql = new StringBuffer();
            sql.append(abstractInsertVisitor.visitor(asQueryInsert));
            sql.append(AstUtil.SPACE);
            sql.append(AstUtil.toSql(asQueryInsert.getQuery()));
            return sql.toString();
    }
}
