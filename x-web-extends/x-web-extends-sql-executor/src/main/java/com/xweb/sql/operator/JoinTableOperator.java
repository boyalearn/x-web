package com.xweb.sql.operator;

import com.xweb.sql.core.common.BooleanExpression;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class JoinTableOperator implements SqlOperator{

    private SqlOperator leftOperator;

    private SqlOperator rightOperator;

    private JoinType joinType;

    private BooleanExpression booleanExpression;

    @Override
    public void open() {

    }

    @Override
    public Object next() {

        if(joinType == JoinType.LEFT_JOIN){

        }else if(joinType == JoinType.INNER_JOIN){
            final Object left = leftOperator.next();
        }

        return null;
    }

    @Override
    public void close() {

    }

    public static enum JoinType{
        LEFT_JOIN,RIGHT_JOIN,OUTER_JOIN,INNER_JOIN;
    }
}
