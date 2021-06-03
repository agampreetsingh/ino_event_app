package com.inotech.management.eventapp.controller;

import com.inotech.management.eventapp.entities.demographics.City;
import com.inotech.management.eventapp.entities.demographics.District;
import com.inotech.management.eventapp.service.demographics.CityService;
import com.inotech.management.eventapp.service.demographics.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CityRestController {



    @Autowired
    private CityService cityService;

    @GetMapping("/cities")
    public List<City> getAllCities(){

        return cityService.findAll();
    }

    @GetMapping("/cities/{cityId}")
    public City getCityById(@PathVariable long cityId){

        City city=cityService.findById(cityId);
        if(city==null){
            throw new RuntimeException("City if not found "+cityId);
        }
        return city;
    }

    @PostMapping("/cities")
    public void addCity(@RequestBody City city){
        city.setId(0L);
        cityService.save(city);
    }

    @PutMapping("/cities")
    public void updateCity(@RequestBody City city){
        cityService.save(city);
    }

    @DeleteMapping("/cities/{cityId}")
    public void deleteCityById(@PathVariable long cityId){
        if(cityService.findById(cityId)!=null){
            cityService.deleteById(cityId);
        }
        else
            throw new RuntimeException("Didnt find the city id");
    }
}
