package com.xweb.sql.core.common.page;

import com.xweb.sql.core.common.AbstractItem;
import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.Page;
import lombok.Data;

@Data
public class OffsetPageItem  extends AbstractItem implements Page {

    private String offset;

    private Item start;

    private String tagStart;

    private String fetch;

    private String tagFetch;

    private Item row;

    private String tagRow;

    private String tagLast;


}
