package com.springboot.wecare.service;

import java.util.List;

import com.springboot.wecare.model.Customer;

public interface ICustomerService {

	public List<Customer> getAll();

    public String addCustomer(Customer customer) ;
}
