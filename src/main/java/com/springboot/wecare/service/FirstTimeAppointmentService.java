package com.springboot.wecare.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.wecare.model.Appointment;
import com.springboot.wecare.model.Client;
import com.springboot.wecare.model.FirstTimeAppointment;
import com.springboot.wecare.repository.ClientRepository;
import com.springboot.wecare.repository.FirstTimeAppointmentRepository;

@Service
public class FirstTimeAppointmentService implements IFirstTimeAppointmentService {

	@Autowired
	ClientRepository clientRepository;

	@Autowired
	FirstTimeAppointmentRepository firstTimeAppointmentRepository;

	@Transactional
	public List<FirstTimeAppointment> getAll() {
		return firstTimeAppointmentRepository.findAll();
	}

	@Transactional
	public String requestFirstAppointment(FirstTimeAppointment firstappointment) {
		FirstTimeAppointment first = new FirstTimeAppointment();
		first.setClientId(firstappointment.getClientId());
		first.setAppointmentLength(firstappointment.getAppointmentLength());

		first.setAppointmentFrequency(firstappointment.getAppointmentFrequency());

		first.setAppointmentDuration(firstappointment.getAppointmentDuration());
		
		first.setAppointmentStatus(firstappointment.getAppointmentStatus());


		try {
			firstTimeAppointmentRepository.save(first);

		} catch (Exception e) {

			return e.getMessage();
		}

		return "Appointment Created";
	}

	@Transactional
	public String cancelFirstAppointment(Long firstappointmentId) {
		try {
			Optional<FirstTimeAppointment> firstappointment = firstTimeAppointmentRepository
					.findById(firstappointmentId);
			firstTimeAppointmentRepository.delete(firstappointment.get());
		} catch (Exception e) {
			return e.getMessage();
		}
		return "First Appointment Deleted";
	}
}
