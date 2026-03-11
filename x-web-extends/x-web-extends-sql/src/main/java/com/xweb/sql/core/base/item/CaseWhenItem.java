package com.xweb.sql.core.base.item;

import com.xweb.sql.core.base.Item;
import com.xweb.sql.core.base.express.ConditionAndResult;
import lombok.Data;

import java.util.List;

@Data
public class CaseWhenItem implements Item {

    private List<ConditionAndResult> conditionResults;

    private Object elseResult;

    private String as;

    private String aliasName;
}
