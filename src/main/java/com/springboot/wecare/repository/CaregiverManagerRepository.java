package com.springboot.wecare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.wecare.model.CaregiverManager;

@Repository
public interface CaregiverManagerRepository extends JpaRepository<CaregiverManager, Long>{

}
