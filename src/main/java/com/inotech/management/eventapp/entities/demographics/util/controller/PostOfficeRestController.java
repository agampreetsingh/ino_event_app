package com.inotech.management.eventapp.entities.demographics.util.controller;

import com.inotech.management.eventapp.entities.demographics.util.service.PincodePopulatorService;
import com.inotech.management.eventapp.service.demographics.PincodesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostOfficeRestController {

    @Autowired
    private PincodesService pincodesService;

    @Autowired
    private PincodePopulatorService pincodePopulatorService;

    @GetMapping("/pincodes")
    public String postOfficeRestController(){
        return pincodesService.findAll().size()+"";
    }

    @GetMapping("/pincode_district")
    public String generatepincodeMappings(){
        return pincodePopulatorService.getPOstOfficeByPincode(pincodesService.findAll());
    }

}
