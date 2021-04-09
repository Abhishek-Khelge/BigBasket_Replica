package com.example.users.service;

import com.example.users.repository.PersonalDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalDetailsService {

    @Autowired
    PersonalDetailsRepository personalDetailsRepository;

}
