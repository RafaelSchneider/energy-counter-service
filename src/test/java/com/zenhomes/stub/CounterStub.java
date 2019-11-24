package com.zenhomes.stub;

import com.zenhomes.model.Counter;

public class CounterStub {

    public static Counter buildCounter(){
        Counter counter = new Counter();
        counter.setId(1L);
        counter.setName("Village Test");
        return counter;
    }
}
