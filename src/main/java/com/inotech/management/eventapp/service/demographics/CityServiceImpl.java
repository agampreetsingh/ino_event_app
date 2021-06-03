package com.inotech.management.eventapp.service.demographics;

import com.inotech.management.eventapp.entities.demographics.City;
import com.inotech.management.eventapp.entities.demographics.Country;
import com.inotech.management.eventapp.entities.demographics.District;
import com.inotech.management.eventapp.repo.demographics.CityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityServiceImpl implements CityService{


    private final CityRepo cityRepo;
    private final DistrictService districtService;

    public CityServiceImpl(CityRepo cityRepo, DistrictService districtService) {
        this.cityRepo = cityRepo;
        this.districtService = districtService;
    }

    @Override
    public List<City> findAll() {
        return cityRepo.findAll();
    }

    @Override
    public City findById(long id) {
        Optional<City> result=cityRepo.findById(id);
        City city=null;
        if(result!=null)
            city = result.get();
        else
            throw new RuntimeException("Didnt find the zone");
        return city;
    }

    @Override
    public void save(City city) {
        District district=districtService.findById(city.getDistrict().getId());
        city.setDistrict(district);
        cityRepo.save(city);
    }

    @Override
    public void deleteById(long id) {
        if(cityRepo.findById(id)!=null)
            cityRepo.deleteById(id);
        else
            throw new RuntimeException("This id doesnt exist");
    }
}
