package com.xweb.sql;

import com.xweb.sql.operator.SqlOperator;
import com.xweb.sql.planner.LogicPlanner;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Getter
public class SqlExecutor {

    private LogicPlanner logicPlanner;

    private List<Object> outPut;

    public void execute(String sql){
        logicPlanner = new LogicPlanner(sql);
        final SqlOperator sqlOperator = logicPlanner.planQuery();
        this.outPut = new ArrayList<>();
        while (true){
            final Object next = sqlOperator.next();
            if(Optional.ofNullable(next).isPresent()){
                outPut.add(next);
            }
            break;
        }
    }
}
