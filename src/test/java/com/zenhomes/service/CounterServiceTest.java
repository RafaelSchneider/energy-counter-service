package com.zenhomes.service;

import com.zenhomes.model.Counter;
import com.zenhomes.model.VillageConsumption;
import com.zenhomes.repository.ConsumptionRepository;
import com.zenhomes.repository.CounterRepository;
import com.zenhomes.stub.ConsumptionStub;
import com.zenhomes.stub.CounterStub;
import com.zenhomes.stub.VillageConsumptionStub;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CounterServiceTest {

    @InjectMocks
    private CounterService counterService;
    @Mock
    private CounterRepository counterRepository;
    @Mock
    private ConsumptionRepository consumptionRepository;

    @Test
    public void shouldReturnCounter(){
        Long id = 1L;

        when(counterRepository.getCounter(id)).thenReturn(CounterStub.buildCounter());

        Counter counterById = counterService.getCounterById(id);
        Assert.assertEquals(CounterStub.buildCounter().getId(), counterById.getId());
        Assert.assertEquals(CounterStub.buildCounter().getName(), counterById.getName());
    }

    @Test(expected = Exception.class)
    public void shouldReturnExceptionWhenNotFoundId(){
        Long id = 1L;

        when(counterRepository.getCounter(id)).thenReturn(null);
        counterService.getCounterById(id);
    }

    @Test
    public void shouldBeWithAnyReturnWhenPostConsumption(){
        int duration = 1;

        doNothing().
                when(consumptionRepository)
                .postConsumption(ConsumptionStub.buildConsumption());

        counterService.getConsumptions(duration);
    }

    @Test
    public void shouldReturnListOfConsumptions(){
        int duration = 1;
        when(consumptionRepository.getConsumptions(duration))
                .thenReturn(VillageConsumptionStub.buildVillageConsumptions());
        List<VillageConsumption> consumptions = counterService.getConsumptions(duration);
        Assert.assertEquals(VillageConsumptionStub.buildVillageConsumptions(), consumptions);
    }

    @Test(expected = Exception.class)
    public void shoulReturnExceptionWhenNotFoundConsumptions(){
        int duration = 1;

        when(consumptionRepository.getConsumptions(duration))
                .thenReturn(null);

        counterService.getConsumptions(duration);

    }
}