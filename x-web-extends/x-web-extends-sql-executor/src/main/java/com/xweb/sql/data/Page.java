package com.xweb.sql.data;

import java.util.ArrayList;
import java.util.List;

public class Page {

    private List<Row> rows;

    public Page(){
        this.rows = new ArrayList<>();
    }


    public void addRow(Row row){
        this.rows.add(row);
    }

    public void addRows(List<Row> rowList){
        this.rows.addAll(rowList);
    }

    public List<Row> getRows(){
        return this.rows;
    }

    public boolean isEmpty(){
        return this.rows.isEmpty();
    }


}
