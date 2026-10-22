package com.xweb.sql.parser.converter.util;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.expression.BetweenAndExpression;
import com.xweb.sql.core.common.expression.CommonConditionExpression;
import com.xweb.sql.core.common.expression.PriorityExpression;
import com.xweb.sql.core.common.item.ConstantItem;
import com.xweb.sql.core.common.item.SelectAllItem;
import com.xweb.sql.core.common.item.TableColumnItem;
import com.xweb.sql.core.common.order.DefaultOrderItem;
import com.xweb.sql.core.common.select.BaseSelect;
import com.xweb.sql.core.common.table.SimpleTable;
import com.xweb.sql.meta.Node;
import com.xweb.sql.parser.converter.AstConverter;
import com.xweb.sql.parser.converter.BaseSelectAstConverter;
import com.xweb.sql.parser.converter.BetweenAndExpressionAstConverter;
import com.xweb.sql.parser.converter.CommonConditionExpressionAstConverter;
import com.xweb.sql.parser.converter.ConstantItemAstConverter;
import com.xweb.sql.parser.converter.DefaultOrderItemAstConverter;
import com.xweb.sql.parser.converter.PriorityExpressionConverter;
import com.xweb.sql.parser.converter.SelectAllItemConverter;
import com.xweb.sql.parser.converter.SimpleTableConverter;
import com.xweb.sql.parser.converter.TableColumnItemAstConverter;

import java.util.HashMap;
import java.util.Map;

public class NodeUtil {

    public static final String EQ = "=";
    public static final String NEQ = "!=";
    public static final String GT = ">";
    public static final String EGT = ">=";
    public static final String LT = "<";
    public static final String ELT = "<=";

    private static final Map<Class<?>, AstConverter> CONVERTER = new HashMap<>();

    static {
        CONVERTER.put(BaseSelect.class, new BaseSelectAstConverter());
        CONVERTER.put(BetweenAndExpression.class, new BetweenAndExpressionAstConverter());
        CONVERTER.put(ConstantItem.class, new ConstantItemAstConverter());
        CONVERTER.put(CommonConditionExpression.class, new CommonConditionExpressionAstConverter());
        CONVERTER.put(TableColumnItem.class, new TableColumnItemAstConverter());
        CONVERTER.put(SelectAllItem.class, new SelectAllItemConverter());
        CONVERTER.put(SimpleTable.class, new SimpleTableConverter());
        CONVERTER.put(PriorityExpression.class, new PriorityExpressionConverter());
        CONVERTER.put(DefaultOrderItem.class, new DefaultOrderItemAstConverter());
    }

    public static Node convert(Item item) {
        AstConverter astConverter = CONVERTER.get(item.getClass());
        if (null == astConverter) {
            throw new RuntimeException();
        }
        return astConverter.convert(item);
    }
}
