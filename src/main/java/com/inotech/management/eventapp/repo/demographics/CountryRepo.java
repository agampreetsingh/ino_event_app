package com.inotech.management.eventapp.repo.demographics;

import com.inotech.management.eventapp.entities.demographics.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepo extends JpaRepository<Country, Long> {

    Country findByName(String name);
}
