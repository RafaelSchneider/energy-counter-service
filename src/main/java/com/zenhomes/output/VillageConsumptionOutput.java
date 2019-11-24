package com.zenhomes.output;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VillageConsumptionOutput {
    private String village_name;
    private BigDecimal consumption;
}
