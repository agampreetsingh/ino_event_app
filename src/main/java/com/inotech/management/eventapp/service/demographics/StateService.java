package com.inotech.management.eventapp.service.demographics;

import com.inotech.management.eventapp.entities.demographics.State;

import java.util.List;

public interface StateService {
    List<State> findAll();
    State findById(long id);
    State addState(State state);
    State findStateByName(String name);
    void save(State state);
    void deleteById(long id);


}
