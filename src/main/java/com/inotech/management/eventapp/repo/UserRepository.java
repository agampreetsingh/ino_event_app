package com.inotech.management.eventapp.repo;

import com.inotech.management.eventapp.entities.common.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Status, Integer> {

}
