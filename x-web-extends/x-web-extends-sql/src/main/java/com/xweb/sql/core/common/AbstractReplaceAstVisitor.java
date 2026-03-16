package com.xweb.sql.core.common;

import com.xweb.sql.core.common.delete.SimpleDelete;
import com.xweb.sql.core.common.expression.ArithmeticExpression;
import com.xweb.sql.core.common.expression.BetweenAndExpression;
import com.xweb.sql.core.common.expression.CommonConditionExpression;
import com.xweb.sql.core.common.expression.ConcatenationExpression;
import com.xweb.sql.core.common.expression.ExistExpression;
import com.xweb.sql.core.common.expression.InExpression;
import com.xweb.sql.core.common.expression.IsNullExpression;
import com.xweb.sql.core.common.expression.LikeExpression;
import com.xweb.sql.core.common.expression.NotBooleanExpression;
import com.xweb.sql.core.common.expression.PriorityExpression;
import com.xweb.sql.core.common.insert.AsQueryInsert;
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
import com.xweb.sql.core.common.merge.DeleteMergeOperator;
import com.xweb.sql.core.common.merge.InsertMergeOperator;
import com.xweb.sql.core.common.merge.SimpleMerge;
import com.xweb.sql.core.common.merge.UpdateMergeOperator;
import com.xweb.sql.core.common.merge.WhenMatchedThenOperatorItem;
import com.xweb.sql.core.common.order.DefaultOrderItem;
import com.xweb.sql.core.common.select.BaseSelect;
import com.xweb.sql.core.common.select.UnionSelect;
import com.xweb.sql.core.common.table.SimpleTable;
import com.xweb.sql.core.common.table.UnionTableTable;
import com.xweb.sql.core.common.update.SimpleUpdate;

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

    public Object visit(ArithmeticExpression arithmeticExpression) {
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

    public Object visit(SimpleDelete simpleDelete) {
        if (Optional.ofNullable(simpleDelete.getWhereExpression()).isPresent()) {
            final Object visit = visit(simpleDelete.getWhereExpression());
            if (visit != simpleDelete.getWhereExpression()) {
                simpleDelete.setWhereExpression((BooleanExpression) visit);
            }
        }
        return simpleDelete;
    }


}
