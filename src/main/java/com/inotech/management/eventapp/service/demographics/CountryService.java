package com.inotech.management.eventapp.service.demographics;

import com.inotech.management.eventapp.entities.demographics.Country;


import java.util.List;

public interface CountryService {
    List<Country> findAll();
    Country findById(long id);
    Country addCountry(Country country);
//    Zone findZoneByName(String name);
    void save(Country country);
    void deleteById(long id);


}
