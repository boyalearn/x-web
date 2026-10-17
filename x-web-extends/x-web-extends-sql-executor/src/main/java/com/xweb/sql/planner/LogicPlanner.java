package com.xweb.sql.planner;

import com.xweb.sql.core.StringUtil;
import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.Statement;
import com.xweb.sql.core.common.Table;
import com.xweb.sql.core.common.select.BaseSelect;
import com.xweb.sql.core.common.table.SimpleTable;
import com.xweb.sql.core.common.table.UnionTableTable;
import com.xweb.sql.core.common.util.CommonSqlUtil;
import com.xweb.sql.operator.*;
import com.xweb.sql.operator.exception.UnknownOperatorException;

import java.util.List;
import java.util.Optional;

public class LogicPlanner {

    private String sql;

    public LogicPlanner(String sql){
        this.sql = sql;
    }

    public SqlOperator planQuery(){
        final Statement statement = CommonSqlUtil.commonSqlToAST(this.sql);
        if(statement instanceof BaseSelect){
            return planBasicSelect((BaseSelect)statement);
        }
        throw new UnknownOperatorException("unknown implement operator!");
    }

    private SqlOperator planBasicSelect(BaseSelect baseSelect){
        final List<Table> tableItems = baseSelect.getTableItems();
        SqlOperator firstOperator = null;
        if(Optional.ofNullable(tableItems).isPresent() && !tableItems.isEmpty()){
            final Table first = tableItems.get(0);
            firstOperator = planTable(first);
            if(tableItems.size()>1){
                for (int i = 1; i < tableItems.size(); i++) {
                    final SqlOperator secondOperator = planTable(tableItems.get(i));
                    firstOperator = new JoinTableOperator(firstOperator,secondOperator, JoinTableOperator.JoinType.INNER_JOIN,
                            PlannerUtil.analysisJoinConditionMap(((AbstractOperator)firstOperator).getAlias(),((AbstractOperator)secondOperator).getAlias(),baseSelect.getWhereExpression()));
                }
            }
            return firstOperator;
        }

        return new ProjectOperator();

    }

    private SqlOperator planTable(Table table){
        if(table instanceof SimpleTable){
            SimpleTable simpleTable = (SimpleTable) table;
            final TableScanOperator tableScanOperator = new TableScanOperator(simpleTable.getTableName(),simpleTable.getAlias());
            tableScanOperator.setAlias(simpleTable.getAlias());
            return tableScanOperator;
        }else if (table instanceof BaseSelect){
            return planBasicSelect((BaseSelect) table);
        }else if(table instanceof UnionTableTable){
            UnionTableTable unionTableTable=(UnionTableTable) table;
            final List<UnionTableTable.UnionTableItem> unionTableItems = unionTableTable.getUnionTableItems();
            SqlOperator sqlOperator;
            final SqlOperator leftOperator = planItem(unionTableTable.getLeft());
            final UnionTableTable.UnionTableItem unionTableItem = unionTableItems.get(0);
            sqlOperator = new UnionOperator(leftOperator,planItem(unionTableItem), StringUtil.isEmpty(unionTableItem.getAll())?Boolean.FALSE:Boolean.TRUE);
            for (int i = 1; i < unionTableItems.size(); i++) {
                sqlOperator = new UnionOperator(sqlOperator,planItem(unionTableItem), StringUtil.isEmpty(unionTableItem.getAll())?Boolean.FALSE:Boolean.TRUE);
            }
            return sqlOperator;
        }
        else{
            throw new UnknownOperatorException("unknown implement operator!");
        }
    }


    private SqlOperator planItem(Item item){
        throw new UnknownOperatorException("unknown implement operator!");
    }


}
