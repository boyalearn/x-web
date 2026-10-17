package com.xweb.sql.parser;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.Statement;
import com.xweb.sql.core.common.item.TableColumnItem;
import com.xweb.sql.core.common.select.BaseSelect;
import com.xweb.sql.core.common.util.CommonSqlUtil;
import com.xweb.sql.metadata.Table;
import com.xweb.sql.metadata.select.Select;
import com.xweb.sql.metadata.select.SelectColumnItem;

import java.util.List;

public class DefaultSqlParser implements SqlParser{


    @Override
    public Select parse(String sql) {
        final Statement statement = CommonSqlUtil.commonSqlToAST(sql);
        if(statement instanceof BaseSelect){
            return parseBasicSelect((BaseSelect)statement);
        }
        throw new RuntimeException();
    }

    private Select parseBasicSelect(BaseSelect baseSelect) {
        Select select = new Select();
        final List<Item> selectItems = baseSelect.getSelectItems();
        for (Item selectItem : selectItems) {
            if(selectItem instanceof TableColumnItem){
                TableColumnItem tableColumnItem = (TableColumnItem)selectItem;
                select.getSelectItems().add(new SelectColumnItem(new Table("",tableColumnItem.getTableName()),
                        tableColumnItem.getColumnName()));
            }
        }
        return select;
    }
}
