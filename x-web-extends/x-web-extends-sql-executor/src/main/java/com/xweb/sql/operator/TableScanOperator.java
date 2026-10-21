package com.xweb.sql.operator;

import com.xweb.sql.GlobalConfig;
import com.xweb.sql.core.StringUtil;
import com.xweb.sql.core.common.BooleanExpression;
import com.xweb.sql.data.DefaultSlice;
import com.xweb.sql.data.Page;
import com.xweb.sql.data.Row;
import com.xweb.sql.meta.node.ColumnNode;
import com.xweb.sql.meta.table.SimpleTableNode;
import lombok.Getter;
import lombok.Setter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
public class TableScanOperator extends AbstractOperator {

    private String tableName;

    private String alias;

    private List<String> columns;

    private List<String> tableHeader;

    private BooleanExpression booleanExpression;

    private File file;

    BufferedReader br;

    public TableScanOperator(String tableName, String alias) {
        this.tableName = tableName;
        this.alias = alias;
        this.file = new File(GlobalConfig.path + this.tableName + ".csv");
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Page next() {
        Page page = new Page();
        try {
            String line = br.readLine();
            if (StringUtil.isEmpty(line)) {
                return page;
            }
            final String[] split = line.split(",");
            Row row = new Row();
            for (int i = 0; i < tableHeader.size(); i++) {
                DefaultSlice slice = new DefaultSlice(new ColumnNode(new SimpleTableNode(tableName, alias), tableHeader.get(i)), "String", split[i]);
                row.addSlice(slice);
            }
            page.addRow(row);
            return page;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return page;
    }

    @Override
    public void close() {

    }
}
