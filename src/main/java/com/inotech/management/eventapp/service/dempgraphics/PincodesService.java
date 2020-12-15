package com.inotech.management.eventapp.service.dempgraphics;

import com.inotech.management.eventapp.entities.demographics.Pincodes;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PincodesService {

    List<Pincodes> findAll();
}
