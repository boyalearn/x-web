package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.ast.AstUtil;
import com.xweb.sql.core.common.page.OffsetPageItem;

public class OffsetPageItemVisitor implements AstVisitor {
    @Override
    public String visitor(Item item) {
        OffsetPageItem offsetPageItem = (OffsetPageItem) item;
        StringBuffer sql = new StringBuffer();
        sql.append(offsetPageItem.getOffset());
        sql.append(AstUtil.SPACE);
        sql.append(AstUtil.toSql(offsetPageItem.getStart()));
        sql.append(AstUtil.SPACE);
        sql.append(offsetPageItem.getTagStart());
        sql.append(AstUtil.SPACE);
        sql.append(offsetPageItem.getFetch());
        sql.append(AstUtil.SPACE);
        sql.append(offsetPageItem.getTagFetch());
        sql.append(AstUtil.SPACE);
        sql.append(AstUtil.toSql(offsetPageItem.getRow()));
        sql.append(AstUtil.SPACE);
        sql.append(offsetPageItem.getTagRow());
        sql.append(AstUtil.SPACE);
        sql.append(offsetPageItem.getTagLast());
        return sql.toString();
    }
}
