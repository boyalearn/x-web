package com.xweb.sql.core.select;

import lombok.Data;

@Data
public class ColumnIndexItem implements SelectItem {

    private String name;

    private int[] indexArray;

    public String toString() {
        StringBuffer param = new StringBuffer(indexArray[0]+"");
        if (indexArray.length > 1) {
            for (int i = 1; i < indexArray.length; i++) {
                param.append("," + indexArray[i]);
            }
        }
        return name + "[" + param + "]";
    }
}
