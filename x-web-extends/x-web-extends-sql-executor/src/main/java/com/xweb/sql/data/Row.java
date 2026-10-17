package com.xweb.sql.data;

import com.xweb.sql.core.StringUtil;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class Row {

    private static final String EMPTY_TABLE_NAME = "EMPTY";

    private List<Slice> slices;

    private Map<String,Map<String,Slice>> dic;

    public Row(){
        this.dic = new HashMap<>();
        this.slices = new ArrayList<>();
    }

    public void addSlice(Slice slice){
        String tableName = StringUtil.isEmpty(slice.getTable().getTableName())?EMPTY_TABLE_NAME:slice.getTable().getTableName();
        if(this.dic.get(tableName) == null){
            this.dic.put(tableName,new HashMap<>());
        }
        this.dic.get(tableName).put(slice.getColumn(),slice);
        this.slices.add(slice);
    }


    public void addSlices(List<Slice> slices){
        for (Slice slice : slices) {
            addSlice(slice);
        }
    }


    public Slice getSliceByColumnName(String tableName,String columnName){
        String name = StringUtil.isEmpty(tableName)?EMPTY_TABLE_NAME:tableName;
        if(dic.get(name) == null){
            for (Slice slice : this.slices) {
                if(slice.getTable().getAlias().equals(name)){
                    return slice;
                }
            }
        }
        return dic.get(name).get(columnName);
    }
}
