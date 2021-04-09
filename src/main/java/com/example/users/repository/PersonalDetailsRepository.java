package com.example.users.repository;


import com.example.users.entity.PersonalDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalDetailsRepository extends JpaRepository<PersonalDetails,Long> {
}
