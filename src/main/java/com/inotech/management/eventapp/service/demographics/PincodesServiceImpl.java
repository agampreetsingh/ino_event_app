package com.inotech.management.eventapp.service.demographics;

import com.inotech.management.eventapp.entities.demographics.Pincodes;
import com.inotech.management.eventapp.repo.demographics.PincodeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PincodesServiceImpl implements PincodesService{


    @Autowired
    private PincodeRepo pincodeRepo;

    @Override
    public List<Pincodes> findAll() {
        return pincodeRepo.findAll();
    }

}
