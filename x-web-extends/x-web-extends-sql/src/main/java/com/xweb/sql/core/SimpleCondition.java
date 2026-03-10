package com.xweb.sql.core;

import com.xweb.sql.core.select.SelectItem;
import lombok.Data;

@Data
public class SimpleCondition implements Condition {

    private SelectItem item;

    private String condition;

    private Object value;

    public String toString() {
        return this.item + this.condition + this.value;
    }
}
