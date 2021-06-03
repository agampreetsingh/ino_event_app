package com.inotech.management.eventapp.service.demographics;

import com.inotech.management.eventapp.entities.demographics.Country;
import com.inotech.management.eventapp.repo.demographics.CountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService{

    @Autowired
    private CountryRepo countryRepo;

    @Override
    public List<Country> findAll() {
        return countryRepo.findAll();
    }

    @Override
    public Country findById(long id) {
        Optional<Country> result=countryRepo.findById(id);
        Country country=null;
        if(result!=null)
            country = result.get();
        else
            throw new RuntimeException("Didnt find the zone");
        return country;
    }

    @Override
    public Country addCountry(Country country) {
        return countryRepo.save(country);
    }

    @Override
    public void save(Country country) {
        countryRepo.save(country);
    }

    @Override
    public void deleteById(long id) {
        if(countryRepo.findById(id)!=null)
            countryRepo.deleteById(id);
        else
            throw new RuntimeException("This id doesnt exist");
    }
}
