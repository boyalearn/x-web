package com.xweb.mybatis.sql.condition;

import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.statement.select.PlainSelect;

public interface ConditionVisitor {

    void modifyTable(Expression expression, PlainSelect plainSelect);
}
