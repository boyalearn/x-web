package com.xweb.sql.core.common.ast;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.ast.visitor.*;
import com.xweb.sql.core.common.delete.SimpleDelete;
import com.xweb.sql.core.common.expression.*;
import com.xweb.sql.core.common.insert.AbstractInsert;
import com.xweb.sql.core.common.insert.AsQueryInsert;
import com.xweb.sql.core.common.insert.OnDuplicateInsert;
import com.xweb.sql.core.common.insert.SimpleInsert;
import com.xweb.sql.core.common.item.*;
import com.xweb.sql.core.common.merge.*;
import com.xweb.sql.core.common.order.DefaultOrderItem;
import com.xweb.sql.core.common.page.LimitPageItem;
import com.xweb.sql.core.common.page.OffsetPageItem;
import com.xweb.sql.core.common.select.BaseSelect;
import com.xweb.sql.core.common.select.UnionSelect;
import com.xweb.sql.core.common.table.SimpleTable;
import com.xweb.sql.core.common.table.UnionTableTable;
import com.xweb.sql.core.common.update.SimpleUpdate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class AstUtil {

    public final static String SPACE = " ";

    public final static String DOT = ".";

    public final static String LEFT_BRACKET = "(";

    public final static String RIGHT_BRACKET = ")";

    public final static String LEFT_SQUARE_BRACKET = "[";

    public final static String RIGHT_SQUARE_BRACKET = "]";


    public final static String COMMA = ",";

    private static final Map<Class<?>, AstVisitor> VISITOR = new HashMap<>();

    static {
        VISITOR.put(BaseSelect.class, new BaseSelectVisitor());
        VISITOR.put(IntervalExpression.class, new IntervalExpressionVisitor());
        VISITOR.put(AbstractInsert.class, new AbstractInsertVisitor());
        VISITOR.put(ArithmeticExpression.class, new ArithmeticExpressionVisitor());
        VISITOR.put(AsQueryInsert.class, new AsQueryInsertVisitor());
        VISITOR.put(BetweenAndExpression.class, new BetweenAndExpressionVisitor());
        VISITOR.put(CaseItem.class, new CaseItemVisitor());
        VISITOR.put(CommonConditionExpression.class, new CommonConditionExpressionVisitor());
        VISITOR.put(ConcatenationExpression.class, new ConcatenationExpressionVisitor());
        VISITOR.put(ConstantItem.class, new ConstantItemVisitor());
        VISITOR.put(DefaultOrderItem.class, new DefaultOrderItemVisitor());
        VISITOR.put(DeleteMergeOperator.class, new DeleteMergeOperatorVisitor());
        VISITOR.put(FunctionCallItem.class, new FunctionCallItemVisitor());
        VISITOR.put(InExpression.class, new InExpressionVisitor());
        VISITOR.put(InsertMergeOperator.class, new InsertMergeOperatorVisitor());
        VISITOR.put(IsNullExpression.class, new IsNullExpressionVisitor());
        VISITOR.put(LikeExpression.class, new LikeExpressionVisitor());
        VISITOR.put(LimitPageItem.class, new LimitPageItemVisitor());
        VISITOR.put(OffsetPageItem.class, new OffsetPageItemVisitor());
        VISITOR.put(OnDuplicateInsert.class, new OnDuplicateInsertVisitor());
        VISITOR.put(PriorityExpression.class, new PriorityExpressionVisitor());
        VISITOR.put(SelectAllItem.class, new SelectAllItemVisitor());
        VISITOR.put(SimpleDelete.class, new SimpleDeleteVisitor());
        VISITOR.put(SimpleInsert.class, new SimpleInsertVisitor());
        VISITOR.put(SimpleMerge.class, new SimpleMergeVisitor());
        VISITOR.put(SimpleTable.class, new SimpleTableVisitor());
        VISITOR.put(SimpleUpdate.class, new SimpleUpdateVisitor());
        VISITOR.put(SubIndexItem.class, new SubIndexItemVisitor());
        VISITOR.put(TableColumnItem.class, new TableColumnItemVisitor());
        VISITOR.put(UnionSelectItem.class, new UnionSelectItemVisitor());
        VISITOR.put(UnionSelect.class, new UnionSelectVisitor());
        VISITOR.put(UnionTableTable.UnionTableItem.class, new UnionTableItemVisitor());
        VISITOR.put(UnionTableTable.class, new UnionTableTableVisitor());
        VISITOR.put(UpdateMergeOperator.class, new UpdateMergeOperatorVisitor());
        VISITOR.put(WhenMatchedThenOperatorItem.class, new WhenMatchedThenOperatorItemVisitor());
        VISITOR.put(WhenThenItem.class, new WhenThenItemVisitor());
    }

    public static String toSql(Item item) {
        final AstVisitor astVisitor = VISITOR.get(item.getClass());
        if (Optional.ofNullable(astVisitor).isPresent()) {
            return astVisitor.visitor(item);
        } else {
            throw new RuntimeException("未实现");
        }
    }


    public static String toStringCommon(Item item) {
        StringBuilder stringBuffer = new StringBuilder();
        if (isNotEmpty(item.getAs())) {
            stringBuffer.append(SPACE).append(item.getAs());
        }
        if (isNotEmpty(item.getAlias())) {
            stringBuffer.append(SPACE).append(item.getAlias());
        }
        return stringBuffer.toString();
    }

    public static boolean isNotEmpty(String str) {
        return !(str == null || str.trim() == "");
    }

}
