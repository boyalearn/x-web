package com.xweb.sql.core.common.item;

import com.xweb.sql.core.common.Item;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ConstantItem implements Item {
    private String constant;

    private String as;

    private String alias;


    public ConstantItem(String constant){
        this.constant = constant;
    }
}
