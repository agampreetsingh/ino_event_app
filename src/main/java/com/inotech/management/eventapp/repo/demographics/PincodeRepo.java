package com.inotech.management.eventapp.repo.demographics;

import com.inotech.management.eventapp.entities.demographics.Pincodes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PincodeRepo extends JpaRepository<Pincodes, Long> {
}
