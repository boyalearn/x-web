package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.ast.AstUtil;
import com.xweb.sql.core.common.item.CaseItem;
import com.xweb.sql.core.common.item.WhenThenItem;

import java.util.List;

public class CaseItemVisitor implements AstVisitor {
    @Override
    public String visitor(Item item) {
        CaseItem caseItem = (CaseItem) item;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(caseItem.getCaseName() + AstUtil.SPACE);
        final List<WhenThenItem> whenThenItems = caseItem.getWhenThenItems();
        for (WhenThenItem whenThenItem : whenThenItems) {
            stringBuffer.append(AstUtil.toSql(whenThenItem));
        }
        stringBuffer.append(AstUtil.SPACE + caseItem.getElseName() + AstUtil.SPACE);
        stringBuffer.append(AstUtil.toSql(caseItem.getElseResult()));
        stringBuffer.append(caseItem.getEnd());
        stringBuffer.append(AstUtil.toStringCommon((Item) caseItem));
        return stringBuffer.toString();
    }
}
