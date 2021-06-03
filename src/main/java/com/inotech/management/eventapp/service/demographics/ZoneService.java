package com.inotech.management.eventapp.service.demographics;

import com.inotech.management.eventapp.entities.demographics.Zone;
import java.util.List;

public interface ZoneService {
    List<Zone> findAll();
    Zone findById(long id);
    Zone addZone(Zone zone);
//    Zone findZoneByName(String name);
    void save(Zone zone);
    void deleteById(long id);


}
