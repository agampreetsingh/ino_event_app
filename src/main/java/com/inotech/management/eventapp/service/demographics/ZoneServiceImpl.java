package com.inotech.management.eventapp.service.demographics;

import com.inotech.management.eventapp.entities.demographics.District;
import com.inotech.management.eventapp.entities.demographics.Zone;
import com.inotech.management.eventapp.repo.demographics.ZoneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ZoneServiceImpl implements ZoneService{
    @Autowired
    private ZoneRepo zoneRepo;

    @Override
    public List<Zone> findAll() {
        return zoneRepo.findAll();
    }

    @Override
    public Zone findById(long id) {
        Optional<Zone> result=zoneRepo.findById(id);
        Zone zone=null;
        if(result!=null)
            zone = result.get();
        else
            throw new RuntimeException("Didnt find the zone");
        return zone;
    }

    @Override
    public Zone addZone(Zone zone) {
        return zoneRepo.save(zone);
    }

    @Override
    public void save(Zone zone) {
      zoneRepo.save(zone);
    }

    @Override
    public void deleteById(long id) {
        if(zoneRepo.findById(id)!=null)
            zoneRepo.deleteById(id);
        else
            throw new RuntimeException("This id doesnt exist");
    }
}
