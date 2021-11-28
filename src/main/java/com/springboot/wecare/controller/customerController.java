package com.springboot.wecare.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.wecare.model.Customer;
import com.springboot.wecare.service.ICustomerService;

@RestController
public class customerController {

	@Autowired
	ICustomerService customerService;

	@GetMapping("/allCustomer")
	public List<Customer> getAllBuyer() {
		System.out.println("Get all data..");

		return customerService.getAll();
	}

	@CrossOrigin
	@PostMapping("/addCustomer")
	public String addUser(@RequestBody @Valid Customer customer) {
		String contact = customerService.addCustomer(customer);

		return contact;
	}


}
