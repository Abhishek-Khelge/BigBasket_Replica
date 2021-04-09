package com.example.users.service;

import com.example.users.entity.UserDetails;
import com.example.users.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailsService {

    @Autowired
    UserDetailsRepository userDetailsRepository;


    public String registerUser(UserDetails userDetails) {
        List<UserDetails> users = userDetailsRepository.findAll();

    }
}
