package com.inotech.management.eventapp.service.demographics;

import com.inotech.management.eventapp.entities.demographics.District;
import com.inotech.management.eventapp.entities.demographics.State;
import com.inotech.management.eventapp.repo.demographics.StateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StateServiceImpl implements StateService{
    @Autowired
    StateRepo stateRepo;

    @Override
    public List<State> findAll() {
        return stateRepo.findAll();
    }

    @Override
    public State findById(long id) {
        Optional<State> result=stateRepo.findById(id);
        State state=null;
        if(result!=null)
            state = result.get();
        else
            throw new RuntimeException("Didnt find the state");
        return state;
    }

    @Override
    public State addState(State state) {
        return stateRepo.save(state);

    }

    @Override
    public State findStateByName(String name) {
        return stateRepo.findByName(name);

    }

    @Override
    public void save(State state) {
            stateRepo.save(state);
    }

    @Override
    public void deleteById(long id) {
        if(stateRepo.findById(id)!=null)
            stateRepo.deleteById(id);
        else
            throw new RuntimeException("This id doesnt exist");
    }
}
