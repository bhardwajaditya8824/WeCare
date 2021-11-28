package com.springboot.wecare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.wecare.model.Customer;
import com.springboot.wecare.repository.CustomerRepository;

@Service
public class CustomerService implements ICustomerService {

	@Autowired
	CustomerRepository customerRepository;

	public List<Customer> getAll() {
		return customerRepository.findAll();

	}

	public String addCustomer(Customer customer) {

		try {
			customerRepository.save(customer);
		} catch (Exception e) {
			return e.getMessage();
		}
		return "Customer Saved";
	}

}
