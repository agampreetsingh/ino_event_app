package com.inotech.management.eventapp.service;

import com.inotech.management.eventapp.entities.demographics.District;

import java.util.*;

public interface DistrictService {
   public List<District> findAll();
   public District findById(int theId);
   public void save(District theDistrict);
   public void deleteById(int theId);

}
