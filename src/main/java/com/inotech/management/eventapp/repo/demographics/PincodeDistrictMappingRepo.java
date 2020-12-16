package com.inotech.management.eventapp.repo.demographics;

import com.inotech.management.eventapp.entities.demographics.Country;
import com.inotech.management.eventapp.entities.demographics.PincodeDistrictMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PincodeDistrictMappingRepo extends JpaRepository<PincodeDistrictMapping, Long> {
}
