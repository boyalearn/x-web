package com.xweb.sql.core.base.express;

import com.xweb.sql.core.base.WhereItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BetweenAndExpression implements WhereItem {

    private Object left;

    private String not;

    private String between;

    private Object lower;

    private String and;

    private Object upper;
}
