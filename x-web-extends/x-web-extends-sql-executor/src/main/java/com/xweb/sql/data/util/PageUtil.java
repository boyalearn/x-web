package com.xweb.sql.data.util;

import com.xweb.sql.data.Page;
import com.xweb.sql.data.Row;
import com.xweb.sql.data.Slice;

import java.util.List;

public class PageUtil {
    public static void show(Page page){
        if(page.isEmpty()){
            System.out.println("no data");
        }
        final List<Row> rows = page.getRows();
        final Row first = rows.get(0);
        List<Slice> slices = first.getSlices();
        for (Slice slice : slices) {
            System.out.printf(slice.getColumn().getName()+" ");
        }
        System.out.println("");

        for (Row row : rows) {
            slices = row.getSlices();
            for (Slice slice : slices) {
                System.out.printf(slice.getData()+" ");
            }
            System.out.println("");
        }

    }
}
