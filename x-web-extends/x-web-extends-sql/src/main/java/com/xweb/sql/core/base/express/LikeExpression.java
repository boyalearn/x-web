package com.xweb.sql.core.base.express;

import com.xweb.sql.core.base.WhereItem;
import lombok.Data;

@Data
public class LikeExpression implements WhereItem {

    private Object left;

    private String not;

    private String like;

    private String pattern;
}
