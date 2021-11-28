package com.springboot.wecare.service;

import java.util.ArrayList;
import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.springboot.wecare.model.Appointment;
import com.springboot.wecare.model.Caregiver;
import com.springboot.wecare.model.Client;
import com.springboot.wecare.repository.AppointmentRepository;
import com.springboot.wecare.repository.CaregiverRepository;
import com.springboot.wecare.repository.ClientRepository;

@Service
public class AppointmentService implements IAppointmentService {

	@Autowired
	AppointmentRepository appointmentRepository;

	@Autowired
	ClientRepository clientRepository;

	@Autowired
	CaregiverRepository caregiverRepository;

	@Transactional
	public List<Appointment> getAll() {
		return appointmentRepository.findAll();
	}

	@Transactional
	public String addAppointment(Appointment appointment) {
		try {
			appointmentRepository.save(appointment);
		} catch (Exception e) {
			return e.getMessage();
		}
		return "Appointment Saved";
	}

	@Transactional
	public String deleteAppointment(Long appointmentID) {
		try {
			Optional<Appointment> appointment = appointmentRepository.findByAppointmentId(appointmentID);
			appointmentRepository.delete(appointment.get());
		} catch (Exception e) {
			return e.getMessage();
		}
		return "Appointment Deleted";
	}

	@Transactional
	public String updateAppointment(Appointment appointment) {
		Optional<Appointment> searchRecord = appointmentRepository.findByAppointmentId(appointment.getAppointmentId());

		if (searchRecord.isPresent()) {
			try {

				Appointment updateAppointment = searchRecord.get();

				updateAppointment.setAppointmentDate(appointment.getAppointmentDate());
				updateAppointment.setAppointmentDuration(appointment.getAppointmentDuration());
				updateAppointment.setAppointmentFrequency(appointment.getAppointmentFrequency());
				updateAppointment.setAppointmentLength(appointment.getAppointmentLength());
				updateAppointment.setCaregiverID(appointment.getCaregiverID());
				updateAppointment.setClientID(appointment.getClientID());
				updateAppointment.setManagerID(appointment.getManagerID());

				appointmentRepository.save(updateAppointment);

			} catch (Exception e) {
				return e.getMessage();
			}
		} else {
			return "Appointment Doesn't Exist";
		}
		return "Appointment Deleted";
	}

	@Transactional
	public String viewClientAppointment(Long clientId) {
		Optional<Client> searchRecord = clientRepository.findById(clientId);
		if (searchRecord.isPresent()) {
			try {
				return clientRepository.findById(clientId).toString();

			} catch (Exception e) {
				return e.getMessage();
			}
		} else {
			return "No such client exists.";
		}
	}

	@Transactional
	public String viewCaregiverAppointment(Long caregiverid) {

		Optional<Caregiver> searchRecord = caregiverRepository.findById(caregiverid);
		if (searchRecord.isPresent()) {
			try {
				return caregiverRepository.findById(caregiverid).toString();

			} catch (Exception e) {
				return e.getMessage();
			}
		} else {
			return "No such caregiver exists.";
		}
	}

	@Transactional
	public String requestAppointment(Long clientId, int duration) {

		Appointment appointment = new Appointment();
		appointment.setIsConfirmed("false");
		appointment.setClientID(clientId);
		appointmentRepository.save(appointment);

		return null;
	}

	@Transactional
	public String approveOrDenyAppointment(Long appointmentId, Long clientId) {

		return null;
	}

	@Override
	@Transactional
	public List<Appointment> getAppointmentsbyId(long id) {
		// TODO Auto-generated method stub
		List<Appointment> appointmentList = new ArrayList();
		List<Appointment> finalAppointmentList = new ArrayList();
		appointmentList=appointmentRepository.findAll();
		
		
		for(Appointment a:appointmentList )
		{
			if(a.getClientID()==id) {
				
				finalAppointmentList.add(a);
				
			}
		}
		
		return finalAppointmentList;
	}
	
	}



