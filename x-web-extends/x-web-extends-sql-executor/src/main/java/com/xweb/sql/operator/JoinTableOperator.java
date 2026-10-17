package com.xweb.sql.operator;

import com.xweb.sql.data.Page;
import com.xweb.sql.data.Row;
import com.xweb.sql.data.Slice;
import com.xweb.sql.metadata.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;
import java.util.Set;

@AllArgsConstructor
@Getter
@Setter
public class JoinTableOperator extends AbstractOperator{

    private SqlOperator leftOperator;

    private SqlOperator rightOperator;

    private JoinType joinType;

    private Map<Column,Column> conditionMap;

    @Override
    public void open() {

    }

    @Override
    public Page next() {
        Page page = new Page();
        if(joinType == JoinType.LEFT_JOIN){

        }else if(joinType == JoinType.INNER_JOIN){
            final Page leftPage = leftOperator.next();
            if(leftPage.isEmpty()){
                return page;
            }
            final List<Row> rows = leftPage.getRows();
            for (Row row : rows) {
                rightOperator.open();
                Page rightPage = rightOperator.next();
                if(rightPage.isEmpty()){
                    return page;
                }
                while (!rightPage.isEmpty()){
                    final List<Row> rightRows = rightPage.getRows();
                    for (Row rightRow : rightRows) {
                        final Set<Column> keys = conditionMap.keySet();
                        for (Column key : keys) {
                            final Slice leftSlice = row.getSliceByColumnName(key.getTable().getAlias(), key.getColumnName());
                            Column value = conditionMap.get(key);
                            final Slice rightSlice = rightRow.getSliceByColumnName(value.getTable().getAlias(), value.getColumnName());
                            if(leftSlice.getData().equals(rightSlice.getData())){
                                Row result = new Row();
                                result.addSlices(row.getSlices());
                                result.addSlices(rightRow.getSlices());
                                page.addRow(result);
                            }
                        }
                    }
                    rightPage=rightOperator.next();
                }
            }



        }

        return page;
    }

    @Override
    public void close() {

    }

    public static enum JoinType{
        LEFT_JOIN,RIGHT_JOIN,OUTER_JOIN,INNER_JOIN;
    }
}
