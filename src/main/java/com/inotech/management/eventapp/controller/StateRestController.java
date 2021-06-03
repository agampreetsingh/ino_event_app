package com.inotech.management.eventapp.controller;

import com.inotech.management.eventapp.entities.demographics.City;
import com.inotech.management.eventapp.entities.demographics.District;
import com.inotech.management.eventapp.entities.demographics.State;
import com.inotech.management.eventapp.service.demographics.DistrictService;
import com.inotech.management.eventapp.service.demographics.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StateRestController {



    @Autowired
    private StateService stateService;

    @GetMapping("/states")
    public List<State> getAllStates(){

        return stateService.findAll();
    }

    @GetMapping("/states/{stateId}")
    public State getStateById(@PathVariable long stateId){

        State state=stateService.findById(stateId);
        if(state==null){
            throw new RuntimeException("State is not found "+stateId);
        }
        return state;
    }
    @PostMapping("/states")
    public void addState(@RequestBody State state){
        state.setId(0L);
        stateService.save(state);
    }

    @PutMapping("/states")
    public void updateState(@RequestBody State state){
        stateService.save(state);
    }

    @DeleteMapping("/states/{stateId}")
    public void deleteStateById(@PathVariable long stateId){
        if(stateService.findById(stateId)!=null){
            stateService.deleteById(stateId);
        }
        else
            throw new RuntimeException("Didnt find the state id");
    }
}
