package com.zenhomes.controller.v1;


import com.zenhomes.facade.CounterFacade;
import com.zenhomes.input.ConsumptionInput;
import com.zenhomes.output.ConsumptionOutput;
import com.zenhomes.output.CounterOutput;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/v1/village")
public class CounterController {

    private CounterFacade counterFacade;

    public CounterController(CounterFacade counterFacade) {
        this.counterFacade = counterFacade;
    }

    @ApiOperation(value = "Api that returns Counter by Id")
    @GetMapping("/counter")
    public CounterOutput getCounter(@RequestParam Long id){
        return counterFacade.getCounter(id);
    }

    @PostMapping("/counter_callback")
    public Object postConsuptions(@RequestBody ConsumptionInput consuption){
        counterFacade.postConsuption(consuption);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/consumption_report")
    public ConsumptionOutput getConsumptions(@NotNull @RequestParam int duration){
        return counterFacade.getConsumptions(duration);
    }
}

