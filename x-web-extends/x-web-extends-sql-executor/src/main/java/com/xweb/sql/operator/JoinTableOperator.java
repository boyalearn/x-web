package com.xweb.sql.operator;

import com.xweb.sql.core.common.BooleanExpression;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.val;

import java.util.Map;
import java.util.Set;

@AllArgsConstructor
@Getter
@Setter
public class JoinTableOperator extends AbstractOperator{

    private SqlOperator leftOperator;

    private SqlOperator rightOperator;

    private JoinType joinType;

    private Map<String,String> conditionMap;

    @Override
    public void open() {

    }

    @Override
    public Object next() {

        if(joinType == JoinType.LEFT_JOIN){

        }else if(joinType == JoinType.INNER_JOIN){
            final Map left = (Map)leftOperator.next();
            rightOperator.open();
            Map right = (Map) rightOperator.next();
            while (null != right){
                final Set<String> keys = conditionMap.keySet();
                for (String key : keys) {
                    if(left.get(key).equals(right.get(conditionMap.get(key)))){
                        return left;
                    }
                }
                right = (Map)rightOperator.next();
            }
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
