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

import com.springboot.wecare.model.CaregiverManager;
import com.springboot.wecare.model.Login;
import com.springboot.wecare.service.IAppointmentService;
import com.springboot.wecare.service.ICaregiverManagerService;
import com.springboot.wecare.service.IClientService;

@RestController
public class CaregiverManagerController {

	@Autowired
	ICaregiverManagerService caregiverManagerService;

	@Autowired
	IAppointmentService appointmentService;

	@Autowired
	IClientService clientService;

	@CrossOrigin
	@GetMapping("/getManagers")
	public List<CaregiverManager> getManagers() {

		System.out.println("Get all data..");

		return caregiverManagerService.getManagers();
	}

	@CrossOrigin
	@DeleteMapping("/deleteClient")
	public String deleteClient(@RequestParam @Valid long clientId) {
		return clientService.removeClient(clientId);
	}

	@CrossOrigin
	@PutMapping("/cancelClientappointment")
	public String cancelClientAppointment(@RequestBody @Valid Login login) {
		String response = appointmentService.addAppointment(null);

		return response;
	}

	@CrossOrigin
	@PutMapping("/queryResponse")
	public String queryResponse(@RequestParam @Valid String response) {
		return caregiverManagerService.queryResponse(response);
	}

	@CrossOrigin
	@PostMapping("/updateManager")
	public String updateManager(@RequestBody @Valid CaregiverManager manager) {
		String response = caregiverManagerService.updateManager(manager);
		return response;
	}

	@CrossOrigin
	@DeleteMapping("/deleteManager")
	public String deleteManager(@RequestParam @Valid long managerId) {
		return caregiverManagerService.deleteManager(managerId);
	}

	@CrossOrigin
	@PostMapping("/addManager")
	public String addManager(@RequestBody @Valid CaregiverManager manager) {
		String response = caregiverManagerService.addManager(manager);
		return response;
	}

	@CrossOrigin
	@GetMapping("/getManagerById")
	public CaregiverManager getManagerById(@RequestParam @Valid long managerId) {
		return caregiverManagerService.getManagerById(managerId);
	}

}
