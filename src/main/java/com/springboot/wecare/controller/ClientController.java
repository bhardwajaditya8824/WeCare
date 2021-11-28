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
import com.springboot.wecare.model.Client;
import com.springboot.wecare.service.IAppointmentService;
import com.springboot.wecare.service.IClientService;

@RestController //this class will be used as a controller
public class ClientController {

	@Autowired //no need to add confirmations or properties for this class
	IClientService clientService; //reference of clientservice
	IAppointmentService appointmentService;

	@CrossOrigin
	@GetMapping("/allClient")
	public List<Client> getAllClients() {
		System.out.println("Getting all data..");

		return clientService.getAll();
	}

	@CrossOrigin
	@GetMapping("/clientProfile")
	public Client seeProfile(@RequestParam @Valid long clientid) {
		return clientService.viewProfileInfo(clientid);
	}


	
	@CrossOrigin //transferring from web browser to application 
	@PostMapping("/registerClient") //create retrieve update and delete
	public String addUser(@RequestBody @Valid Client client) { 
		String contact = clientService.register(client);
		return contact;
	}
	
	@CrossOrigin
	@DeleteMapping("/removeClient")
	public String removeClient(@RequestParam @Valid long client) {
		return clientService.removeClient(client);
	}
	
	@CrossOrigin
	@PutMapping("/updateClientProfileInfo")
	public String updateClient(@RequestParam @Valid long client, @RequestParam @Valid Object[] fields) {
		return clientService.updateProfileInfo(client, fields);
	}
	
	@CrossOrigin
	@PutMapping("/requestAppointment")
	public String requestApt(@RequestParam @Valid long clientid, @RequestParam @Valid int durationInDays) {
		return appointmentService.requestAppointment(clientid, durationInDays);
	}
	
	@CrossOrigin
	@PostMapping("/updateClient")
	public String updateClient(@RequestBody @Valid Client client) {
		String response = clientService.updateClient(client);
        return response;
	}


	
	
	
}
