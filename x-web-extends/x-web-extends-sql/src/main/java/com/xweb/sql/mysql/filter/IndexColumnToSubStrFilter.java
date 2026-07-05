package com.xweb.sql.mysql.filter;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.item.ConstantItem;
import com.xweb.sql.core.common.item.FunctionCallItem;
import com.xweb.sql.core.common.item.SubIndexItem;
import com.xweb.sql.core.common.select.BaseSelect;

import java.util.ArrayList;
import java.util.List;

/**
 * from informix
 */
public class IndexColumnToSubStrFilter implements MysqlFilter {

    private final static String NAME = "SUBSTR";

    @Override
    public boolean support(Item item) {
        if (item instanceof SubIndexItem) {
            return true;
        }
        return false;
    }

    @Override
    public Item change(Item item) {
        SubIndexItem subIndexItem = (SubIndexItem) item;
        FunctionCallItem functionCallItem = new FunctionCallItem();
        functionCallItem.setName(NAME);
        functionCallItem.setParams(new ArrayList<>());
        functionCallItem.getParams().add(subIndexItem.getValue());
        if (subIndexItem.getIndexes().size() == 1) {
            functionCallItem.getParams().addAll(subIndexItem.getIndexes());
        } else {
            final List<Item> indexes = subIndexItem.getIndexes();
            final Item end = indexes.get(indexes.size() - 1);
            final Item start = indexes.get(0);
            if (end instanceof ConstantItem && start instanceof ConstantItem) {
                int startIndex = Integer.valueOf(((ConstantItem) start).getConstant());
                int endIndex = Integer.valueOf(((ConstantItem) end).getConstant());

                functionCallItem.getParams().add(new ConstantItem(String.valueOf(startIndex)));
                functionCallItem.getParams().add(new ConstantItem(String.valueOf(endIndex - startIndex + 1)));

            } else {
                throw new RuntimeException("不支持的转换异常");
            }


        }
        return functionCallItem;
    }
}
