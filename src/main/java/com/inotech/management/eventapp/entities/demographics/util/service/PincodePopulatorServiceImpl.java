package com.inotech.management.eventapp.entities.demographics.util.service;

import com.inotech.management.eventapp.entities.demographics.*;
import com.inotech.management.eventapp.entities.demographics.util.entities.PincodeDetails;
import com.inotech.management.eventapp.entities.demographics.util.entities.PostOffice;
import com.inotech.management.eventapp.service.demographics.CountryService;
import com.inotech.management.eventapp.service.demographics.DistrictService;
import com.inotech.management.eventapp.service.demographics.PincodeDistrictMappingService;
import com.inotech.management.eventapp.service.demographics.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PincodePopulatorServiceImpl implements PincodePopulatorService {

    @Autowired
    private CountryService countryService;

    @Autowired
    private PostOfficeService postOfficeService;

    @Autowired
    private DistrictService districtService;

    @Autowired
    private StateService stateService;

    @Autowired
    private PincodeDistrictMappingService pincodeDistrictMappingService;

    @Autowired
    private UnmappedPincodeService unmappedPincodeService;

    @Override
    public String getPOstOfficeByPincode(List<Pincodes> pincodeList) {
        int processorCount = 0;
        int unProcessedCount = 0;
        for (Pincodes pincode : pincodeList) {
            System.out.println("\nFetching details for: "+pincode.getPincode());
            PincodeDetails pincodeDetails = postOfficeService.getPOstOfficeByPincode(pincode.getPincode());

            if (pincodeDetails.getPostOffice() != null) {
                System.out.println("Found details");
                PostOffice postOffice = pincodeDetails.getPostOffice().get(0);
                District district = districtService.findByName(postOffice.getDistrict()) != null ? districtService.findByName(postOffice.getDistrict()) : new District();
                district.setName(postOffice.getDistrict());
                State state = stateService.findStateByName(postOffice.getState());
                district.setState(state == null ? new State(postOffice.getState()) : state);
                PincodeDistrictMapping pincodeDistrictMapping = new PincodeDistrictMapping();
                pincodeDistrictMapping.setPincode(pincode);
                pincodeDistrictMapping.setDistrict(district);
                pincodeDistrictMappingService.addPincodeDistrictMapping(pincodeDistrictMapping);
                System.out.println("Added pincode: " + pincode.getPincode() + " mapped with district: " + district.getName());
                System.out.println("Processed " + (++processorCount) + " pincodes");
            }else{
                System.out.println("No details found");
                UnmappedPincode unmappedPincode = new UnmappedPincode();
                unmappedPincode.setPincode(pincode);
                unmappedPincodeService.addUnmappedPincode(unmappedPincode);
                unProcessedCount++;
                System.out.println("Error Saving mapping for: "+pincode.getPincode());
                System.out.println("Unmapped pincodes: "+unProcessedCount);
            }
        }

        return "Processing finished with " + processorCount + unProcessedCount+ "pincodes";
    }
}
