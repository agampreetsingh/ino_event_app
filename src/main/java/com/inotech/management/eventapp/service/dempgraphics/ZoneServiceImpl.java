package com.inotech.management.eventapp.service.dempgraphics;

import com.inotech.management.eventapp.entities.demographics.Zone;
import com.inotech.management.eventapp.repo.demographics.ZoneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZoneServiceImpl implements ZoneService {

    @Autowired
    private ZoneRepo zoneRepo;


    @Override
    public Zone addZone(Zone zone) {
        return zoneRepo.save(zone);
    }
}
