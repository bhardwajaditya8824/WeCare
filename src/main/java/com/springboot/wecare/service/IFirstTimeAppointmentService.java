package com.springboot.wecare.service;

import java.util.List;

import com.springboot.wecare.model.FirstTimeAppointment;

public interface IFirstTimeAppointmentService {

	public String requestFirstAppointment(FirstTimeAppointment appointment);

	public String cancelFirstAppointment(Long firstappointmentId);

	public List<FirstTimeAppointment> getAll();
}
