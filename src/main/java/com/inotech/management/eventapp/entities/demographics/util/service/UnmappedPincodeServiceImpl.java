package com.inotech.management.eventapp.entities.demographics.util.service;

import com.inotech.management.eventapp.entities.demographics.UnmappedPincode;
import com.inotech.management.eventapp.repo.demographics.UnmappedPincodeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnmappedPincodeServiceImpl implements UnmappedPincodeService {

    @Autowired
    private UnmappedPincodeRepo unmappedPincodeRepo;

    @Override
    public UnmappedPincode addUnmappedPincode(UnmappedPincode unmappedPincode) {
        return unmappedPincodeRepo.save(unmappedPincode);
    }
}
