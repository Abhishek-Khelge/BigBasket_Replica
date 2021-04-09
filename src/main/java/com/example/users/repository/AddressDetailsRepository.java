package com.example.users.repository;

import com.example.users.entity.AddressDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressDetailsRepository extends JpaRepository<AddressDetails,Long> {
}
