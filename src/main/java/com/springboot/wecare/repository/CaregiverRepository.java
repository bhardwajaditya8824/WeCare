package com.springboot.wecare.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.wecare.model.Caregiver;
import com.springboot.wecare.model.Client;

@Repository
public interface CaregiverRepository extends JpaRepository<Caregiver, Long> {
	
	Optional<Caregiver> findByCaregiverContactNo(String caregiverContactNo);
	
	Optional<Caregiver> findByCaregiverid(long caregiverid);

	Optional<Caregiver> getByLoginId(Integer i);
}
