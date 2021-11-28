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

import com.springboot.wecare.model.Address;
import com.springboot.wecare.service.IAddressService;

@RestController
public class AddressController {
	
	@Autowired
	IAddressService addressService;

	@GetMapping("/allAddresses")
	public List<Address> getAllAddresses() {
		System.out.println("Get all data..");

		return addressService.getAll();
	}

	@CrossOrigin
	@PostMapping("/addAddress")
	public String addAddress(@RequestBody @Valid Address address) {
		String contact = addressService.addAddress(address);
		return contact;
	}
	
	@CrossOrigin
	@PutMapping("/updateAddress")
	public String updateAddress(@RequestBody @Valid Address address) {
		String response = addressService.updateAddress(address);
		return response;
	}
	
	@CrossOrigin
	@DeleteMapping("/deleteAddress")
	public String deleteAddress(@RequestParam Long AddressID) {
		String response = addressService.deleteAddress(AddressID);
		return response;
	}
}
