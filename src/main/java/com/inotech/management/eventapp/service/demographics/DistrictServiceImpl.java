package com.inotech.management.eventapp.service.demographics;

import com.inotech.management.eventapp.entities.demographics.District;
import com.inotech.management.eventapp.repo.demographics.DistrictRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DistrictServiceImpl implements DistrictService{

    @Autowired
    private DistrictRepo districtRepo;
    @Override
    public List<District> findAll() {
        return districtRepo.findAll();
    }

    @Override
    public District findById(long id) {
        Optional<District> result=districtRepo.findById(id);
        District district=null;
        if(result!=null)
            district = result.get();
        else
             throw new RuntimeException("Didnt find the district");
        return district;
    }

    @Override
    public District findByName(String name) {
        return districtRepo.findByName(name);
    }

    @Override
    public void save(District district) {
        districtRepo.save(district);
    }

    @Override
    public void deleteById(long id) {
         if(districtRepo.findById(id)!=null)
        districtRepo.deleteById(id);
         else
             throw new RuntimeException("This id doesnt exist");
    }
}
