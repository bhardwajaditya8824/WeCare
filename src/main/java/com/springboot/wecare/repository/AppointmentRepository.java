package com.springboot.wecare.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.wecare.model.Appointment;

@Repository

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

	Optional<Appointment> findByAppointmentId(Long appointmentID);
}
