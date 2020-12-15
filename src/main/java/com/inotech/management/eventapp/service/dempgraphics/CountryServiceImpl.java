package com.inotech.management.eventapp.service.dempgraphics;

import com.inotech.management.eventapp.entities.demographics.Country;
import com.inotech.management.eventapp.repo.demographics.CountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService{

    @Autowired
    private CountryRepo countryRepo;

    @Override
    public Country addCountry(Country country) {
        return countryRepo.save(country);
    }
}
