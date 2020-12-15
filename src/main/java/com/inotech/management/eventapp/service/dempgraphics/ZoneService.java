package com.inotech.management.eventapp.service.dempgraphics;

import com.inotech.management.eventapp.entities.demographics.Zone;
import org.springframework.stereotype.Service;

@Service
public interface ZoneService {

    Zone addZone(Zone zone);
}
