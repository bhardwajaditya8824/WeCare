package com.springboot.wecare.controller;

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

import com.springboot.wecare.model.Address;
import com.springboot.wecare.model.Client;
import com.springboot.wecare.model.Login;
import com.springboot.wecare.service.ILoginService;

@RestController
public class LoginController {

	@Autowired
	ILoginService loginService;

	@GetMapping("/getLoginDetails")
	public Login getLoginDetails(Login login) {

		System.out.println("Get all data..");

		return loginService.getLoginDetails(login.getLoginId());
	}

	@CrossOrigin
	@PostMapping("/addLogin")
	public long addLogin(@RequestBody @Valid Login login) {
		long loginID = loginService.addLogin(login);

		return loginID;
	}
	
	@CrossOrigin
	@PostMapping("/addaddress")
	public long addaddress(@RequestBody @Valid Address address) {
		long addressId = loginService.addaddress(address);

		return addressId;
	}

	@CrossOrigin
	@PutMapping("/updateLoginDetails")
	public String updateLoginDetails(@RequestBody @Valid Login login) {
		String response = loginService.updateLoginDetails(login);

		return response;
	}

	@CrossOrigin
	@DeleteMapping("/deleteLogin")
	public String deleteLogin(@RequestBody @Valid Login login) {
		// System.out.println("*************************" + login +
		
		// "**************************************");
		String response = loginService.deleteLogin(login.getLoginId());

		return response;
	}

	@CrossOrigin
	@PostMapping("/validateLogin")
	public long validateLogin(@RequestBody @Valid Login login) {
		System.out.println("*************************" + login + "**************************************");

		return loginService.validateLogin(login);
	}

	@CrossOrigin
	@PostMapping("/lockUser")
	public String lockUser(@RequestBody @Valid Login login) {
		String response = loginService.lockUser(login.getUsername());

		return response;
	}

	@CrossOrigin
	@PutMapping("/unlockUser")
	public String unlockUser(@RequestBody @Valid Login login) {
		String response = loginService.unlockUser(login.getLoginId());

		return response;
	}
	
	@CrossOrigin
	@PostMapping("/checkedLocked")
	public String checkedLocked(@RequestBody @Valid Login login) {
		
		return loginService.checkedLocked(login.getUsername());

	
	}
	
	@CrossOrigin
	@PostMapping("/validateUsername")
	public String validateUsername(@RequestBody @Valid Login login) {
		System.out.println("*************************" + login + "**************************************");

		return loginService.validateUsername(login);
	}
	
	@CrossOrigin
	@GetMapping("/getClientId")
	public long getClientId(@RequestParam @Valid Long loginId) {
		
		System.out.println(loginId + "**************************************");

		System.out.println("Get all data..");
		long clientId=loginService.getClientId(loginId);

		return clientId;
	}
	
	@CrossOrigin
	@GetMapping("/getCaregiverId")
	public long getCaregiverId(@RequestParam @Valid Long loginId) {
		
		System.out.println(loginId + "**************************************");

		System.out.println("Get all data..");
		long clientId=loginService.getCaregiverId(loginId);

		return clientId;
	}
	

}
