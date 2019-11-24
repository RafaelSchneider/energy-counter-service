package com.zenhomes.mapper;

import com.zenhomes.model.VillageConsumption;
import com.zenhomes.output.VillageConsuptionOutput;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class VillageConsuptionMapper {

    public static List<VillageConsuptionOutput> mapToList(List<VillageConsumption> villageConsuptions){
        return villageConsuptions.stream()
                .map(VillageConsuptionMapper::map)
                .collect(Collectors.toList());
    }

    private static VillageConsuptionOutput map (VillageConsumption villageConsuption){
        return VillageConsuptionOutput.builder()
                .village_name(villageConsuption.getVillageName())
                .consumption(villageConsuption.getConsumption().setScale(2, BigDecimal.ROUND_UP))
                .build();
    }
}
