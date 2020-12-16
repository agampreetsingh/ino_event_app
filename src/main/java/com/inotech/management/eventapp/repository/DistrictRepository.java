package com.inotech.management.eventapp.repository;

import com.inotech.management.eventapp.entities.demographics.District;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface DistrictRepository extends JpaRepository<District, Integer> {

}
