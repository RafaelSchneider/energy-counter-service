package com.zenhomes.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

//@Entity
@Data
//@Table(name = "counters")
@AllArgsConstructor
@NoArgsConstructor
public class VillageConsumption {
    //@Column(name = "village_name")
    private String villageName;
    //@Column(name = "amount")
    private BigDecimal consumption;
}
