package com.inotech.management.eventapp.service;

import com.inotech.management.eventapp.entities.demographics.District;
import com.inotech.management.eventapp.entities.demographics.State;
import com.inotech.management.eventapp.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class DistrictServiceImpl implements DistrictService {
    private DistrictRepository districtRepo;

    @Autowired
    public DistrictServiceImpl(DistrictRepository districtRepo) {

        this.districtRepo = districtRepo;
    }

    @Override
    @Transactional
    public List<District> findAll() {

        return districtRepo.findAll();
    }

    @Override
    public District findById(int theId) {
        Optional<District> result=districtRepo.findById(theId);
        District theDistrict=null;
        if(result.isPresent()){
            theDistrict=result.get();
        }
        else{
            throw new RuntimeException("Didnt find the district id "+theId);
        }
        return theDistrict;
    }

    @Override
    public void save(District theDistrict) {
      districtRepo.save(theDistrict);
    }

    @Override
    public void deleteById(int theId) {
        districtRepo.deleteById(theId);
    }
}
