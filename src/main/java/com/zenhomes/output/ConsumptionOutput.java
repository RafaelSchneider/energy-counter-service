package com.zenhomes.output;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ConsumptionOutput {
    private List<VillageConsumptionOutput> villages;
}
