package com.xweb.sql.core.convert;

import com.xweb.sql.core.common.BooleanExpression;
import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.Page;
import com.xweb.sql.core.common.Select;
import com.xweb.sql.core.common.Table;
import com.xweb.sql.core.common.delete.SimpleDelete;
import com.xweb.sql.core.common.expression.ArithmeticExpression;
import com.xweb.sql.core.common.expression.BetweenAndExpression;
import com.xweb.sql.core.common.expression.CommonConditionExpression;
import com.xweb.sql.core.common.expression.ConcatenationExpression;
import com.xweb.sql.core.common.expression.ExistExpression;
import com.xweb.sql.core.common.expression.InExpression;
import com.xweb.sql.core.common.expression.IsNullExpression;
import com.xweb.sql.core.common.expression.LeftAndRightExpression;
import com.xweb.sql.core.common.expression.LikeExpression;
import com.xweb.sql.core.common.expression.NotBooleanExpression;
import com.xweb.sql.core.common.expression.PriorityExpression;
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
import com.xweb.sql.core.common.merge.MergeOperator;
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
import lombok.val;

import java.util.List;
import java.util.Optional;

/**
 * 基础的替换逻辑。子类只需要实现需要替换visit()即可
 */
public abstract class AbstractReplaceAstVisitor {

    public Object visit(Object object) {
        if (object instanceof SimpleDelete) {
            return visit((SimpleDelete) object);
        } else if (object instanceof ArithmeticExpression) {
            return visit((ArithmeticExpression) object);
        } else if (object instanceof BetweenAndExpression) {
            return visit((BetweenAndExpression) object);
        } else if (object instanceof CommonConditionExpression) {
            return visit((CommonConditionExpression) object);
        } else if (object instanceof ConcatenationExpression) {
            return visit((ConcatenationExpression) object);
        } else if (object instanceof ExistExpression) {
            return visit((ExistExpression) object);
        } else if (object instanceof InExpression) {
            return visit((InExpression) object);
        } else if (object instanceof IsNullExpression) {
            return visit((IsNullExpression) object);
        } else if (object instanceof LikeExpression) {
            return visit((LikeExpression) object);
        } else if (object instanceof NotBooleanExpression) {
            return visit((NotBooleanExpression) object);
        } else if (object instanceof PriorityExpression) {
            return visit((PriorityExpression) object);
        } else if (object instanceof AsQueryInsert) {
            return visit((AsQueryInsert) object);
        } else if (object instanceof OnDuplicateInsert) {
            return visit((OnDuplicateInsert) object);
        } else if (object instanceof SimpleInsert) {
            return visit((SimpleInsert) object);
        } else if (object instanceof CaseItem) {
            return visit((CaseItem) object);
        } else if (object instanceof ConstantItem) {
            return visit((ConstantItem) object);
        } else if (object instanceof FunctionCallItem) {
            return visit((FunctionCallItem) object);
        } else if (object instanceof LimitPageItem) {
            return visit((LimitPageItem) object);
        } else if (object instanceof OffsetPageItem) {
            return visit((OffsetPageItem) object);
        } else if (object instanceof SelectAllItem) {
            return visit((SelectAllItem) object);
        } else if (object instanceof SubIndexItem) {
            return visit((SubIndexItem) object);
        } else if (object instanceof TableColumnItem) {
            return visit((TableColumnItem) object);
        } else if (object instanceof UnionSelectItem) {
            return visit((UnionSelectItem) object);
        } else if (object instanceof WhenThenItem) {
            return visit((WhenThenItem) object);
        } else if (object instanceof DeleteMergeOperator) {
            return visit((DeleteMergeOperator) object);
        } else if (object instanceof InsertMergeOperator) {
            return visit((InsertMergeOperator) object);
        } else if (object instanceof SimpleMerge) {
            return visit((SimpleMerge) object);
        } else if (object instanceof UpdateMergeOperator) {
            return visit((UpdateMergeOperator) object);
        } else if (object instanceof WhenMatchedThenOperatorItem) {
            return visit((WhenMatchedThenOperatorItem) object);
        } else if (object instanceof DefaultOrderItem) {
            return visit((DefaultOrderItem) object);
        } else if (object instanceof BaseSelect) {
            return visit((BaseSelect) object);
        } else if (object instanceof UnionSelect) {
            return visit((UnionSelect) object);
        } else if (object instanceof SimpleTable) {
            return visit((SimpleTable) object);
        } else if (object instanceof UnionTableTable) {
            return visit((UnionTableTable) object);
        } else if (object instanceof UnionTableTable.UnionTableItem) {
            return visit((UnionTableTable.UnionTableItem) object);
        } else if (object instanceof SimpleUpdate) {
            return visit((SimpleUpdate) object);
        } else {
            throw new RuntimeException("未知的解析异常");
        }
    }

    protected Object visit(BetweenAndExpression betweenAndExpression) {
        if (Optional.ofNullable(betweenAndExpression.getLeft()).isPresent()) {
            Item left = (Item) visit(betweenAndExpression.getLeft());
            if (left != betweenAndExpression.getLeft()) {
                betweenAndExpression.setLeft(left);
            }
        }

        if (Optional.ofNullable(betweenAndExpression.getLower()).isPresent()) {
            Item lower = (Item) visit(betweenAndExpression.getLower());
            if (lower != betweenAndExpression.getLower()) {
                betweenAndExpression.setLower(lower);
            }
        }

        if (Optional.ofNullable(betweenAndExpression.getUpper()).isPresent()) {
            Item upper = (Item) visit(betweenAndExpression.getUpper());
            if (upper != betweenAndExpression.getUpper()) {
                betweenAndExpression.setUpper(upper);
            }
        }
        return betweenAndExpression;
    }

    protected Object visit(CommonConditionExpression commonConditionExpression) {
        return visit((LeftAndRightExpression) commonConditionExpression);
    }

    protected Object visit(LeftAndRightExpression leftAndRightExpression) {
        if (Optional.ofNullable(leftAndRightExpression.getLeft()).isPresent()) {
            Item left = (Item) visit(leftAndRightExpression.getLeft());
            if (left != leftAndRightExpression.getLeft()) {
                leftAndRightExpression.setLeft(left);
            }
        }

        if (Optional.ofNullable(leftAndRightExpression.getRight()).isPresent()) {
            Item right = (Item) visit(leftAndRightExpression.getRight());
            if (right != leftAndRightExpression.getRight()) {
                leftAndRightExpression.setRight(right);
            }
        }
        return leftAndRightExpression;
    }

    protected Object visit(ConcatenationExpression concatenationExpression) {
        return visit((LeftAndRightExpression) concatenationExpression);
    }


    protected Object visit(ExistExpression existExpression) {
        if (Optional.ofNullable(existExpression.getLeft()).isPresent()) {
            Item left = (Item) visit(existExpression.getLeft());
            if (left != existExpression.getLeft()) {
                existExpression.setLeft(left);
            }
        }

        if (Optional.ofNullable(existExpression.getExpression()).isPresent()) {
            Item expression = (Item) visit(existExpression.getExpression());
            if (expression != existExpression.getExpression()) {
                existExpression.setExpression(expression);
            }
        }

        return existExpression;
    }

    protected Object visit(InExpression inExpression) {
        if (Optional.ofNullable(inExpression.getLeft()).isPresent()) {
            Item left = (Item) visit(inExpression.getLeft());
            if (left != inExpression.getLeft()) {
                inExpression.setLeft(left);
            }
        }

        final List<Item> items = inExpression.getItems();

        if (Optional.ofNullable(items).isPresent() && !items.isEmpty()) {
            for (int i = 0; i < items.size(); i++) {
                Item item = (Item) visit(items.get(i));
                if (item != items.get(i)) {
                    items.set(i, item);
                }
            }
        }
        return inExpression;
    }

    protected Object visit(IsNullExpression isNullExpression) {
        if (Optional.ofNullable(isNullExpression.getLeft()).isPresent()) {
            Item left = (Item) visit(isNullExpression.getLeft());
            if (left != isNullExpression.getLeft()) {
                isNullExpression.setLeft(left);
            }
        }
        return isNullExpression;
    }

    protected Object visit(LikeExpression likeExpression) {
        if (Optional.ofNullable(likeExpression.getLeft()).isPresent()) {
            Item left = (Item) visit(likeExpression.getLeft());
            if (left != likeExpression.getLeft()) {
                likeExpression.setLeft(left);
            }
        }
        if (Optional.ofNullable(likeExpression.getPattern()).isPresent()) {
            Item pattern = (Item) visit(likeExpression.getPattern());
            if (pattern != likeExpression.getPattern()) {
                likeExpression.setPattern(pattern);
            }
        }
        return likeExpression;
    }

    protected Object visit(NotBooleanExpression notBooleanExpression) {
        if (Optional.ofNullable(notBooleanExpression.getExpression()).isPresent()) {
            BooleanExpression expression = (BooleanExpression) visit(notBooleanExpression.getExpression());
            if (expression != notBooleanExpression.getExpression()) {
                notBooleanExpression.setExpression(expression);
            }
        }
        return notBooleanExpression;
    }

    protected Object visit(PriorityExpression priorityExpression) {
        Item expression = (Item) visit(priorityExpression.getExpression());

        if (expression != priorityExpression.getExpression()) {
            priorityExpression.setExpression(expression);
        }
        return priorityExpression;
    }

    protected Object visit(AsQueryInsert asQueryInsert) {
        if (Optional.ofNullable(asQueryInsert.getColumns()).isPresent()
                && !asQueryInsert.getColumns().isEmpty()) {
            final List<Item> columns = asQueryInsert.getColumns();
            for (int i = 0; i < columns.size(); i++) {
                Item item = (Item) visit(columns.get(i));
                if (item != columns.get(i)) {
                    columns.set(i, item);
                }
            }
        }

        if (Optional.ofNullable(asQueryInsert.getQuery()).isPresent()) {
            Select select = (Select) visit(asQueryInsert.getQuery());
            if (select != asQueryInsert.getQuery()) {
                asQueryInsert.setQuery(select);
            }
        }

        return asQueryInsert;
    }

    protected Object visit(OnDuplicateInsert onDuplicateInsert) {
        if (Optional.ofNullable(onDuplicateInsert.getInsert()).isPresent()) {
            SimpleInsert insert = (SimpleInsert) visit(onDuplicateInsert.getInsert());
            if (insert != onDuplicateInsert.getInsert()) {
                onDuplicateInsert.setInsert(insert);
            }
        }

        if (Optional.ofNullable(onDuplicateInsert.getUpdateColumns()).isPresent()
                && !onDuplicateInsert.getUpdateColumns().isEmpty()) {
            final List<Item> updateColumns = onDuplicateInsert.getUpdateColumns();
            for (int i = 0; i < updateColumns.size(); i++) {
                Item item = (Item) visit(updateColumns.get(i));
                if (item != updateColumns.get(i)) {
                    updateColumns.set(i, item);
                }
            }
        }
        return onDuplicateInsert;

    }

    protected Object visit(SimpleInsert simpleInsert) {
        List<Item> columns = visit(simpleInsert.getColumns());
        if (columns != simpleInsert.getColumns()) {
            simpleInsert.setColumns(columns);
        }
        List<Item> valueItems = visit(simpleInsert.getValueItems());
        if (valueItems != simpleInsert.getValueItems()) {
            simpleInsert.setValueItems(valueItems);
        }

        return simpleInsert;
    }

    protected Object visit(CaseItem caseItem) {
        final List<WhenThenItem> whenThenItems = caseItem.getWhenThenItems();
        if (Optional.ofNullable(whenThenItems).isPresent() && !whenThenItems.isEmpty()) {
            for (int i = 0; i < whenThenItems.size(); i++) {
                final WhenThenItem whenThenItem = (WhenThenItem) visit(whenThenItems.get(i));
                if (whenThenItem != whenThenItems.get(i)) {
                    whenThenItems.set(i, whenThenItem);
                }
            }
        }

        if (Optional.ofNullable(caseItem.getElseResult()).isPresent()) {
            final Item item = (Item) visit(caseItem.getElseResult());
            if (item != caseItem.getElseResult()) {
                caseItem.setElseResult(item);
            }
        }
        return caseItem;

    }

    protected Object visit(ConstantItem constantItem) {
        return constantItem;
    }

    protected Object visit(FunctionCallItem functionCallItem) {
        final List<Object> params = functionCallItem.getParams();
        if (Optional.ofNullable(params).isPresent()) {
            for (int i = 0; i < params.size(); i++) {
                final Object param = visit(params.get(i));
                if (param != params.get(i)) {
                    params.set(i, param);
                }
            }
        }
        return functionCallItem;
    }

    protected Object visit(LimitPageItem limitPageItem) {
        final List<Item> limitItems = limitPageItem.getLimitItems();
        final List<Item> visitItems = visit(limitItems);
        if (visitItems != limitItems) {
            limitPageItem.setLimitItems(visitItems);
        }
        return limitPageItem;
    }

    protected Object visit(OffsetPageItem offsetPageItem) {
        if (Optional.ofNullable(offsetPageItem.getStart()).isPresent()) {
            Item start = (Item) visit(offsetPageItem.getStart());
            if (start != offsetPageItem.getStart()) {
                offsetPageItem.setStart(start);
            }
        }
        if (Optional.ofNullable(offsetPageItem.getRow()).isPresent()) {
            Item row = (Item) visit(offsetPageItem.getRow());
            if (row != offsetPageItem.getRow()) {
                offsetPageItem.setRow(row);
            }
        }
        return offsetPageItem;
    }

    protected Object visit(SelectAllItem selectAllItem) {
        return selectAllItem;
    }

    protected Object visit(SubIndexItem subIndexItem) {
        final Object value = visit(subIndexItem.getValue());
        if (value != subIndexItem.getValue()) {
            subIndexItem.setValue(value);
        }

        final List<Item> indexes = visit(subIndexItem.getIndexes());
        if (indexes != subIndexItem.getIndexes()) {
            subIndexItem.setIndexes(indexes);
        }
        return subIndexItem;
    }

    protected Object visit(TableColumnItem tableColumnItem) {
        return tableColumnItem;
    }

    protected Object visit(UnionSelectItem unionSelectItem) {
        if (Optional.ofNullable(unionSelectItem.getSelect()).isPresent()) {
            final Item select = (Item) visit(unionSelectItem.getSelect());
            if (select != unionSelectItem.getSelect()) {
                unionSelectItem.setSelect(select);
            }
        }
        return unionSelectItem;
    }

    protected Object visit(WhenThenItem whenThenItem) {
        if (Optional.ofNullable(whenThenItem.getCondition()).isPresent()) {
            final BooleanExpression condition = (BooleanExpression) visit(whenThenItem.getCondition());
            if (condition != whenThenItem.getCondition()) {
                whenThenItem.setCondition(condition);
            }
        }
        if (Optional.ofNullable(whenThenItem.getResult()).isPresent()) {
            final Object result = visit(whenThenItem.getResult());
            if (result != whenThenItem.getResult()) {
                whenThenItem.setResult(result);
            }
        }
        return whenThenItem;
    }

    protected Object visit(DeleteMergeOperator deleteMergeOperator) {
        return deleteMergeOperator;
    }

    protected Object visit(InsertMergeOperator insertMergeOperator) {
        final List<Item> valueItems = insertMergeOperator.getValueItems();
        if (valueItems != insertMergeOperator.getValueItems()) {
            insertMergeOperator.setValueItems(valueItems);
        }

        final List<Item> columnItems = visit(insertMergeOperator.getColumnItems());
        if (columnItems != insertMergeOperator.getColumnItems()) {
            insertMergeOperator.setColumnItems(columnItems);
        }
        return insertMergeOperator;
    }

    protected List<Item> visit(List<Item> items) {
        if (Optional.ofNullable(items).isPresent() && !items.isEmpty()) {
            for (int i = 0; i < items.size(); i++) {
                final Item value = (Item) visit(items.get(i));
                if (value != items.get(i)) {
                    items.set(i, value);
                }
            }
        }
        return items;
    }

    protected Object visit(SimpleMerge simpleMerge) {
        if (Optional.ofNullable(simpleMerge.getOnConditionExpression()).isPresent()) {
            final BooleanExpression condition = (BooleanExpression) visit(simpleMerge.getOnConditionExpression());
            if (condition != simpleMerge.getOnConditionExpression()) {
                simpleMerge.setOnConditionExpression(condition);
            }
        }
        final List<WhenMatchedThenOperatorItem> whenThenItems =
                (List<WhenMatchedThenOperatorItem>) visit(simpleMerge.getWhenThenItems());
        if (whenThenItems != simpleMerge.getWhenThenItems()) {
            simpleMerge.setWhenThenItems(whenThenItems);
        }
        return simpleMerge;
    }

    protected Object visit(UpdateMergeOperator updateMergeOperator) {
        final List<Item> updateItems = visit(updateMergeOperator.getUpdateItems());
        if (updateItems != updateMergeOperator.getUpdateItems()) {
            updateMergeOperator.setUpdateItems(updateItems);
        }
        return updateMergeOperator;
    }

    protected Object visit(WhenMatchedThenOperatorItem whenMatchedThenOperatorItem) {
        if (Optional.ofNullable(whenMatchedThenOperatorItem.getOperator()).isPresent()) {
            final Object operator = visit(whenMatchedThenOperatorItem.getOperator());
            if (operator != whenMatchedThenOperatorItem.getOperator()) {
                whenMatchedThenOperatorItem.setOperator((MergeOperator) operator);
            }
        }
        return whenMatchedThenOperatorItem;
    }

    protected Object visit(DefaultOrderItem defaultOrderItem) {
        if (Optional.ofNullable(defaultOrderItem.getItem()).isPresent()) {
            final Item item = (Item) visit(defaultOrderItem.getItem());
            if (item != defaultOrderItem.getItem()) {
                defaultOrderItem.setItem(item);
            }
        }
        return defaultOrderItem;
    }

    protected Object visit(BaseSelect baseSelect) {

        final List<Item> selectItems = visit(baseSelect.getSelectItems());
        if (selectItems != baseSelect.getSelectItems()) {
            baseSelect.setSelectItems(selectItems);
        }

        final List<Table> tableItems = baseSelect.getTableItems();
        if (!tableItems.isEmpty()) {
            for (int i = 0; i < tableItems.size(); i++) {
                Table table = (Table) visit(tableItems.get(i));
                if (table != tableItems.get(i)) {
                    tableItems.set(i, table);
                }
            }
        }

        if (Optional.ofNullable(baseSelect.getWhereExpression()).isPresent()) {
            final BooleanExpression whereExpression = (BooleanExpression) visit(baseSelect.getWhereExpression());
            if (baseSelect.getWhereExpression() != whereExpression) {
                baseSelect.setWhereExpression(whereExpression);
            }
        }

        final List<Item> itemsGroup = baseSelect.getGroupItems();
        if (!itemsGroup.isEmpty()) {
            for (int i = 0; i < itemsGroup.size(); i++) {
                Item groupItem = (Item) visit(itemsGroup.get(i));
                if (groupItem != itemsGroup.get(i)) {
                    itemsGroup.set(i, groupItem);
                }
            }
        }

        final List<OrderItem> orderItems = baseSelect.getOrderItems();
        if (!orderItems.isEmpty()) {
            for (int i = 0; i < orderItems.size(); i++) {
                OrderItem orderItem = (OrderItem) visit(orderItems.get(i));
                if (orderItem != orderItems.get(i)) {
                    orderItems.set(i, orderItem);
                }
            }
        }
        final BooleanExpression havingExpression = baseSelect.getHavingExpression();
        if (null != havingExpression) {
            final BooleanExpression having = (BooleanExpression) visit(baseSelect.getHavingExpression());
            if (having != havingExpression) {
                baseSelect.setHavingExpression(having);
            }
        }

        if (Optional.ofNullable(baseSelect.getPage()).isPresent()) {
            final Page page = (Page) visit(baseSelect.getPage());
            if (page != baseSelect.getPage()) {
                baseSelect.setPage(page);
            }
        }
        return baseSelect;
    }

    protected Object visit(UnionSelect unionSelect) {
        final List<UnionSelectItem> unionSelectItems = unionSelect.getUnionSelectItems();
        if (Optional.ofNullable(unionSelectItems).isPresent()) {
            for (int i = 0; i < unionSelectItems.size(); i++) {
                final UnionSelectItem unionSelectItem = (UnionSelectItem) visit(unionSelectItems.get(i));
                if (unionSelectItem != unionSelectItems.get(i)) {
                    unionSelectItems.set(i, unionSelectItem);
                }
            }
        }
        return unionSelect;
    }

    protected Object visit(SimpleTable simpleTable) {
        return simpleTable;
    }

    protected Object visit(UnionTableTable unionTableTable) {
        if (Optional.ofNullable(unionTableTable.getLeft()).isPresent()) {
            final Item left = (Item) visit(unionTableTable.getLeft());
            if (left != unionTableTable.getLeft()) {
                unionTableTable.setLeft(left);
            }
        }
        final List<UnionTableTable.UnionTableItem> unionTableItems = unionTableTable.getUnionTableItems();
        if (Optional.ofNullable(unionTableItems).isPresent()) {
            for (int i = 0; i < unionTableItems.size(); i++) {
                final UnionTableTable.UnionTableItem unionTableItem = (UnionTableTable.UnionTableItem) visit(unionTableItems.get(i));
                if (unionTableItem != unionTableItems.get(i)) {
                    unionTableItems.set(i, unionTableItem);
                }
            }
        }

        return unionTableItems;
    }

    protected Object visit(UnionTableTable.UnionTableItem unionTableItem) {
        final Item right = (Item) visit(unionTableItem.getRight());
        if (right != unionTableItem.getRight()) {
            unionTableItem.setRight(right);
        }
        return unionTableItem;
    }

    protected Object visit(SimpleUpdate simpleUpdate) {
        if (Optional.ofNullable(simpleUpdate.getUpdateItems()).isPresent()) {
            final List<Item> updateItems = simpleUpdate.getUpdateItems();
            for (int i = 0; i < updateItems.size(); i++) {
                final Item updateItem = (Item) visit(updateItems.get(i));
                if (updateItem != updateItems.get(i)) {
                    updateItems.set(i, updateItem);
                }
            }
        }
        if (Optional.ofNullable(simpleUpdate.getWhereExpression()).isPresent()) {
            final BooleanExpression whereExpression = (BooleanExpression) visit(simpleUpdate.getWhereExpression());
            if (whereExpression != simpleUpdate.getWhereExpression()) {
                simpleUpdate.setWhereExpression(whereExpression);
            }
        }
        return simpleUpdate;
    }

    protected Object visit(ArithmeticExpression arithmeticExpression) {
        if (Optional.ofNullable(arithmeticExpression.getLeft()).isPresent()) {
            final Object visit = visit(arithmeticExpression.getLeft());
            if (visit != arithmeticExpression.getLeft()) {
                arithmeticExpression.setLeft((Item) visit);
            }
        }
        if (Optional.ofNullable(arithmeticExpression.getRight()).isPresent()) {
            final Object visit = visit(arithmeticExpression.getRight());
            if (visit != arithmeticExpression.getRight()) {
                arithmeticExpression.setRight((Item) visit);
            }
        }
        return arithmeticExpression;
    }

    protected Object visit(SimpleDelete simpleDelete) {
        if (Optional.ofNullable(simpleDelete.getWhereExpression()).isPresent()) {
            final Object visit = visit(simpleDelete.getWhereExpression());
            if (visit != simpleDelete.getWhereExpression()) {
                simpleDelete.setWhereExpression((BooleanExpression) visit);
            }
        }
        return simpleDelete;
    }


}
