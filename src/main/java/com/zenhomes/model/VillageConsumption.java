package com.zenhomes.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VillageConsumption {
    private String villageName;
    private BigDecimal consumption;
}
