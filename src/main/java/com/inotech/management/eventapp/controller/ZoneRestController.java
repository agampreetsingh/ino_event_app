package com.inotech.management.eventapp.controller;

import com.inotech.management.eventapp.entities.demographics.City;
import com.inotech.management.eventapp.entities.demographics.State;
import com.inotech.management.eventapp.entities.demographics.Zone;
import com.inotech.management.eventapp.service.demographics.StateService;
import com.inotech.management.eventapp.service.demographics.ZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ZoneRestController {

    @Autowired
    private ZoneService zoneService;

    @GetMapping("/zones")
    public List<Zone> getAllZones(){

        return zoneService.findAll();
    }

    @GetMapping("/zones/{zoneId}")
    public Zone getZoneById(@PathVariable long zoneId){

        Zone zone=zoneService.findById(zoneId);
        if(zone==null){
            throw new RuntimeException("Zone is not found "+zoneId);
        }
        return zone;
    }
    @PostMapping("/zones")
    public void addZone(@RequestBody Zone zone){
        zone.setId(0L);
        zoneService.save(zone);
    }

    @PutMapping("/zones")
    public void updateCity(@RequestBody Zone zone){
        zoneService.save(zone);
    }

    @DeleteMapping("/zones/{zoneId}")
    public void deleteZoneById(@PathVariable long zoneId){
        if(zoneService.findById(zoneId)!=null){
            zoneService.deleteById(zoneId);
        }
        else
            throw new RuntimeException("Didnt find the zone id");
    }
}
