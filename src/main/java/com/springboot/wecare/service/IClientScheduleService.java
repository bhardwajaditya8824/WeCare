package com.springboot.wecare.service;

import java.util.List;

import javax.validation.Valid;

import com.springboot.wecare.model.Appointment;
import com.springboot.wecare.model.ClientSchedule;

public interface IClientScheduleService {

	List<Long> getClientSchedule(Long clientId);

	List<Appointment> generateClientSchedule(long firstAptId);

	String updateClientSchedule(@Valid ClientSchedule schedule);

	String deleteClientSchedule(@Valid long scheduleId);

	ClientSchedule getClientScheduleById(@Valid long scheduleId);

	List<ClientSchedule> getallSchedules();

}
