package com.xweb.sql.core.convert;

import com.xweb.sql.core.common.BooleanExpression;
import com.xweb.sql.core.common.Insert;
import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.Statement;
import com.xweb.sql.core.common.item.UnionSelectItem;
import com.xweb.sql.core.common.select.BaseSelect;
import com.xweb.sql.core.common.Select;
import com.xweb.sql.core.common.Table;
import com.xweb.sql.core.common.select.UnionSelect;
import com.xweb.sql.core.common.expression.BetweenAndExpression;
import com.xweb.sql.core.common.expression.CommonConditionExpression;
import com.xweb.sql.core.common.expression.IsNullExpression;
import com.xweb.sql.core.common.expression.PriorityExpression;
import com.xweb.sql.core.common.item.CaseItem;
import com.xweb.sql.core.common.item.ConstantItem;
import com.xweb.sql.core.common.item.FunctionCallItem;
import com.xweb.sql.core.common.item.SelectAllItem;
import com.xweb.sql.core.common.item.SubIndexItem;
import com.xweb.sql.core.common.item.TableColumnItem;
import com.xweb.sql.core.common.item.WhenThenItem;
import com.xweb.sql.core.common.order.DefaultOrderItem;
import com.xweb.sql.core.common.order.OrderItem;
import com.xweb.sql.core.common.table.SimpleTable;

import java.util.List;
import java.util.Optional;

public abstract class AbstractCommonAstVisitor {

    public Object visit(Select select) {
        if (select instanceof BaseSelect) {
            return visit((BaseSelect) select);
        } else {
            return visit((UnionSelect) select);
        }
    }

    public Object visit(BaseSelect select) {
        final List<Item> selectItems = select.getSelectItems();
        for (int i = 0; i < selectItems.size(); i++) {
            Item selectItem = selectItems.get(i);
            visit(selectItem);
        }

        final List<Table> tableItems = select.getTableItems();
        if (!tableItems.isEmpty()) {
            for (int i = 0; i < tableItems.size(); i++) {
                Table tableItem = tableItems.get(i);
                visit(tableItem);
            }
        }

        final BooleanExpression whereExpression = select.getWhereExpression();
        if (null != whereExpression) {
            visit(whereExpression);
        }
        final List<Item> itemsGroup = select.getGroupItems();
        if (!itemsGroup.isEmpty()) {
            for (int i = 0; i < itemsGroup.size(); i++) {
                Item item = itemsGroup.get(i);
                visit(item);
            }
        }

        final List<OrderItem> orderItems = select.getOrderItems();
        if (!orderItems.isEmpty()) {
            for (int i = 0; i < orderItems.size(); i++) {
                OrderItem orderItem = orderItems.get(i);
                visit(orderItem);
            }
        }
        final BooleanExpression havingExpression = select.getHavingExpression();
        if (null != havingExpression) {
            visit(havingExpression);
        }
        return select;
    }

    public Object visit(Statement statement) {
        if (statement instanceof Select) {
            return visit((Select) statement);
        } else if (statement instanceof Insert) {
            return visit((Insert) statement);
        }
        throw new RuntimeException("unknown exception class is " + statement.getClass().getName());
    }

    protected Object visit(Object object) {
        if (object instanceof SimpleTable) {
            return visit((SimpleTable) object);
        } else if (object instanceof BaseSelect) {
            return visit((BaseSelect) object);
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
        } else if (object instanceof CaseItem) {
            return visit((CaseItem) object);
        } else if (object instanceof FunctionCallItem) {
            return visit((FunctionCallItem) object);
        } else if (object instanceof BetweenAndExpression) {
            return visit((BetweenAndExpression) object);
        } else if (object instanceof SubIndexItem) {
            return visit((SubIndexItem) object);
        } else if (object instanceof IsNullExpression) {
            return visit((IsNullExpression) object);
        } else if (object instanceof DefaultOrderItem) {
            return visit((DefaultOrderItem) object);
        } else if (object instanceof UnionSelect) {
            return visit((UnionSelect) object);
        } else {
            throw new RuntimeException("unknown exception class is " + object.getClass().getName());
        }
    }

    protected Object visit(UnionSelect unionSelect) {
        Object result = doVisit(unionSelect);
        visit(unionSelect.getSelect());
        if (Optional.ofNullable(unionSelect.getUnionSelectItems()).isPresent() && !unionSelect.getUnionSelectItems().isEmpty()) {
            final List<UnionSelectItem> unionSelectItems = unionSelect.getUnionSelectItems();
            for (UnionSelectItem unionSelectItem : unionSelectItems) {
                visit(unionSelectItem);
            }
        }
        return result;
    }

    protected Object visit(DefaultOrderItem subIndexItem) {
        return doVisit(subIndexItem);
    }

    protected Object visit(IsNullExpression subIndexItem) {
        return doVisit(subIndexItem);
    }

    protected Object visit(SubIndexItem subIndexItem) {
        return doVisit(subIndexItem);
    }

    protected Object visit(BetweenAndExpression betweenAndExpression) {
        return doVisit(betweenAndExpression);
    }

    protected Object visit(FunctionCallItem functionCallItem) {
        return doVisit(functionCallItem);
    }

    protected Object visit(CaseItem caseItem) {
        return doVisit(caseItem);
    }

    protected Object visit(WhenThenItem whenThenItem) {
        return doVisit(whenThenItem);
    }

    protected Object visit(PriorityExpression priorityExpression) {
        return doVisit(priorityExpression);
    }

    protected Object visit(SelectAllItem selectAllItem) {
        return doVisit(selectAllItem);
    }

    protected Object visit(CommonConditionExpression conditionExpression) {
        return doVisit(conditionExpression);
    }

    protected Object visit(TableColumnItem tableColumnItem) {
        return doVisit(tableColumnItem);
    }

    protected Object visit(SimpleTable simpleTable) {
        return doVisit(simpleTable);
    }

    protected Object visit(ConstantItem constantItem) {
        return doVisit(constantItem);
    }

    protected abstract Object doVisit(Object object);
}
