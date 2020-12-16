package com.inotech.management.eventapp.entities.demographics.util.service;

import com.inotech.management.eventapp.entities.demographics.Pincodes;

import java.util.List;

public interface PincodePopulatorService {

    String getPOstOfficeByPincode(List<Pincodes> pincodeList);
}
