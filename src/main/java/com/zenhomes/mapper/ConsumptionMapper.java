package com.zenhomes.mapper;

import com.zenhomes.input.ConsumptionInput;
import com.zenhomes.model.Consumption;

import java.time.LocalDateTime;

public class ConsumptionMapper {

    public static Consumption map(ConsumptionInput consuption){
        return Consumption.builder()
                .id_counter(Long.valueOf(consuption.getCounter_id()))
                .amount(consuption.getAmount())
                .dateTime(LocalDateTime.now())
                .build();
    }
}
