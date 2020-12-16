package com.inotech.management.eventapp.controller;

import com.inotech.management.eventapp.entities.demographics.District;
import com.inotech.management.eventapp.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DistrictController {

    private DistrictService districtService;

    @Autowired
    public DistrictController(DistrictService districtService){
        this.districtService=districtService;
    }

    @GetMapping("/districts")
    public List<District> findAll(){
        return districtService.findAll();
    }

    @GetMapping("/districts/{districtId}")
    public District getDistrictService(@PathVariable int districtId){

        District theDistrict=districtService.findById(districtId);
        if(theDistrict==null){
            throw new RuntimeException("District if not found "+districtId);
        }
        return theDistrict;
    }
}
