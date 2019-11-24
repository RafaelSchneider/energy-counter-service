package com.zenhomes.mapper;

import com.zenhomes.output.CounterOutput;
import com.zenhomes.stub.CounterStub;
import com.zenhomes.stub.output.CounterOutputStub;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CounterMapperTest {

    @Test
    public void shouldReceivedCounterAndReturnCounterOutput(){
        CounterOutput counterOutput = CounterMapper.map(CounterStub.buildCounter());
        Assert.assertEquals(CounterOutputStub.buildCounterOutput().getId(), counterOutput.getId());
        Assert.assertEquals(CounterOutputStub.buildCounterOutput().getVillage_name() ,
                counterOutput.getVillage_name());
    }
}