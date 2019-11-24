package com.zenhomes.stub.output;

import com.zenhomes.output.CounterOutput;

/**
 * User: schneider
 * Date: 24/11/19
 * Time: 00:11
 */
public class CounterOutputStub {

    public static CounterOutput buildCounterOutput(){
        return CounterOutput.builder()
                .id("1")
                .village_name("Village Test")
                .build();
    }
}
