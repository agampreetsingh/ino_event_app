package com.inotech.management.eventapp.service.demographics;

import com.inotech.management.eventapp.entities.demographics.City;


import java.util.List;

public interface CityService {
    List<City> findAll();
    City findById(long id);
   // Country addCountry(Country country);
    //    Zone findZoneByName(String name);
    void save(City city);
    void deleteById(long id);
}
