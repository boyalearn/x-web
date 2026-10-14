package com.xweb.sql.executor;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.Statement;
import com.xweb.sql.core.common.Table;
import com.xweb.sql.core.common.expression.PriorityExpression;
import com.xweb.sql.core.common.select.BaseSelect;
import com.xweb.sql.core.common.table.SimpleTable;
import com.xweb.sql.core.common.table.UnionTableTable;
import com.xweb.sql.core.common.util.CommonSqlUtil;
import com.xweb.sql.operator.JoinTableOperator;
import com.xweb.sql.operator.SqlOperator;
import com.xweb.sql.operator.TableScanOperator;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LogicPlain {
    public static void main(String[] args) {
        String sql = "select * from aabb c";
        new LogicPlain().plan(sql);
    }

    public List<SqlOperator> plan(String sql){
        List<SqlOperator> operators = new ArrayList<>();
        final Statement statement = CommonSqlUtil.commonSqlToAST(sql);
        doLogicPlan(statement,operators);
        return operators;
    }


    private void doLogicPlan(Item item, List<SqlOperator> operators){
        if(item instanceof BaseSelect){
            BaseSelect baseSelect = (BaseSelect) item;
            final List<Table> tableItems = baseSelect.getTableItems();
            if(Optional.ofNullable(tableItems).isPresent() && tableItems.size()>0){
                for (Table tableItem : tableItems) {
                    if(tableItem instanceof SimpleTable){
                        SimpleTable simpleTable = (SimpleTable)tableItem;
                        TableScanOperator tableScanOperator = new TableScanOperator(simpleTable.getTableName());
                        operators.add(tableScanOperator);
                    }else if(tableItem instanceof UnionTableTable){
                        UnionTableTable unionTableTable = (UnionTableTable) tableItem;
                        JoinTableOperator joinTableOperator = new JoinTableOperator(unionTableTable.getLeft().getAlias(),"");
                        operators.add(joinTableOperator);

                    }else if (tableItem instanceof PriorityExpression){

                    }else if(tableItem instanceof BaseSelect){

                    }
                }
            }
        }
    }



}
