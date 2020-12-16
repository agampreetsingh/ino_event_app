package com.inotech.management.eventapp.repo.demographics;

import com.inotech.management.eventapp.entities.demographics.City;
import com.inotech.management.eventapp.entities.demographics.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepo extends JpaRepository<State, Long> {

    State findByName(String name);
}
