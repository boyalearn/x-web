package com.xweb.sql.operator;

import com.xweb.sql.GlobalConfig;
import com.xweb.sql.core.common.BooleanExpression;
import com.xweb.sql.result.Page;
import lombok.Getter;
import lombok.Setter;

import java.io.*;
import java.util.*;

@Getter
@Setter
public class TableScanOperator extends AbstractOperator{

    private String tableName;

    private List<String> columns;

    private List<String> tableHeader;

    private BooleanExpression booleanExpression;

    private File file;

    BufferedReader br;

    public TableScanOperator(String tableName){
        this.tableName = tableName;
        this.file = new File(GlobalConfig.path+this.tableName+".csv");
        try {
            br = new BufferedReader(new FileReader(this.file));
            String line = br.readLine();
            final String[] split = line.split(",");
            this.tableHeader = new ArrayList(Arrays.asList(split));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void open() {
        try {
            br = new BufferedReader(new FileReader(this.file));
            String line = br.readLine();
            final String[] split = line.split(",");
            this.tableHeader = new ArrayList(Arrays.asList(split));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public Page next() {
        try {
            String line = br.readLine();
            final String[] split = line.split(",");
            Map<String,String> data = new HashMap<>();
            for (int i = 0; i < tableHeader.size(); i++) {
                data.put(tableHeader.get(i),split[i]);
            }
            return new Page();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void close() {

    }
}
