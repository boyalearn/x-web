package com.xweb.sql.core.common.insert;

import com.xweb.sql.core.common.Select;
import lombok.Data;


@Data
public class AsQueryInsert extends AbstractInsert {

    private Select query;
}
