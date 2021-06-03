package com.inotech.management.eventapp.service.demographics;

import com.inotech.management.eventapp.entities.demographics.District;

import java.util.List;

public interface DistrictService {
    List<District> findAll();
    District findById(long id);
    District findByName(String name);
    void save(District district);
    void deleteById(long id);


}
