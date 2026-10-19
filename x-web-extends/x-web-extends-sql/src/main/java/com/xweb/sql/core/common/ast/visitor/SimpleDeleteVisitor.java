package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.ast.AstUtil;
import com.xweb.sql.core.common.delete.SimpleDelete;

import java.util.Optional;

public class SimpleDeleteVisitor implements AstVisitor{
    @Override
    public String visitor(Item item) {
        SimpleDelete simpleDelete =(SimpleDelete)item;
        StringBuffer sql = new StringBuffer();
        sql.append(simpleDelete.getDelete());
        sql.append(AstUtil.SPACE);
        sql.append(simpleDelete.getFrom());
        sql.append(AstUtil.SPACE);
        sql.append(simpleDelete.getTable());
        if (AstUtil.isNotEmpty(simpleDelete.getWhere())) {
            sql.append(AstUtil.SPACE);
            sql.append(simpleDelete.getWhere());
        }
        if (Optional.ofNullable(simpleDelete.getWhere()).isPresent()) {
            sql.append(AstUtil.SPACE);
            sql.append(AstUtil.toSql(simpleDelete.getWhereExpression()));
        }
        return sql.toString();
    }
}
