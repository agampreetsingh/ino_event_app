package com.inotech.management.eventapp.controller;

import com.inotech.management.eventapp.entities.demographics.City;
import com.inotech.management.eventapp.entities.demographics.Country;
import com.inotech.management.eventapp.entities.demographics.Zone;
import com.inotech.management.eventapp.service.demographics.CountryService;
import com.inotech.management.eventapp.service.demographics.ZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CountryRestController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries")
    public List<Country> getAllCountries(){

        return countryService.findAll();
    }

    @GetMapping("/countries/{countryId}")
    public Country getCountryById(@PathVariable long countryId){

        Country country=countryService.findById(countryId);
        if(country==null){
            throw new RuntimeException("Country is not found "+countryId);
        }
        return country;
    }

    @PostMapping("/countries")
    public void addCountry(@RequestBody Country country){
        country.setId(0L);
        countryService.save(country);
    }

    @PutMapping("/countries")
    public void updateCountry(@RequestBody Country country){
        countryService.save(country);
    }

    @DeleteMapping("/countries/{countryId}")
    public void deleteCountryById(@PathVariable long countryId){
        if(countryService.findById(countryId)!=null){
            countryService.deleteById(countryId);
        }
        else
            throw new RuntimeException("Didnt find the country id");
    }
}
