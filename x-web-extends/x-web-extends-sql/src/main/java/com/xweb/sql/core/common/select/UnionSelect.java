package com.xweb.sql.core.common.select;

import com.xweb.sql.core.common.AbstractItem;
import com.xweb.sql.core.common.Select;
import com.xweb.sql.core.common.item.UnionSelectItem;
import lombok.Data;

import java.util.List;


@Data
public class UnionSelect extends AbstractItem implements Select {

    private Select select;

    private List<UnionSelectItem> unionSelectItems;
}
