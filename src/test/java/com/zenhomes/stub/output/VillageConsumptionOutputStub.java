package com.zenhomes.stub.output;

import com.zenhomes.output.VillageConsumptionOutput;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;


public class VillageConsumptionOutputStub {
    public static List<VillageConsumptionOutput> buildVillageConsumptions(){
        return Collections.singletonList(buildVillageConsumption());
    }
    private static VillageConsumptionOutput buildVillageConsumption(){
        VillageConsumptionOutput villageConsumption = new VillageConsumptionOutput();
        villageConsumption.setVillage_name("Village Name");
        villageConsumption.setConsumption(BigDecimal.TEN.setScale(2, BigDecimal.ROUND_UP));
        return villageConsumption;
    }
}
