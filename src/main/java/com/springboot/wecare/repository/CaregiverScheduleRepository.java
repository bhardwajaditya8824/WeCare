package com.springboot.wecare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.wecare.model.CaregiverSchedule;

@Repository
public interface CaregiverScheduleRepository extends JpaRepository<CaregiverSchedule, Long> {
}
