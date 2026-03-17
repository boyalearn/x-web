package com.xweb.sql.core.convert;

import com.xweb.sql.core.common.Item;

import java.util.ArrayList;
import java.util.List;

public class CommonSqlFilterVisitor extends AbstractReplaceAstVisitor {
    private List<Filter> filters;

    public CommonSqlFilterVisitor() {
        this.filters = new ArrayList<>();
    }

    public void addFilter(Filter rewriteFilter) {
        this.filters.add(rewriteFilter);
    }

    @Override
    public Object visit(Object item) {
        Object object = super.visit(item);
        for (Filter filter : this.filters) {
            if (filter.support((Item) object)) {
                return filter.change((Item) object);
            }
        }
        return object;
    }
}
