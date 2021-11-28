package com.springboot.wecare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.wecare.model.ClientSchedule;

public interface ClientScheduleRepository extends JpaRepository<ClientSchedule, Long> {
	
	

}
