package com.springboot.wecare.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.wecare.model.Appointment;
import com.springboot.wecare.model.ClientSchedule;
import com.springboot.wecare.service.IClientScheduleService;

@RestController
public class ClientScheduleController {

	@Autowired
	IClientScheduleService clientScheduleService;

	@CrossOrigin
	@GetMapping("/findClientSchedule")
	public List<Long> findClientSchedule(Long clientId) {

		return clientScheduleService.getClientSchedule(clientId);
	}

	@CrossOrigin
	@GetMapping("/generateClientSchedule")
	public List<Appointment> generateClientSchedule(long firstAptId) {
		return clientScheduleService.generateClientSchedule(firstAptId);
	}

	@CrossOrigin
	@PostMapping("/updateClientSchedule")
	public String updateClientSchedule(@RequestBody @Valid ClientSchedule schedule) {
		String response = clientScheduleService.updateClientSchedule(schedule);
		return response;
	}

	@CrossOrigin
	@DeleteMapping("/deleteClientSchedule")
	public String deleteClientSchedule(@RequestParam @Valid long scheduleId) {
		return clientScheduleService.deleteClientSchedule(scheduleId);
	}

	@CrossOrigin
	@GetMapping("/getClientScheduleById")
	public ClientSchedule getClientScheduleById(@RequestParam @Valid long scheduleId) {
		return clientScheduleService.getClientScheduleById(scheduleId);
	}

	@CrossOrigin
	@GetMapping("/getallSchedules")
	public List<ClientSchedule> getallSchedules() {

		System.out.println("Get all data..");

		return clientScheduleService.getallSchedules();
	}

}