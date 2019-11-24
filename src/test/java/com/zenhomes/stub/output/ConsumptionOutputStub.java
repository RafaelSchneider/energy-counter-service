package com.zenhomes.stub.output;


import com.zenhomes.output.ConsumptionOutput;

public class ConsumptionOutputStub {
    public static ConsumptionOutput buildConsumptionOutput(){
        return new ConsumptionOutput(VillageConsumptionOutputStub.buildVillageConsumptions());
    }
}
