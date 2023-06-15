package com.xweb.mybatis.sql.condition;

import com.xweb.mybatis.sql.VisitorUtil;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.schema.Column;
import net.sf.jsqlparser.schema.Table;
import net.sf.jsqlparser.statement.select.PlainSelect;

import java.util.Optional;

public class ColumnConditionVisitor implements ConditionVisitor {
    @Override
    public void modifyTable(Expression expression, PlainSelect plainSelect) {
        Column column = (Column) expression;
        Table table = column.getTable();
        String name = table.getName();
        Table selectFromTable = VisitorUtil.findExistTable(plainSelect, name);
        if (Optional.ofNullable(selectFromTable).isPresent()) {
            column.setTable(selectFromTable);
        }
    }
}
