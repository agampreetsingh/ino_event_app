package com.inotech.management.eventapp.entities.demographics.util.service;

import com.inotech.management.eventapp.entities.demographics.util.entities.PincodeDetails;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PostOfficeServiceImpl implements PostOfficeService {

    private final RestTemplate restTemplate = new RestTemplate();

    @Value("${dmeographics.postal.pincode.api}")
    private String pincodeDetailsApi;

    @Override
    public PincodeDetails getPOstOfficeByPincode(String pincode) {
        System.out.println("URL: "+pincodeDetailsApi+pincode);
        ResponseEntity<PincodeDetails[]> pincodeDetailsResponseEntity = restTemplate.getForEntity(pincodeDetailsApi+pincode,PincodeDetails[].class);
        if(pincodeDetailsResponseEntity.hasBody()){
            return pincodeDetailsResponseEntity.getBody()[0];
        }
        else
            return null;
    }

}
