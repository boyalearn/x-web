package com.xweb.sql.core.common.item;

import com.xweb.sql.core.common.Item;
import lombok.Data;

import java.util.List;

@Data
public class CaseItem implements Item {

    private String caseName;

    private List<WhenThenItem> whenThenItems;

    private String elseName;

    private Object elseResult;

    private String end;

    private String as;

    private String alias;
}
