package com.springboot.wecare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.wecare.model.FirstTimeAppointment;

public interface FirstTimeAppointmentRepository extends JpaRepository<FirstTimeAppointment, Long> {

}
