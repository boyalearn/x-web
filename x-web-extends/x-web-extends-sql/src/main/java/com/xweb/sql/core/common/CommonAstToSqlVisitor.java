package com.xweb.sql.core.common;


import com.xweb.sql.core.common.expression.ArithmeticExpression;
import com.xweb.sql.core.common.expression.BetweenAndExpression;
import com.xweb.sql.core.common.expression.CommonConditionExpression;
import com.xweb.sql.core.common.expression.ConcatenationExpression;
import com.xweb.sql.core.common.expression.InExpression;
import com.xweb.sql.core.common.expression.IsNullExpression;
import com.xweb.sql.core.common.expression.PriorityExpression;
import com.xweb.sql.core.common.insert.OnDuplicateInsert;
import com.xweb.sql.core.common.insert.SimpleInsert;
import com.xweb.sql.core.common.item.CaseItem;
import com.xweb.sql.core.common.item.ConstantItem;
import com.xweb.sql.core.common.item.FunctionCallItem;
import com.xweb.sql.core.common.item.SelectAllItem;
import com.xweb.sql.core.common.item.SubIndexItem;
import com.xweb.sql.core.common.item.TableColumnItem;
import com.xweb.sql.core.common.item.UnionSelectItem;
import com.xweb.sql.core.common.item.WhenThenItem;
import com.xweb.sql.core.common.order.DefaultOrderItem;
import com.xweb.sql.core.common.order.OrderItem;
import com.xweb.sql.core.common.select.BaseSelect;
import com.xweb.sql.core.common.select.UnionSelect;
import com.xweb.sql.core.common.table.SimpleTable;
import com.xweb.sql.core.common.table.UnionTableTable;

import java.util.List;
import java.util.Optional;

public class CommonAstToSqlVisitor {

    private final static String SPACE = " ";

    private final static String DOT = ".";

    private final static String LEFT_BRACKET = "(";

    private final static String RIGHT_BRACKET = ")";

    private final static String LEFT_SQUARE_BRACKET = "[";

    private final static String RIGHT_SQUARE_BRACKET = "]";


    private final static String COMMA = ",";

    public String visit(BaseSelect select) {
        StringBuffer sql = new StringBuffer();
        sql.append(select.getSelect());
        final List<Item> selectItems = select.getSelectItems();
        for (int i = 0; i < selectItems.size(); i++) {
            Item selectItem = selectItems.get(i);
            if (0 == i) {
                sql.append(SPACE + visit(selectItem));
            } else {
                sql.append(COMMA + visit(selectItem));
            }
        }

        final List<Table> tableItems = select.getTableItems();
        if (!tableItems.isEmpty()) {
            sql.append(SPACE);
            sql.append(select.getFrom());
            for (int i = 0; i < tableItems.size(); i++) {
                Table tableItem = tableItems.get(i);
                if (i != 0) {
                    sql.append(COMMA);
                } else {
                    sql.append(SPACE);
                }
                sql.append(visit(tableItem));
            }
        }


        final BooleanExpression whereExpression = select.getWhereExpression();
        if (null != whereExpression) {
            sql.append(SPACE + select.getWhere());
            sql.append(SPACE + visit(whereExpression));
        }
        final List<Item> itemsGroup = select.getGroupItems();
        if (!itemsGroup.isEmpty()) {
            sql.append(select.getGroup());
            for (int i = 0; i < itemsGroup.size(); i++) {
                Item item = itemsGroup.get(i);
                if (0 == i) {
                    sql.append(SPACE);
                } else {
                    sql.append(COMMA);
                }
                sql.append(visit(item));
            }

        }

        final List<OrderItem> orderItems = select.getOrderItems();
        if (!orderItems.isEmpty()) {
            sql.append(SPACE + select.getOrder());
            for (int i = 0; i < orderItems.size(); i++) {
                OrderItem orderItem = orderItems.get(i);
                if (0 == i) {
                    sql.append(SPACE + visit(orderItem));
                } else {
                    sql.append(COMMA + visit(orderItem));
                }
            }
        }
        final BooleanExpression havingExpression = select.getHavingExpression();
        if (null != havingExpression) {
            sql.append(SPACE);
            sql.append(select.getHaving());
            sql.append(SPACE);
            sql.append(visit(havingExpression));
        }

        if (isNotEmpty(select.getLimit())) {
            sql.append(SPACE);
            sql.append(select.getLimit());
            sql.append(SPACE);
            final List<Item> limitItems = select.getLimitItems();
            for (int i = 0; i < limitItems.size(); i++) {
                if (i != 0) {
                    sql.append(COMMA);
                }
                sql.append(visit(limitItems.get(i)));
            }
        }

        return sql.toString();
    }

    public String visit(Object object) {
        if (object instanceof SimpleTable) {
            return visit((SimpleTable) object);
        } else if (object instanceof ConstantItem) {
            return visit((ConstantItem) object);
        } else if (object instanceof TableColumnItem) {
            return visit((TableColumnItem) object);
        } else if (object instanceof CommonConditionExpression) {
            return visit((CommonConditionExpression) object);
        } else if (object instanceof SelectAllItem) {
            return visit((SelectAllItem) object);
        } else if (object instanceof PriorityExpression) {
            return visit((PriorityExpression) object);
        } else if (object instanceof BaseSelect) {
            return visit((BaseSelect) object);
        } else if (object instanceof CaseItem) {
            return visit((CaseItem) object);
        } else if (object instanceof FunctionCallItem) {
            return visit((FunctionCallItem) object);
        } else if (object instanceof BetweenAndExpression) {
            return visit((BetweenAndExpression) object);
        } else if (object instanceof SubIndexItem) {
            return visit((SubIndexItem) object);
        } else if (object instanceof InExpression) {
            return visit((InExpression) object);
        } else if (object instanceof IsNullExpression) {
            return visit((IsNullExpression) object);
        } else if (object instanceof UnionTableTable) {
            return visit((UnionTableTable) object);
        } else if (object instanceof UnionTableTable.UnionTableItem) {
            return visit((UnionTableTable.UnionTableItem) object);
        } else if (object instanceof DefaultOrderItem) {
            return visit((DefaultOrderItem) object);
        } else if (object instanceof UnionSelectItem) {
            return visit((UnionSelectItem) object);
        } else if (object instanceof UnionSelect) {
            return visit((UnionSelect) object);
        } else if (object instanceof ArithmeticExpression) {
            return visit((ArithmeticExpression) object);
        } else if (object instanceof ConcatenationExpression) {
            return visit((ConcatenationExpression) object);
        } else if (object instanceof SimpleInsert) {
            return visit((SimpleInsert) object);
        } else if (object instanceof OnDuplicateInsert) {
            return visit((OnDuplicateInsert) object);
        }
        throw new RuntimeException("unknown exception class is " + object.getClass().getName());
    }

    public String visit(OnDuplicateInsert onDuplicateInsert) {
        StringBuffer sql = new StringBuffer();
        sql.append(visit(onDuplicateInsert.getInsert()));
        sql.append(SPACE);
        sql.append(onDuplicateInsert.getOn());
        sql.append(SPACE);
        sql.append(onDuplicateInsert.getDuplicate());
        sql.append(SPACE);
        sql.append(onDuplicateInsert.getKey());
        sql.append(SPACE);
        sql.append(onDuplicateInsert.getUpdate());
        sql.append(SPACE);
        final List<Item> updateColumns = onDuplicateInsert.getUpdateColumns();
        for (int i = 0; i < updateColumns.size(); i++) {
            if (i != 0) {
                sql.append(COMMA);
            }
            sql.append(visit(updateColumns.get(i)));
        }
        return sql.toString();
    }

    public String visit(SimpleInsert simpleInsert) {
        StringBuffer sql = new StringBuffer();
        sql.append(simpleInsert.getInsert());
        sql.append(SPACE);
        sql.append(simpleInsert.getInto());
        sql.append(SPACE);
        sql.append(simpleInsert.getTable());
        if (Optional.ofNullable(simpleInsert.getColumns()).isPresent()) {
            sql.append(SPACE);
            sql.append(LEFT_BRACKET);
            final List<Item> columns = simpleInsert.getColumns();
            for (int i = 0; i < columns.size(); i++) {
                if (i != 0) {
                    sql.append(COMMA);
                }
                sql.append(visit(columns.get(i)));
            }

            sql.append(RIGHT_BRACKET);
        }
        sql.append(SPACE);
        sql.append(simpleInsert.getValues());
        sql.append(SPACE);
        final List<Item> values = simpleInsert.getValueItems();
        if (Optional.ofNullable(values).isPresent()) {
            sql.append(LEFT_BRACKET);
            for (int i = 0; i < values.size(); i++) {
                if (i != 0) {
                    sql.append(COMMA);
                }
                sql.append(visit(values.get(i)));
            }
            sql.append(RIGHT_BRACKET);
        }
        return sql.toString();
    }

    public String visit(ConcatenationExpression concatenationExpression) {
        StringBuffer sql = new StringBuffer();
        sql.append(visit(concatenationExpression.getLeft()));
        sql.append(SPACE);
        sql.append(concatenationExpression.getConcatenationOperator());
        sql.append(SPACE);
        sql.append(visit(concatenationExpression.getRight()));
        sql.append(toStringCommon(concatenationExpression));
        return sql.toString();
    }

    public String visit(ArithmeticExpression arithmeticExpression) {
        StringBuffer sql = new StringBuffer();
        sql.append(visit(arithmeticExpression.getLeft()));
        sql.append(SPACE);
        sql.append(arithmeticExpression.getOperator());
        sql.append(SPACE);
        sql.append(visit(arithmeticExpression.getRight()));
        sql.append(toStringCommon(arithmeticExpression));
        return sql.toString();
    }

    public String visit(UnionSelect unionSelect) {
        StringBuffer sql = new StringBuffer();
        sql.append(visit(unionSelect.getSelect()));
        final List<UnionSelectItem> unionSelectItems = unionSelect.getUnionSelectItems();
        for (UnionSelectItem unionSelectItem : unionSelectItems) {
            sql.append(SPACE);
            sql.append(visit(unionSelectItem));
        }
        return sql.toString();
    }

    public String visit(UnionSelectItem unionSelectItem) {
        StringBuffer sql = new StringBuffer();
        sql.append(unionSelectItem.getUnion());
        if (isNotEmpty(unionSelectItem.getAll())) {
            sql.append(SPACE);
            sql.append(unionSelectItem.getAll());
        }
        sql.append(SPACE);
        sql.append(visit(unionSelectItem.getSelect()));
        return sql.toString();
    }

    public String visit(DefaultOrderItem defaultOrderItem) {
        StringBuffer sql = new StringBuffer();
        sql.append(visit(defaultOrderItem.getItem()));
        if (isNotEmpty(defaultOrderItem.getOrder())) {
            sql.append(SPACE);
            sql.append(defaultOrderItem.getOrder());
        }
        return sql.toString();
    }

    public String visit(UnionTableTable.UnionTableItem unionTableItem) {
        StringBuffer sql = new StringBuffer();
        sql.append(unionTableItem.getUnion());
        if (isNotEmpty(unionTableItem.getAll())) {
            sql.append(SPACE);
            sql.append(unionTableItem.getAll());
        }
        sql.append(SPACE);
        sql.append(visit(unionTableItem.getRight()));
        sql.append(toStringCommon(unionTableItem));
        return sql.toString();
    }

    public String visit(UnionTableTable unionTableTable) {
        StringBuffer sql = new StringBuffer();
        sql.append(visit(unionTableTable.getLeft()));
        sql.append(SPACE);
        final List<UnionTableTable.UnionTableItem> unionTableItems = unionTableTable.getUnionTableItems();
        for (UnionTableTable.UnionTableItem unionTableItem : unionTableItems) {
            sql.append(SPACE);
            sql.append(visit(unionTableItem));
        }
        sql.append(SPACE);
        sql.append(toStringCommon((Item) unionTableTable));
        return sql.toString();
    }

    public String visit(IsNullExpression isNullExpression) {
        StringBuffer sql = new StringBuffer();
        sql.append(visit(isNullExpression.getLeft()));
        sql.append(SPACE);
        sql.append(isNullExpression.getIs());
        if (isNotEmpty(isNullExpression.getNot())) {
            sql.append(SPACE);
            sql.append(isNullExpression.getNot());
        }
        sql.append(SPACE);
        sql.append(isNullExpression.getNullName());
        sql.append(toStringCommon(isNullExpression));
        return sql.toString();
    }

    public String visit(InExpression inExpression) {
        StringBuffer sql = new StringBuffer();
        sql.append(visit(inExpression.getLeft()));
        if (isNotEmpty(inExpression.getNot())) {
            sql.append(SPACE);
            sql.append(inExpression.getNot());
        }
        sql.append(SPACE);
        sql.append(inExpression.getIn());
        sql.append(LEFT_BRACKET);
        final List<Item> items = inExpression.getItems();
        for (int i = 0; i < items.size(); i++) {
            if (i != 0) {
                sql.append(COMMA);
            }
            sql.append(visit(items.get(i)));
        }
        sql.append(RIGHT_BRACKET);
        sql.append(toStringCommon(inExpression));
        return sql.toString();
    }

    public String visit(SubIndexItem subIndexItem) {
        StringBuffer sql = new StringBuffer();
        sql.append(visit(subIndexItem.getValue()));
        sql.append(LEFT_SQUARE_BRACKET);
        final List<Object> indexes = subIndexItem.getIndexes();
        for (int i = 0; i < indexes.size(); i++) {
            if (i != 0) {
                sql.append(COMMA);
            }
            sql.append(visit(indexes.get(i)));
        }
        sql.append(RIGHT_SQUARE_BRACKET);
        sql.append(toStringCommon(subIndexItem));
        return sql.toString();
    }

    public String visit(BetweenAndExpression betweenAndExpression) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(visit(betweenAndExpression.getLeft()));
        if (isNotEmpty(betweenAndExpression.getNot())) {
            stringBuffer.append(betweenAndExpression.getNot());
        }
        stringBuffer.append(betweenAndExpression.getBetween());
        stringBuffer.append(visit(betweenAndExpression.getLower()));

        stringBuffer.append(betweenAndExpression.getAnd());
        stringBuffer.append(visit(betweenAndExpression.getUpper()));
        return stringBuffer.toString();
    }

    public String visit(FunctionCallItem functionCallItem) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(functionCallItem.getName() + LEFT_BRACKET);
        final List<Object> params = functionCallItem.getParams();
        for (int i = 0; i < params.size(); i++) {
            if (i != 0) {
                stringBuffer.append(COMMA);
            }
            stringBuffer.append(visit(params.get(i)));
        }
        stringBuffer.append(RIGHT_BRACKET);
        stringBuffer.append(toStringCommon((Item) functionCallItem));
        return stringBuffer.toString();
    }

    public String visit(CaseItem caseItem) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(caseItem.getCaseName() + SPACE);
        final List<WhenThenItem> whenThenItems = caseItem.getWhenThenItems();
        for (WhenThenItem whenThenItem : whenThenItems) {
            stringBuffer.append(visit(whenThenItem));
        }
        stringBuffer.append(SPACE + caseItem.getElseName() + SPACE);
        stringBuffer.append(visit(caseItem.getElseResult()));
        stringBuffer.append(caseItem.getEnd());
        stringBuffer.append(toStringCommon((Item) caseItem));
        return stringBuffer.toString();
    }

    public String visit(WhenThenItem whenThenItem) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(whenThenItem.getWhen());
        stringBuffer.append(visit(whenThenItem.getCondition()));
        stringBuffer.append(whenThenItem.getThen());
        stringBuffer.append(visit(whenThenItem.getResult()));
        stringBuffer.append(toStringCommon((Item) whenThenItem));
        return stringBuffer.toString();
    }

    public String visit(PriorityExpression priorityExpression) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(LEFT_BRACKET);
        stringBuffer.append(visit(priorityExpression.getExpression()));
        stringBuffer.append(RIGHT_BRACKET);
        stringBuffer.append(toStringCommon((Item) priorityExpression));
        return stringBuffer.toString();
    }

    public String visit(SelectAllItem selectAllItem) {
        StringBuffer stringBuffer = new StringBuffer();
        if (isNotEmpty(selectAllItem.getTableName())) {
            stringBuffer.append(selectAllItem.getTableName() + DOT);
        }
        stringBuffer.append(selectAllItem.getColumnName());
        stringBuffer.append(toStringCommon(selectAllItem));
        return stringBuffer.toString();
    }

    public String visit(CommonConditionExpression conditionExpression) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(visit(conditionExpression.getLeft()));
        stringBuffer.append(SPACE + conditionExpression.getOp() + SPACE);
        stringBuffer.append(visit(conditionExpression.getRight()));
        stringBuffer.append(toStringCommon(conditionExpression));
        return stringBuffer.toString();
    }

    public String visit(TableColumnItem tableColumnItem) {
        StringBuffer stringBuffer = new StringBuffer();
        if (isNotEmpty(tableColumnItem.getTableName())) {
            stringBuffer.append(tableColumnItem.getTableName() + DOT);
        }
        stringBuffer.append(tableColumnItem.getColumnName());
        stringBuffer.append(toStringCommon(tableColumnItem));
        return stringBuffer.toString();
    }

    public String visit(SimpleTable simpleTable) {
        StringBuffer stringBuffer = new StringBuffer();
        if (isNotEmpty(simpleTable.getDatabase())) {
            stringBuffer.append(simpleTable.getDatabase() + DOT);
        }
        stringBuffer.append(simpleTable.getTableName());
        stringBuffer.append(toStringCommon(simpleTable));
        return stringBuffer.toString();
    }

    public String visit(ConstantItem constantItem) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(constantItem.getConstant());
        stringBuffer.append(toStringCommon(constantItem));
        return stringBuffer.toString();
    }

    public String toStringCommon(Item item) {
        StringBuffer stringBuffer = new StringBuffer();
        if (isNotEmpty(item.getAs())) {
            stringBuffer.append(SPACE + item.getAs());
        }
        if (isNotEmpty(item.getAlias())) {
            stringBuffer.append(SPACE + item.getAlias());
        }
        return stringBuffer.toString();
    }

    public String toStringCommon(Table item) {
        StringBuffer stringBuffer = new StringBuffer();
        if (isNotEmpty(item.getAs())) {
            stringBuffer.append(SPACE + item.getAs());
        }
        if (isNotEmpty(item.getAlias())) {
            stringBuffer.append(SPACE + item.getAlias());
        }
        return stringBuffer.toString();
    }

    public static boolean isNotEmpty(String str) {
        return !(str == null || str.trim() == "");
    }

}
