package com.zenhomes.mapper;

import com.zenhomes.model.VillageConsumption;
import com.zenhomes.output.VillageConsumptionOutput;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class VillageConsuptionMapper {

    public static List<VillageConsumptionOutput> mapToList(List<VillageConsumption> villageConsuptions){
        return villageConsuptions.stream()
                .map(VillageConsuptionMapper::map)
                .collect(Collectors.toList());
    }

    private static VillageConsumptionOutput map (VillageConsumption villageConsuption){
        return VillageConsumptionOutput.builder()
                .village_name(villageConsuption.getVillageName())
                .consumption(villageConsuption.getConsumption().setScale(2, BigDecimal.ROUND_UP))
                .build();
    }
}
