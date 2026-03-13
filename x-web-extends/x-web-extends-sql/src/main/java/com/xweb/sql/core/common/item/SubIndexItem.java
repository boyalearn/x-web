package com.xweb.sql.core.common.item;

import com.xweb.sql.core.common.AbstractItem;
import lombok.Data;

import java.util.List;

@Data
public class SubIndexItem extends AbstractItem {

    private Object value;

    private List<Object> indexes;

}
