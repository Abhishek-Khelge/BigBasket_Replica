package com.example.users.service;

import com.example.users.repository.AddressDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressDetailsService {

    @Autowired
    AddressDetailsRepository addressDetailsRepository;
}
