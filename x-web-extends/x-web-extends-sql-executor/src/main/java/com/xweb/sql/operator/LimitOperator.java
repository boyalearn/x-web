package com.xweb.sql.operator;

import lombok.AllArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
public class LimitOperator implements SqlOperator{

    private SqlOperator operator;

    private Long limit;

    private Long index;

    @Override
    public void open() {

    }

    @Override
    public Object next() {
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
