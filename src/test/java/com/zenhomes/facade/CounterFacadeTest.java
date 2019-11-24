package com.zenhomes.facade;

import com.zenhomes.model.VillageConsumption;
import com.zenhomes.output.CounterOutput;
import com.zenhomes.service.CounterService;
import com.zenhomes.stub.output.CounterOutputStub;
import com.zenhomes.stub.CounterStub;
import com.zenhomes.stub.VillageConsumptionStub;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class CounterFacadeTest {

    @InjectMocks
    private CounterFacade counterFacade;

    @Mock
    private CounterService counterService;

    @Test
    public void shouldReturnCounterOutput() {
        Long id = 1L;
        when(counterService.getCounterById(id)).thenReturn(CounterStub.buildCounter());
        CounterOutput counter = counterFacade.getCounter(id);
        Assert.assertEquals(counter.getId(), CounterOutputStub.buildCounterOutput().getId());
        Assert.assertEquals(counter.getVillage_name(), CounterOutputStub.buildCounterOutput().getVillage_name());
    }

    @Test
    public void shouldReturnConsumptionOutput(){
        Integer registrationTime = 1;
        when(counterService.getConsumptions(registrationTime))
                .thenReturn(VillageConsumptionStub.buildVillageConsumptions());
        List<VillageConsumption> consumptions = counterService.getConsumptions(registrationTime);
        Assert.assertEquals(consumptions, VillageConsumptionStub.buildVillageConsumptions());

    }

}