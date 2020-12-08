package com.inotech.management.eventapp.service;

import com.inotech.management.eventapp.entities.Employee;
import com.inotech.management.eventapp.entities.common.Status;
import com.inotech.management.eventapp.entities.user.User;
import com.inotech.management.eventapp.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository theUserRepository){
        userRepository = theUserRepository;
    }


    @Override
    public List<Status> findAll() {
        return userRepository.findAll();
    }
}
