package com.example.users.controller;

import com.example.users.entity.UserDetails;
import com.example.users.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDetailsController {

    @Autowired
    UserDetailsService userDetailsService;

    @PostMapping("/user/register")
    public String registerUser(@RequestBody UserDetails userDetails){
        String message = userDetailsService.registerUser(userDetails);
        return message;
    }
}
