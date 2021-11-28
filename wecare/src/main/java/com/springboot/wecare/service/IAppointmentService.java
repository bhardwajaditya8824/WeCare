package com.springboot.wecare.service;

import java.util.List;

import javax.validation.Valid;

import com.springboot.wecare.model.Appointment;
import com.springboot.wecare.model.Caregiver;

public interface IAppointmentService {

	public List<Appointment> getAll();

	public String addAppointment(Appointment appointment);

	public String deleteAppointment(Long appointmentID);

	public String updateAppointment(Appointment appointment);

	public String viewClientAppointment(Long clientId);

	public String viewCaregiverAppointment(Long caregiverid);

	public String requestAppointment(Long clientId, int duration);

	public String approveOrDenyAppointment(Long appointmentId, Long clientId);

	public List<Appointment> getAppointmentsbyId(long id);

	public String applyLeave(@Valid long id);

}
