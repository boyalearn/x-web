package com.xweb.sql.core.common;


import com.xweb.sql.core.common.delete.SimpleDelete;
import com.xweb.sql.core.common.expression.ArithmeticExpression;
import com.xweb.sql.core.common.expression.BetweenAndExpression;
import com.xweb.sql.core.common.expression.CommonConditionExpression;
import com.xweb.sql.core.common.expression.ConcatenationExpression;
import com.xweb.sql.core.common.expression.InExpression;
import com.xweb.sql.core.common.expression.IntervalExpression;
import com.xweb.sql.core.common.expression.IsNullExpression;
import com.xweb.sql.core.common.expression.LikeExpression;
import com.xweb.sql.core.common.expression.PriorityExpression;
import com.xweb.sql.core.common.insert.AbstractInsert;
import com.xweb.sql.core.common.insert.AsQueryInsert;
import com.xweb.sql.core.common.insert.OnDuplicateInsert;
import com.xweb.sql.core.common.insert.SimpleInsert;
import com.xweb.sql.core.common.item.CaseItem;
import com.xweb.sql.core.common.item.ConstantItem;
import com.xweb.sql.core.common.item.FunctionCallItem;
import com.xweb.sql.core.common.item.LimitPageItem;
import com.xweb.sql.core.common.item.OffsetPageItem;
import com.xweb.sql.core.common.item.SelectAllItem;
import com.xweb.sql.core.common.item.SubIndexItem;
import com.xweb.sql.core.common.item.TableColumnItem;
import com.xweb.sql.core.common.item.UnionSelectItem;
import com.xweb.sql.core.common.item.WhenThenItem;
import com.xweb.sql.core.common.merge.DeleteMergeOperator;
import com.xweb.sql.core.common.merge.InsertMergeOperator;
import com.xweb.sql.core.common.merge.SimpleMerge;
import com.xweb.sql.core.common.merge.UpdateMergeOperator;
import com.xweb.sql.core.common.merge.WhenMatchedThenOperatorItem;
import com.xweb.sql.core.common.order.DefaultOrderItem;
import com.xweb.sql.core.common.order.OrderItem;
import com.xweb.sql.core.common.select.BaseSelect;
import com.xweb.sql.core.common.select.UnionSelect;
import com.xweb.sql.core.common.table.SimpleTable;
import com.xweb.sql.core.common.table.UnionTableTable;
import com.xweb.sql.core.common.update.SimpleUpdate;

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

        if (Optional.ofNullable(select.getPage()).isPresent()) {
            sql.append(SPACE);
            sql.append(visit(select.getPage()));
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
        } else if (object instanceof AsQueryInsert) {
            return visit((AsQueryInsert) object);
        } else if (object instanceof SimpleDelete) {
            return visit((SimpleDelete) object);
        } else if (object instanceof SimpleUpdate) {
            return visit((SimpleUpdate) object);
        } else if (object instanceof LikeExpression) {
            return visit((LikeExpression) object);
        } else if (object instanceof LikeExpression) {
            return visit((LikeExpression) object);
        } else if (object instanceof SimpleMerge) {
            return visit((SimpleMerge) object);
        } else if (object instanceof WhenMatchedThenOperatorItem) {
            return visit((WhenMatchedThenOperatorItem) object);
        } else if (object instanceof WhenMatchedThenOperatorItem) {
            return visit((WhenMatchedThenOperatorItem) object);
        } else if (object instanceof UpdateMergeOperator) {
            return visit((UpdateMergeOperator) object);
        } else if (object instanceof InsertMergeOperator) {
            return visit((InsertMergeOperator) object);
        } else if (object instanceof DeleteMergeOperator) {
            return visit((DeleteMergeOperator) object);
        } else if (object instanceof LimitPageItem) {
            return visit((LimitPageItem) object);
        } else if (object instanceof OffsetPageItem) {
            return visit((OffsetPageItem) object);
        } else if (object instanceof IntervalExpression) {
            return visit((IntervalExpression) object);
        } else {
            throw new RuntimeException("unknown exception class is " + object.getClass().getName());
        }
    }

    public String visit(IntervalExpression intervalExpression) {
        StringBuffer sql = new StringBuffer();
        if (Optional.ofNullable(intervalExpression.getLeft()).isPresent()) {
            sql.append(visit(intervalExpression.getLeft()));
            sql.append(SPACE);
        }
        if(isNotEmpty(intervalExpression.getOperator())){
            sql.append(intervalExpression.getOperator());
            sql.append(SPACE);
        }
        sql.append(intervalExpression.getInterval());
        if (isNotEmpty(intervalExpression.getSign())) {
            sql.append(intervalExpression.getSign());
        }
        if (isNotEmpty(intervalExpression.getStringIntervalField())) {
            sql.append(SPACE);
            sql.append(intervalExpression.getStringIntervalField());
        }
        if (isNotEmpty(intervalExpression.getNumber())) {
            sql.append(SPACE);
            sql.append(intervalExpression.getNumber());
        }
        if (isNotEmpty(intervalExpression.getIntervalField())) {
            sql.append(SPACE);
            sql.append(intervalExpression.getIntervalField());
        }
        sql.append(toStringCommon(intervalExpression));
        return sql.toString();
    }

    public String visit(OffsetPageItem offsetPageItem) {
        StringBuffer sql = new StringBuffer();
        sql.append(offsetPageItem.getOffset());
        sql.append(SPACE);
        sql.append(visit(offsetPageItem.getStart()));
        sql.append(SPACE);
        sql.append(offsetPageItem.getTagStart());
        sql.append(SPACE);
        sql.append(offsetPageItem.getFetch());
        sql.append(SPACE);
        sql.append(offsetPageItem.getTagFetch());
        sql.append(SPACE);
        sql.append(visit(offsetPageItem.getRow()));
        sql.append(SPACE);
        sql.append(offsetPageItem.getTagRow());
        sql.append(SPACE);
        sql.append(offsetPageItem.getTagLast());
        return sql.toString();
    }

    public String visit(LimitPageItem limitPageItem) {
        StringBuffer sql = new StringBuffer();
        sql.append(limitPageItem.getLimit());
        final List<Item> limitItems = limitPageItem.getLimitItems();
        sql.append(SPACE);
        sql.append(visit(limitItems));
        return sql.toString();
    }

    public String visit(List<Item> items) {
        StringBuffer sql = new StringBuffer();
        for (int i = 0; i < items.size(); i++) {
            if (i != 0) {
                sql.append(COMMA);
            }
            sql.append(visit(items.get(i)));
        }
        return sql.toString();
    }

    public String visit(DeleteMergeOperator deleteMergeOperator) {
        StringBuffer sql = new StringBuffer();
        sql.append(SPACE);
        sql.append(deleteMergeOperator.getDelete());
        return sql.toString();
    }

    public String visit(InsertMergeOperator insertMergeOperator) {
        StringBuffer sql = new StringBuffer();
        sql.append(SPACE);
        sql.append(insertMergeOperator.getInsert());
        if (isNotEmpty(insertMergeOperator.getTable())) {
            sql.append(SPACE);
            sql.append(insertMergeOperator.getTable());
        }
        sql.append(SPACE);
        final List<Item> columnItems = insertMergeOperator.getColumnItems();
        if (Optional.ofNullable(columnItems).isPresent() && !columnItems.isEmpty()) {
            sql.append(LEFT_BRACKET);
            for (int i = 0; i < columnItems.size(); i++) {
                if (i != 0) {
                    sql.append(COMMA);
                }
                sql.append(visit(columnItems.get(i)));
            }
            sql.append(RIGHT_BRACKET);
        }
        if (isNotEmpty(insertMergeOperator.getValues())) {
            sql.append(insertMergeOperator.getValues());
        }
        final List<Item> valueItems = insertMergeOperator.getValueItems();
        if (Optional.ofNullable(valueItems).isPresent()) {
            sql.append(LEFT_BRACKET);
            for (int i = 0; i < valueItems.size(); i++) {
                if (i != 0) {
                    sql.append(COMMA);
                }
                sql.append(visit(valueItems.get(i)));
            }
            sql.append(RIGHT_BRACKET);
        }
        return sql.toString();
    }

    public String visit(UpdateMergeOperator updateMergeOperator) {
        StringBuffer sql = new StringBuffer();
        sql.append(SPACE);
        sql.append(updateMergeOperator.getUpdate());
        if (isNotEmpty(updateMergeOperator.getKey())) {
            sql.append(SPACE);
            sql.append(updateMergeOperator.getKey());
        }
        sql.append(SPACE);
        sql.append(updateMergeOperator.getSet());
        final List<Item> updateItems = updateMergeOperator.getUpdateItems();
        for (int i = 0; i < updateItems.size(); i++) {
            if (i != 0) {
                sql.append(COMMA);
            } else {
                sql.append(SPACE);
            }
            sql.append(visit(updateItems.get(i)));

        }
        return sql.toString();
    }

    public String visit(WhenMatchedThenOperatorItem whenMatchedThenOperatorItem) {
        StringBuffer sql = new StringBuffer();
        sql.append(whenMatchedThenOperatorItem.getWhen());
        if (isNotEmpty(whenMatchedThenOperatorItem.getNot())) {
            sql.append(SPACE);
            sql.append(whenMatchedThenOperatorItem.getNot());
        }
        sql.append(SPACE);
        sql.append(whenMatchedThenOperatorItem.getMatched());
        if (isNotEmpty(whenMatchedThenOperatorItem.getBy())) {
            sql.append(SPACE);
            sql.append(whenMatchedThenOperatorItem.getBy());
        }
        if (isNotEmpty(whenMatchedThenOperatorItem.getSource())) {
            sql.append(SPACE);
            sql.append(whenMatchedThenOperatorItem.getSource());
        }
        sql.append(SPACE);
        sql.append(whenMatchedThenOperatorItem.getThen());
        sql.append(visit(whenMatchedThenOperatorItem.getOperator()));
        return sql.toString();
    }

    public String visit(SimpleMerge simpleMerge) {
        StringBuffer sql = new StringBuffer();
        sql.append(simpleMerge.getMerge());
        sql.append(SPACE);
        sql.append(simpleMerge.getInto());
        sql.append(SPACE);
        sql.append(visit(simpleMerge.getTable()));
        sql.append(SPACE);
        sql.append(simpleMerge.getUsing());
        sql.append(SPACE);
        sql.append(visit(simpleMerge.getUseTable()));
        sql.append(SPACE);
        sql.append(simpleMerge.getOn());
        sql.append(SPACE);
        sql.append(visit(simpleMerge.getOnConditionExpression()));
        final List<WhenMatchedThenOperatorItem> whenThenItems = simpleMerge.getWhenThenItems();
        for (WhenMatchedThenOperatorItem whenThenItem : whenThenItems) {
            sql.append(SPACE);
            sql.append(visit(whenThenItem));
        }
        return sql.toString();
    }

    public String visit(LikeExpression likeExpression) {
        StringBuffer sql = new StringBuffer();
        sql.append(visit(likeExpression.getLeft()));
        sql.append(SPACE);
        if (isNotEmpty(likeExpression.getNot())) {
            sql.append(SPACE);
            sql.append(likeExpression.getNot());
        }
        sql.append(likeExpression.getLike());
        sql.append(SPACE);
        sql.append(visit(likeExpression.getPattern()));
        sql.append(SPACE);
        sql.append(toStringCommon(likeExpression));
        return sql.toString();
    }

    public String visit(SimpleUpdate simpleUpdate) {
        StringBuffer sql = new StringBuffer();
        sql.append(simpleUpdate.getUpdate());
        sql.append(SPACE);
        sql.append(simpleUpdate.getTable());
        sql.append(SPACE);
        sql.append(simpleUpdate.getSet());
        if (Optional.ofNullable(simpleUpdate.getUpdateItems()).isPresent()) {
            sql.append(SPACE);
            final List<Item> updateItems = simpleUpdate.getUpdateItems();
            for (int i = 0; i < updateItems.size(); i++) {
                if (i != 0) {
                    sql.append(COMMA);
                }
                sql.append(visit(updateItems.get(i)));
            }
        }
        if (Optional.ofNullable(simpleUpdate.getWhere()).isPresent()) {
            sql.append(SPACE);
            sql.append(simpleUpdate.getWhere());
            sql.append(SPACE);
            sql.append(visit(simpleUpdate.getWhereExpression()));
        }
        return sql.toString();
    }

    public String visit(SimpleDelete simpleDelete) {
        StringBuffer sql = new StringBuffer();
        sql.append(simpleDelete.getDelete());
        sql.append(SPACE);
        sql.append(simpleDelete.getFrom());
        sql.append(SPACE);
        sql.append(simpleDelete.getTable());
        if (isNotEmpty(simpleDelete.getWhere())) {
            sql.append(SPACE);
            sql.append(simpleDelete.getWhere());
        }
        if (Optional.ofNullable(simpleDelete.getWhere()).isPresent()) {
            sql.append(SPACE);
            sql.append(visit(simpleDelete.getWhereExpression()));
        }
        return sql.toString();
    }

    public String visit(AsQueryInsert asQueryInsert) {
        StringBuffer sql = new StringBuffer();
        sql.append(visit((AbstractInsert) asQueryInsert));
        sql.append(SPACE);
        sql.append(visit(asQueryInsert.getQuery()));
        return sql.toString();
    }

    private String visit(AbstractInsert abstractInsert) {
        StringBuffer sql = new StringBuffer();
        sql.append(abstractInsert.getInsert());
        sql.append(SPACE);
        sql.append(abstractInsert.getInto());
        sql.append(SPACE);
        sql.append(abstractInsert.getTable());
        if (Optional.ofNullable(abstractInsert.getColumns()).isPresent()) {
            sql.append(SPACE);
            sql.append(LEFT_BRACKET);
            final List<Item> columns = abstractInsert.getColumns();
            for (int i = 0; i < columns.size(); i++) {
                if (i != 0) {
                    sql.append(COMMA);
                }
                sql.append(visit(columns.get(i)));
            }

            sql.append(RIGHT_BRACKET);
        }
        return sql.toString();
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
        sql.append(visit((AbstractInsert) simpleInsert));
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
        final List<Item> indexes = subIndexItem.getIndexes();
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
