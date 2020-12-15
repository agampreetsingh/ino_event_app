package com.inotech.management.eventapp.service.dempgraphics;

import com.inotech.management.eventapp.entities.demographics.State;
import com.inotech.management.eventapp.repo.demographics.StateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StateServiceImpl implements StateService {

    @Autowired
    private StateRepo stateRepo;


    @Override
    public State addState(State state) {
        return stateRepo.save(state);
    }

    @Override
    public State findStateByName(String name) {
        return stateRepo.findByName(name);
    }

}
