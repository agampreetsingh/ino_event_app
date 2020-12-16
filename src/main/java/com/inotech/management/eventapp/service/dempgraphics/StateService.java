package com.inotech.management.eventapp.service.dempgraphics;

import com.inotech.management.eventapp.entities.demographics.State;
import org.springframework.stereotype.Service;

@Service
public interface StateService {

    State addState(State state);

    State findStateByName(String name);
}
