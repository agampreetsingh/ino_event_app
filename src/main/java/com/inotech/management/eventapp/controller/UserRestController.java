package com.inotech.management.eventapp.controller;

import com.inotech.management.eventapp.entities.user.User;
import com.inotech.management.eventapp.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserRestController {

    @Autowired
    private UserService userService;


    @GetMapping("/user")
    public List<User> getAllUsers(){
        return userService.findAll();
    }

}
