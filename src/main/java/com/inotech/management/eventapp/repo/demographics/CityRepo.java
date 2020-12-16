package com.inotech.management.eventapp.repo.demographics;

import com.inotech.management.eventapp.entities.demographics.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepo extends JpaRepository<City, Long> {

    City findByName(String name);
}
