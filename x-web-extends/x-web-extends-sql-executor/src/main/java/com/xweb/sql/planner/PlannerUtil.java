package com.xweb.sql.planner;

import com.xweb.sql.core.common.BooleanExpression;
import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.expression.CommonConditionExpression;
import com.xweb.sql.core.common.item.TableColumnItem;

import java.util.HashMap;
import java.util.Map;

public class PlannerUtil {

    public static Map<String,String> analysisJoinConditionMap(String tableNameA,String tableNameB,BooleanExpression whereExpression){
        Map<String,String> condition = new HashMap<>();
        if(whereExpression instanceof CommonConditionExpression){
            _analysisJoinCondition(tableNameA,tableNameB,whereExpression,condition);
        }
        return condition;
    }


    private static void _analysisJoinCondition(String tableNameA,String tableNameB,BooleanExpression whereExpression,Map<String,String> condition){
        if(whereExpression instanceof CommonConditionExpression){
            CommonConditionExpression commonConditionExpression=(CommonConditionExpression) whereExpression;
            final Item left = commonConditionExpression.getLeft();
            final Item right = commonConditionExpression.getRight();
            if(left instanceof CommonConditionExpression){
                _analysisJoinCondition(tableNameA,tableNameB,(CommonConditionExpression)left,condition);
            }
            if(right instanceof CommonConditionExpression){
                _analysisJoinCondition(tableNameA,tableNameB,(CommonConditionExpression)right,condition);
            }
            if(left instanceof TableColumnItem && right instanceof TableColumnItem){
                TableColumnItem leftTableColumnItem = (TableColumnItem) left;
                TableColumnItem rightTableColumnItem = (TableColumnItem) right;
                if(leftTableColumnItem.getTableName().equals(tableNameA) && rightTableColumnItem.getTableName().equals(tableNameB)){
                    condition.put(leftTableColumnItem.getColumnName(),rightTableColumnItem.getColumnName());
                }else if(leftTableColumnItem.getTableName().equals(tableNameB) && rightTableColumnItem.getTableName().equals(tableNameA)){
                    condition.put(rightTableColumnItem.getColumnName(),leftTableColumnItem.getColumnName());
                }else{
                    return;
                }
            }
        }
    }
}
