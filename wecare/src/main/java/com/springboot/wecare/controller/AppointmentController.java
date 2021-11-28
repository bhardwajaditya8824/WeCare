package com.springboot.wecare.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.wecare.model.Appointment;
import com.springboot.wecare.service.IAppointmentService;

@RestController
public class AppointmentController {
	@Autowired
	IAppointmentService appointmentService;

	@GetMapping("/allAppointments")
	public List<Appointment> getAllBuyer() {
		System.out.println("Get all data..");

		return appointmentService.getAll();
	}

	@CrossOrigin
	@PostMapping("/addAppointment")
	public String addAppointment(@RequestBody @Valid Appointment appointment) {
		String contact = appointmentService.addAppointment(appointment);

		return contact;
	}

	@CrossOrigin
	@PutMapping("/updateAppointment")
	public String updateAppointment(@RequestBody @Valid Appointment appointment) {
		String response = appointmentService.updateAppointment(appointment);
		return response;
	}
	
	@CrossOrigin
	@GetMapping("/getAppointmentsbyId")
	public List<Appointment> getAppointmentsbyId(long Id) {
		System.out.println("Get all data..");

		return appointmentService.getAppointmentsbyId(Id);
	}

	@CrossOrigin
	@PutMapping("/applyLeave")
	public String applyLeave(@RequestParam @Valid long id) {
		String response = appointmentService.applyLeave(id);

		return response;
	}
	

	@CrossOrigin
	@DeleteMapping("/deleteAppointment")
	public String deleteAppointment(@RequestParam Long appointmentID) {
		String response = appointmentService.deleteAppointment(appointmentID);
		return response;
	}
}
