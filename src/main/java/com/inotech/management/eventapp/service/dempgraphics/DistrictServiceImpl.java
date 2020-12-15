package com.inotech.management.eventapp.service.dempgraphics;

import com.inotech.management.eventapp.entities.demographics.District;
import com.inotech.management.eventapp.repo.demographics.DistrictRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DistrictServiceImpl implements DistrictService{

    @Autowired
    private DistrictRepo districtRepo;


    @Override
    public District addDistrict(District district) {
        return districtRepo.save(district);
    }

    @Override
    public District findByName(String name) {
        return districtRepo.findByName(name);
    }
}
