package com.zenhomes.controller.v1;


import com.zenhomes.facade.CounterFacade;
import com.zenhomes.input.ConsumptionInput;
import com.zenhomes.output.ConsumptionOutput;
import com.zenhomes.output.CounterOutput;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/village")
public class CounterController {

    private CounterFacade counterFacade;

    public CounterController(CounterFacade counterFacade) {
        this.counterFacade = counterFacade;
    }

    @GetMapping("/test")
    public ResponseEntity firstTest(){
        return ResponseEntity.ok("Ok");
    }

    @GetMapping("/counter")
    public CounterOutput getCounter(@RequestParam Long id){
        return counterFacade.getCounter(id);
    }

    @PostMapping("/counter_callback")
    public HttpStatus postConsuptions(@RequestBody ConsumptionInput consuption){
        counterFacade.postConsuption(consuption);
        return HttpStatus.NO_CONTENT;
    }

//    @GetMapping("/consumption_report")
//    public ResponseEntity<ConsumptionOutput> getConsumptions(@RequestParam int duration){
//        return ResponseEntity.ok(counterFacade.getConsuptions(duration));
//    }

    @GetMapping("/consumption_report")
    public ConsumptionOutput getConsumptions(@RequestParam int duration){
        return counterFacade.getConsumptions(duration);
    }
}

