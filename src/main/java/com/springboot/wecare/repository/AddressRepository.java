package com.springboot.wecare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.wecare.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
