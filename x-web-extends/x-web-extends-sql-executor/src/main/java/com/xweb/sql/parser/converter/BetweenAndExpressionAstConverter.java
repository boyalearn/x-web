package com.xweb.sql.parser.converter;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.expression.BetweenAndExpression;
import com.xweb.sql.core.common.item.TableColumnItem;
import com.xweb.sql.meta.Node;
import com.xweb.sql.meta.expression.BetweenExpression;
import com.xweb.sql.meta.expression.ColumnValueExpression;
import com.xweb.sql.meta.item.Column;
import com.xweb.sql.meta.item.SimpleTableItem;
import com.xweb.sql.parser.converter.util.AstConverterUtil;

import java.util.Optional;

public class BetweenAndExpressionAstConverter implements AstConverter {
    @Override
    public Node convert(Item item) {
        BetweenAndExpression betweenAndExpression = (BetweenAndExpression) item;
        final com.xweb.sql.core.common.Item left = betweenAndExpression.getLeft();
        com.xweb.sql.core.common.Item lower = betweenAndExpression.getLower();
        com.xweb.sql.core.common.Item upper = betweenAndExpression.getUpper();
        if (left instanceof TableColumnItem) {
            TableColumnItem tableColumnItem = (TableColumnItem) left;
            Column column = new Column(new SimpleTableItem("", tableColumnItem.getTableName()), tableColumnItem.getColumnName());

            return new ColumnValueExpression(column,
                    Optional.ofNullable(betweenAndExpression.getNot()).isPresent() ? "!=" : "=",
                    new BetweenExpression(AstConverterUtil.convert(lower), ">=", AstConverterUtil.convert(upper), "<="));
        } else {
            throw new RuntimeException("未实现");
        }
    }
}
