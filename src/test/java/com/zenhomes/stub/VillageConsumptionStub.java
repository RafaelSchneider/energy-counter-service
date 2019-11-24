package com.zenhomes.stub;

import com.zenhomes.model.VillageConsumption;
import com.zenhomes.output.VillageConsumptionOutput;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

/**
 * User: schneider
 * Date: 24/11/19
 * Time: 01:06
 */
public class VillageConsumptionStub {

    public static List<VillageConsumption> buildVillageConsumptions(){
        return Collections.singletonList(buildVillageConsumption());
    }

    private static VillageConsumption buildVillageConsumption(){
        VillageConsumption villageConsumption = new VillageConsumption();
        villageConsumption.setVillageName("Village Name");
        villageConsumption.setConsumption(BigDecimal.TEN);
        return villageConsumption;
    }
}
