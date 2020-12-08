package com.inotech.management.eventapp.controller;

import com.inotech.management.eventapp.entities.Employee;
import com.inotech.management.eventapp.entities.common.Status;
import com.inotech.management.eventapp.entities.user.User;
import com.inotech.management.eventapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    private UserService userService;

    @Autowired

    public UserController(UserService theUserService){

        userService = theUserService;
    }

    @GetMapping("/employees")
    public List<Status> findAll(){
        return userService.findAll();
    }

}
