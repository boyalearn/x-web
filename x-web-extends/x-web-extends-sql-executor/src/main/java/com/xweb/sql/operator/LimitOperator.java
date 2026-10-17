package com.xweb.sql.operator;

import com.xweb.sql.data.Page;
import lombok.AllArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
public class LimitOperator extends AbstractOperator{

    private SqlOperator operator;

    private Long limit;

    private Long index;

    @Override
    public void open() {

    }

    @Override
    public Page next() {
        final Object nextData = operator.next();

        if(index>=limit){
            return null;
        }

        if(Optional.ofNullable(nextData).isPresent()){
            index ++;
        }
        return null;
    }

    @Override
    public void close() {

    }
}
