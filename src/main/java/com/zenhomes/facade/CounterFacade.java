package com.zenhomes.facade;


import com.zenhomes.input.ConsumptionInput;
import com.zenhomes.mapper.ConsumptionMapper;
import com.zenhomes.mapper.CounterMapper;

import com.zenhomes.mapper.VillageConsuptionMapper;
import com.zenhomes.output.ConsumptionOutput;
import com.zenhomes.output.CounterOutput;
import com.zenhomes.service.CounterService;
import org.springframework.stereotype.Component;

@Component
public class CounterFacade {

    private CounterService counterService;

    public CounterFacade(CounterService counterService) {
        this.counterService = counterService;
    }

    public CounterOutput getCounter(Long id){
        return CounterMapper.map(counterService.getCounterById(id));
    }

    public void postConsuption(ConsumptionInput consumption){
        counterService.postConsumption(ConsumptionMapper.map(consumption));
    }

    public ConsumptionOutput getConsumptions(int registrationTime){
        return new ConsumptionOutput(VillageConsuptionMapper
                .mapToList(counterService.getConsumptions(registrationTime)));
    }
}
