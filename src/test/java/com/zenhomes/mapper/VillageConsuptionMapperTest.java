package com.zenhomes.mapper;

import com.zenhomes.output.VillageConsumptionOutput;
import com.zenhomes.stub.VillageConsumptionStub;
import com.zenhomes.stub.output.VillageConsumptionOutputStub;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class VillageConsuptionMapperTest {

    @Test
    public void shouldReceivedListOfVillageConsumptionAndReturnListOfVillageConsumptionOutput(){
        List<VillageConsumptionOutput> villageConsumptionOutputs =
                VillageConsuptionMapper.mapToList(VillageConsumptionStub.buildVillageConsumptions());
        Assert.assertEquals(VillageConsumptionOutputStub.buildVillageConsumptions() ,villageConsumptionOutputs);
    }
}