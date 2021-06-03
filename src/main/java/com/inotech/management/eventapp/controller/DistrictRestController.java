package com.inotech.management.eventapp.controller;

import com.inotech.management.eventapp.entities.demographics.City;
import com.inotech.management.eventapp.entities.demographics.District;
import com.inotech.management.eventapp.service.demographics.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DistrictRestController {



    @Autowired
    private DistrictService districtService;

    @GetMapping("/districts")
    public List<District> getAllDistricts(){

        return districtService.findAll();
    }

    @GetMapping("/districts/{districtId}")
    public District getDistrictById(@PathVariable long districtId){

        District theDistrict=districtService.findById(districtId);
        if(theDistrict==null){
            throw new RuntimeException("District if not found "+districtId);
        }
        return theDistrict;
    }

    @PostMapping("/districts")
    public void addDistrict(@RequestBody District district){
        district.setId(0L);
        districtService.save(district);
    }

    @PutMapping("/districts")
    public void updateDistrict(@RequestBody District district){
       districtService.save(district);
    }

    @DeleteMapping("/districts/{districtId}")
    public void deleteDistrictById(@PathVariable long districtId){
        if(districtService.findById(districtId)!=null){
            districtService.deleteById(districtId);
        }
        else
            throw new RuntimeException("Didn't find the district id");
    }
}
