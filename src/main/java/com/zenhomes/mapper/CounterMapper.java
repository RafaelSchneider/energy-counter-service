package com.zenhomes.mapper;

import com.zenhomes.model.Counter;
import com.zenhomes.output.CounterOutput;

public class CounterMapper {

    public static CounterOutput map(Counter counter){
        return CounterOutput.builder()
                .id(counter.getId().toString())
                .village_name(counter.getName())
                .build();
    }
}
