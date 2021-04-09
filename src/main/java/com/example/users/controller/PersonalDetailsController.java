package com.example.users.controller;

import com.example.users.service.PersonalDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonalDetailsController {

    @Autowired
    PersonalDetailsService personalDetailsService;


}
