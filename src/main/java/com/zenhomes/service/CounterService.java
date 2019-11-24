package com.zenhomes.service;


import com.zenhomes.model.Consumption;
import com.zenhomes.model.Counter;
import com.zenhomes.model.VillageConsumption;
import com.zenhomes.repository.ConsumptionRepository;
import com.zenhomes.repository.CounterRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CounterService {

    private CounterRepository counterRepository;
    private ConsumptionRepository consumptionRepository;

    private static final String DATABASE_ERROR_MESSAGE = "Unexpected error. Database Failure.";

    public CounterService(CounterRepository counterRepository,
                          ConsumptionRepository consumptionRepository) {
        this.counterRepository = counterRepository;
        this.consumptionRepository = consumptionRepository;
    }

    public Counter getCounterById(Long id){
        Counter counter;
        try{
            counter = counterRepository.getCounter(id);
        }catch (Exception e) {
            throw new RuntimeException(DATABASE_ERROR_MESSAGE);
        }
        return Optional.ofNullable(counter)
                .orElseThrow(()-> new RuntimeException("Id Counter Not Found"));
    }

    public void postConsumption(Consumption consuption){
        try {
            consumptionRepository.postConsumption(consuption);
        }catch (Exception e){
            throw new RuntimeException(DATABASE_ERROR_MESSAGE);
        }
    }

    public List<VillageConsumption> getConsumptions(int registrationTime){
        List<VillageConsumption> villages;
        try {
            villages = consumptionRepository.getConsumptions(registrationTime);
        }catch (Exception e){
            throw new RuntimeException(DATABASE_ERROR_MESSAGE);
        }

        return Optional.ofNullable(villages)
                .orElseThrow(()-> new RuntimeException("Any consumption was found."));
    }
}
