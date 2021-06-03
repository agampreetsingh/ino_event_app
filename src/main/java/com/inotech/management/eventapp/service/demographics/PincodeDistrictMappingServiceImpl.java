package com.inotech.management.eventapp.service.demographics;

import com.inotech.management.eventapp.entities.demographics.PincodeDistrictMapping;
import com.inotech.management.eventapp.repo.demographics.PincodeDistrictMappingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PincodeDistrictMappingServiceImpl implements PincodeDistrictMappingService {

    @Autowired
    private PincodeDistrictMappingRepo pincodeDistrictMappingRepo;


    @Override
    public PincodeDistrictMapping addPincodeDistrictMapping(PincodeDistrictMapping pincodeDistrictMapping) {
        return pincodeDistrictMappingRepo.save(pincodeDistrictMapping);
    }

}
