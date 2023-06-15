package com.xweb.mybatis.sql;

import lombok.AllArgsConstructor;
import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.expression.operators.conditional.AndExpression;
import net.sf.jsqlparser.schema.Column;
import net.sf.jsqlparser.schema.Table;
import net.sf.jsqlparser.statement.select.PlainSelect;
import net.sf.jsqlparser.statement.select.SelectExpressionItem;
import net.sf.jsqlparser.statement.select.SelectItem;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class PlainSelectVisitor implements Visitor {

    private PlainSelect plainSelect;

    @Override
    public void addSelectItems(String tableName, String[] items) throws JSQLParserException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Table table = VisitorUtil.findExistTable(plainSelect, tableName);
        if (!Optional.ofNullable(table).isPresent()) {
            return;
        }
        List<SelectItem> selectItems = plainSelect.getSelectItems();
        if (selectItems.size() == 1 && selectItems.get(0).toString().equals("*")) {
            return;
        }
        List<SelectItem> otherAddItems = new ArrayList();
        for (String item : items) {
            otherAddItems.add(new SelectExpressionItem(new Column(table, item)));
        }
        selectItems.addAll(otherAddItems);
        plainSelect.setSelectItems(selectItems);
    }

    @Override
    public void addWhereAndCondition(String condition) throws JSQLParserException {
        Expression where = plainSelect.getWhere();
        AndExpression andExpression = new AndExpression();
        andExpression.setLeftExpression(where);
        Expression rightExpression = ExpressionUtil.createConditionExpression(plainSelect, condition);
        andExpression.setRightExpression(rightExpression);
        plainSelect.setWhere(andExpression);
    }

    @Override
    public void addJoinWhereCondition(String tableName, String onCondition, String whereCondition) {

    }
}
