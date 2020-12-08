package com.inotech.management.eventapp.service;

import com.inotech.management.eventapp.entities.Employee;
import com.inotech.management.eventapp.entities.common.Status;
import com.inotech.management.eventapp.entities.user.User;
import java.util.List;

public interface UserService {

    public List<Status> findAll();
}
