package com.inotech.management.eventapp.repo.demographics;

import com.inotech.management.eventapp.entities.demographics.City;
import com.inotech.management.eventapp.entities.demographics.Country;
import com.inotech.management.eventapp.entities.demographics.Zone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneRepo extends JpaRepository<Zone, Long> {

    Zone findByName(String name);
}
