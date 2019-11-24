package com.zenhomes.mapper;

import com.zenhomes.model.Consumption;
import com.zenhomes.stub.ConsumptionStub;
import com.zenhomes.stub.input.ConsumptionInputStub;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ConsumptionMapperTest {

    @Test
    public void shouldReceivedConsumptionInputandReturnConsumption(){
        Consumption consumption = ConsumptionMapper.map(ConsumptionInputStub.buildConsumptionInput());
        Assert.assertEquals(ConsumptionStub.buildConsumption().getId(), consumption.getId());
        Assert.assertEquals(ConsumptionStub.buildConsumption().getId_counter(), consumption.getId_counter());
        Assert.assertEquals(ConsumptionStub.buildConsumption().getAmount(), consumption.getAmount());
        Assert.assertEquals(ConsumptionStub.buildConsumption().getDateTime().getDayOfMonth(),
                consumption.getDateTime().getDayOfMonth());

    }

}