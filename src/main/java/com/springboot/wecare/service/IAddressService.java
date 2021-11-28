package com.springboot.wecare.service;

import java.util.List;

import com.springboot.wecare.model.Address;

public interface IAddressService {
	public List<Address> getAll();
	public String addAddress(Address address);
	public String updateAddress(Address address);
	public String deleteAddress(Long addressID);
}
