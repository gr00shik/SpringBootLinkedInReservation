package com.gr00shik.SpringBootLinkedInReservation.controller;

import com.gr00shik.SpringBootLinkedInReservation.dao.entity.User;
import com.gr00shik.SpringBootLinkedInReservation.dao.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    List<User> getAllUsers(@RequestParam(required = false) String fname){
        List<User> userList = new ArrayList<>();
        if(null == fname){
            Iterable<User> users = this.userRepository.findAll();
            users.forEach(user -> userList.add(user));
        }
        else{
            User user = this.userRepository.findByFname(fname);
            if(null!=user){
                userList.add(user);
            }
        }
        return userList;
    }

}
