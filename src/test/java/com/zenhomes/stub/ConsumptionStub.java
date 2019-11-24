package com.zenhomes.stub;

import com.zenhomes.model.Consumption;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ConsumptionStub {

    public static Consumption buildConsumption() {

        return Consumption.builder()
                .id(null)
                .id_counter(1L)
                .dateTime(LocalDateTime.now())
                .amount(BigDecimal.TEN)
                .build();
    }
}
