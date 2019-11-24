package com.zenhomes.stub.input;

import com.zenhomes.input.ConsumptionInput;

import java.math.BigDecimal;

public class ConsumptionInputStub {

    public static ConsumptionInput buildConsumptionInput(){
        return ConsumptionInput.builder()
                .counter_id("1")
                .amount(BigDecimal.TEN)
                .build();
    }
}
