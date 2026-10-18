package com.xweb.sql.planner;

import com.xweb.sql.meta.Select;
import com.xweb.sql.meta.SimpleSelect;
import com.xweb.sql.meta.expression.BooleanExpression;
import com.xweb.sql.meta.expression.TableAssociationExpression;
import com.xweb.sql.meta.item.SimpleTableItem;
import com.xweb.sql.meta.item.TableItem;
import com.xweb.sql.operator.*;
import com.xweb.sql.operator.exception.UnknownOperatorException;

import java.util.List;
import java.util.Optional;

public class LogicPlanner {

    private Select select;

    public LogicPlanner(Select select) {
        this.select = select;
    }

    public SqlOperator planQuery() {
        if (this.select instanceof SimpleSelect) {
            return planSimpleSelect((SimpleSelect) this.select);
        }
        throw new UnknownOperatorException("unknown implement operator!");
    }

    private SqlOperator planSimpleSelect(SimpleSelect simpleSelect) {
        SqlOperator operator = null;
        List<TableItem> tableItems = simpleSelect.getTableItems();
        if (!tableItems.isEmpty()) {
            TableItem firstTableItem = tableItems.get(0);
            operator = planTableItem(firstTableItem);
            for (int i = 1; i < tableItems.size(); i++) {
                TableItem tableItem = tableItems.get(i);
                SqlOperator current = planTableItem(tableItem);
                if (current instanceof TableScanOperator) {
                    List<TableAssociationExpression> tableAssociationExpressions =
                            TableAssociationAnalysis.analysis(
                                    new SimpleTableItem("", firstTableItem.getAlias()),
                                    new SimpleTableItem("", tableItem.getAlias()),
                                    simpleSelect.getWhereExpression());
                    operator = new JoinTableOperator(operator, current, JoinTableOperator.JoinType.INNER_JOIN, tableAssociationExpressions);
                } else if (current instanceof JoinTableOperator) {
                    JoinTableOperator joinTableOperator = (JoinTableOperator) current;
                    joinTableOperator.setLeftOperator(operator);
                    operator = joinTableOperator;
                }
                firstTableItem = tableItem;
            }
        }
        operator = new ProjectOperator(simpleSelect.getSelectItems(), operator);
        BooleanExpression whereExpression = simpleSelect.getWhereExpression();
        if (Optional.ofNullable(whereExpression).isPresent()) {
            return new FilterOperator(operator, whereExpression);
        }
        return operator;
    }

    private SqlOperator planTableItem(TableItem tableItem) {
        if (tableItem instanceof SimpleTableItem) {
            SimpleTableItem simpleTableItem = (SimpleTableItem) tableItem;
            LogicPlannerContext.setTableNameAlias(simpleTableItem.getAlias(), simpleTableItem.getName());
            return new TableScanOperator(simpleTableItem.getName(), simpleTableItem.getAlias());
        } else if (tableItem instanceof SimpleSelect) {
            return planSimpleSelect((SimpleSelect) tableItem);
        } else {
            throw new RuntimeException();
        }
    }


}
