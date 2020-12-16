package com.inotech.management.eventapp.entities.demographics.util.service;

import com.inotech.management.eventapp.entities.demographics.util.entities.PincodeDetails;

public interface PostOfficeService {

    PincodeDetails getPOstOfficeByPincode(String pincode);
}
