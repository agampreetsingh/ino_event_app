package com.inotech.management.eventapp.repo.demographics;

import com.inotech.management.eventapp.entities.demographics.UnmappedPincode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnmappedPincodeRepo extends JpaRepository<UnmappedPincode, Long> {
}
