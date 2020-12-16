package com.inotech.management.eventapp.service.user;

import com.inotech.management.eventapp.entities.user.User;
import com.inotech.management.eventapp.repo.user.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;


    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }
}
