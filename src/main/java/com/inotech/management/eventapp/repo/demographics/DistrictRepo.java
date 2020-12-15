package com.inotech.management.eventapp.repo.demographics;

import com.inotech.management.eventapp.entities.demographics.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictRepo extends JpaRepository<District, Long> {

    District findByName(String name);
}
