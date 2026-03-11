package com.xweb.sql.core;


import com.xweb.sql.core.base.BaseSelect;
import com.xweb.sql.core.base.item.SelectAllItem;
import com.xweb.sql.core.base.table.AliasComplexTableItem;
import com.xweb.sql.core.base.table.BaseTableItem;
import com.xweb.sql.core.base.GroupItem;
import com.xweb.sql.core.base.HavingItem;
import com.xweb.sql.core.base.Identifier;
import com.xweb.sql.core.base.Item;
import com.xweb.sql.core.base.OrderItem;
import com.xweb.sql.core.base.TableItem;
import com.xweb.sql.core.base.WhereItem;
import com.xweb.sql.core.base.express.ConditionAndResult;
import com.xweb.sql.core.base.express.SimpleExpression;
import com.xweb.sql.core.base.express.SuperSimpleExpression;
import com.xweb.sql.core.base.group.SimpleGroupItem;
import com.xweb.sql.core.base.item.CaseWhenItem;
import com.xweb.sql.core.base.item.FunctionItem;
import com.xweb.sql.core.base.item.TableColumn;
import com.xweb.sql.core.base.order.SimpleOrderItem;
import com.xweb.sql.core.base.table.JoinTableItem;

import java.util.List;

public final class ItemStringUtil {

    private final static String SPACE = " ";

    private final static String DOT = ".";

    private final static String COMMA = ",";

    public static String toString(Identifier identifier) {
        return identifier.getName();
    }

    public static String toString(BaseSelect baseSelect) {
        StringBuffer sql = new StringBuffer();
        sql.append("select");
        final List<Item> selectItems = baseSelect.getSelectItems();
        for (int i = 0; i < selectItems.size(); i++) {
            Item selectItem = selectItems.get(i);
            if (0 == i) {
                sql.append(" " + toString(selectItem));
            } else {
                sql.append("," + toString(selectItem));
            }
        }

        final List<TableItem> tableItems = baseSelect.getTableItems();
        if (!tableItems.isEmpty()) {
            sql.append(" from ");
            for (int i = 0; i < tableItems.size(); i++) {
                TableItem tableItem = tableItems.get(i);
                if (i != 0) {
                    sql.append("," + toString(tableItem));
                } else {
                    sql.append(toString(tableItem));
                }
            }
        }


        final List<WhereItem> whereItems = baseSelect.getWhereItems();
        if (!whereItems.isEmpty()) {
            sql.append(" where");
            for (WhereItem whereItem : whereItems) {
                sql.append(" " + toString(whereItem));
            }
        }
        final List<GroupItem> groupItems = baseSelect.getGroupItems();
        if (!groupItems.isEmpty()) {
            sql.append(" group by");
            for (int i = 0; i < groupItems.size(); i++) {
                GroupItem groupItem = groupItems.get(i);
                if (0 == i) {
                    sql.append(" " + toString(groupItem));
                } else {
                    sql.append("," + toString(groupItem));
                }
            }

        }

        final List<OrderItem> orderItems = baseSelect.getOrderItems();
        if (!orderItems.isEmpty()) {
            sql.append(" order by");
            for (int i = 0; i < orderItems.size(); i++) {
                OrderItem orderItem = orderItems.get(i);
                if (0 == i) {
                    sql.append(" " + toString(orderItem));
                } else {
                    sql.append("," + toString(orderItem));
                }
            }
        }
        final List<HavingItem> havingItems = baseSelect.getHavingItems();
        if (!havingItems.isEmpty()) {
            sql.append(" having");
            for (HavingItem whereItem : havingItems) {
                sql.append(" " + toString(whereItem));
            }
        }
        return sql.toString();
    }


    private static String toString(Object object) {
        if (object instanceof SuperSimpleExpression) {
            return toString((SuperSimpleExpression) object);
        } else if (object instanceof TableColumn) {
            return toString((TableColumn) object);
        } else if (object instanceof SimpleExpression) {
            return toString((SimpleExpression) object);
        } else if (object instanceof Identifier) {
            return toString((Identifier) object);
        } else if (object instanceof String) {
            return (String) object;
        } else if (object instanceof BaseTableItem) {
            return toString((BaseTableItem) object);
        } else if (object instanceof SimpleGroupItem) {
            return toString((SimpleGroupItem) object);
        } else if (object instanceof SimpleOrderItem) {
            return toString((SimpleOrderItem) object);
        } else if (object instanceof BaseSelect) {
            return toString((BaseSelect) object);
        } else if (object instanceof CaseWhenItem) {
            return toString((CaseWhenItem) object);
        } else if (object instanceof ConditionAndResult) {
            return toString((ConditionAndResult) object);
        } else if (object instanceof FunctionItem) {
            return toString((FunctionItem) object);
        } else if (object instanceof JoinTableItem) {
            return toString((JoinTableItem) object);
        } else if (object instanceof AliasComplexTableItem) {
            return toString((AliasComplexTableItem) object);
        } else if (object instanceof SelectAllItem) {
            return toString((SelectAllItem) object);
        }
        throw new RuntimeException("unknown exception class is " + object.getClass().getName());
    }

    private static String toString(SelectAllItem selectAllItem) {
        StringBuffer sql = new StringBuffer();
        if (!isEmpty(selectAllItem.getTableName())) {
            sql.append(selectAllItem.getTableName() + ".");
        }
        if (!isEmpty(selectAllItem.getColumnName())) {
            sql.append(selectAllItem.getColumnName());
        }
        if (!isEmpty(selectAllItem.getAs())) {
            sql.append(selectAllItem.getAs());
        }
        if (!isEmpty(selectAllItem.getAliasName())) {
            sql.append(selectAllItem.getAliasName());
        }
        return sql.toString();
    }

    private static String toString(AliasComplexTableItem aliasComplexTableItem) {
        StringBuffer sql = new StringBuffer();
        sql.append(toString(aliasComplexTableItem.getTable()));
        if (!isEmpty(aliasComplexTableItem.getAs())) {
            sql.append(" " + aliasComplexTableItem.getAs());
        }

        if (!isEmpty(aliasComplexTableItem.getAliasName())) {
            sql.append(" " + aliasComplexTableItem.getAliasName());
        }

        return sql.toString();
    }

    private static String toString(JoinTableItem joinTableItem) {
        StringBuffer sql = new StringBuffer();
        sql.append(toString(joinTableItem.getLeft()));
        sql.append(" " + joinTableItem.getJoinType() + " join ");
        sql.append(" " + toString(joinTableItem.getRight()));
        sql.append(" on " + toString(joinTableItem.getOnConditions()));

        return sql.toString();
    }

    private static String toString(FunctionItem functionItem) {
        StringBuffer sql = new StringBuffer();
        sql.append(functionItem.getName());
        sql.append("(");
        final List<Object> params = functionItem.getParams();
        for (int i = 0; i < params.size(); i++) {
            Object param = params.get(i);
            if (0 == i) {
                sql.append("" + toString(param));
            } else {
                sql.append("," + toString(param));
            }
        }
        sql.append(")");
        if (!isEmpty(functionItem.getAs())) {
            sql.append(" " + functionItem.getAs());
        }
        if (!isEmpty(functionItem.getAliasName())) {
            sql.append(" " + functionItem.getAliasName());
        }
        return sql.toString();
    }

    private static String toString(ConditionAndResult conditionAndResult) {
        StringBuffer sql = new StringBuffer();
        sql.append("when");
        sql.append(" " + toString(conditionAndResult.getCondition()));
        sql.append(" then " + toString(conditionAndResult.getResult()));
        return sql.toString();
    }

    private static String toString(CaseWhenItem caseWhenItem) {
        StringBuffer sql = new StringBuffer();
        sql.append(" case");
        final List<ConditionAndResult> conditionResults = caseWhenItem.getConditionResults();
        for (ConditionAndResult conditionResult : conditionResults) {
            sql.append(" " + toString(conditionResult));
        }
        if (null != caseWhenItem.getElseResult()) {
            sql.append("else " + caseWhenItem.getElseResult() + " end");
        }
        if (!isEmpty(caseWhenItem.getAs())) {
            sql.append(" " + caseWhenItem.getAs());
        }
        if (!isEmpty(caseWhenItem.getAliasName())) {
            sql.append(" " + caseWhenItem.getAliasName());
        }
        return sql.toString();
    }

    private static String toString(SimpleOrderItem simpleOrderItem) {
        StringBuffer sql = new StringBuffer();
        sql.append(simpleOrderItem.getColumnName());
        return sql.toString();
    }

    private static String toString(SuperSimpleExpression simpleExpression) {
        StringBuffer sql = new StringBuffer();
        sql.append("(");
        sql.append(toString(simpleExpression.getItem()));
        sql.append(")");
        if (!isEmpty(simpleExpression.getAs())) {
            sql.append(" " + simpleExpression.getAs());
        }
        if (!isEmpty(simpleExpression.getAliasName())) {
            sql.append(" " + simpleExpression.getAliasName());
        }
        return sql.toString();
    }

    private static String toString(SimpleExpression simpleExpression) {
        StringBuffer sql = new StringBuffer();
        sql.append(toString(simpleExpression.getLeft()));
        if (!isEmpty(simpleExpression.getOp())) {
            sql.append(" " + simpleExpression.getOp());
        }
        if (null != simpleExpression.getRight()) {
            sql.append(" " + toString(simpleExpression.getRight()));
        }
        return sql.toString();
    }

    private static String toString(TableColumn tableColumn) {
        StringBuffer sql = new StringBuffer();
        if (!isEmpty(tableColumn.getTableName())) {
            sql.append(tableColumn.getTableName() + ".");
        }
        if (!isEmpty(tableColumn.getColumnName())) {
            sql.append(tableColumn.getColumnName());
        }
        if (!isEmpty(tableColumn.getAs())) {
            sql.append(" " + tableColumn.getAs());
        }
        if (!isEmpty(tableColumn.getAliasName())) {
            sql.append(" " + tableColumn.getAliasName());
        }
        return sql.toString();
    }


    private static String toString(SimpleGroupItem simpleGroupItem) {
        StringBuffer sql = new StringBuffer();
        if (!isEmpty(simpleGroupItem.getTableName())) {
            sql.append(simpleGroupItem.getTableName() + ".");
        }

        if (!isEmpty(simpleGroupItem.getColumnName())) {
            sql.append(simpleGroupItem.getColumnName());
        }
        return sql.toString();
    }

    public static String toString(BaseTableItem tableItem) {
        StringBuffer sql = new StringBuffer();
        sql.append(tableItem.getTableName());
        return sql.toString();
    }

    public static boolean isEmpty(String str) {
        return str == null || str.trim() == "";
    }

    public static String replaceAllEmpty(String str) {
        String result = str.replaceAll("\\s+", "");
        return result;
    }
}
