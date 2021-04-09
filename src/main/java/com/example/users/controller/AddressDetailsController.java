package com.example.users.controller;

import com.example.users.entity.AddressDetails;
import com.example.users.service.AddressDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressDetailsController {

    @Autowired
    AddressDetailsService addressDetailsService;

}
