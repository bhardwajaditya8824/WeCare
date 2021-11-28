package com.springboot.wecare.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.wecare.model.Address;
import com.springboot.wecare.repository.AddressRepository;

@Service
public class AddressService implements IAddressService{
	@Autowired
	AddressRepository addressRepository;
	
	@Transactional
	public List<Address> getAll() {
		return addressRepository.findAll();

	}

	@Transactional
	public String addAddress(Address address) {

		try {
			addressRepository.save(address);
		} catch (Exception e) {
			return e.getMessage();
		}
		return "Address Saved";
	}

	@Transactional
	public String updateAddress(Address address) {
		
		Optional <Address> searchRecord = addressRepository.findById(address.getAddressId());
		if(searchRecord.isPresent()) {
			try {
				
				Address updateAddress = searchRecord.get();
				updateAddress.setAddrFirLine(address.getAddrFirLine());
				updateAddress.setAddrSecLine(address.getAddrSecLine());
				updateAddress.setCity(address.getCity());
				updateAddress.setCounty(address.getCounty());
				updateAddress.setEircode(address.getEircode());
				
				addressRepository.save(updateAddress);
				
			} catch (Exception e) {
				return e.getMessage();
			}
		} else {
			return "Address does not exist.";
		}
		return "Address Updated";
	}

	@Transactional
	public String deleteAddress(Long addressID) {
		try {
			Optional <Address> address = addressRepository.findById(addressID);
			addressRepository.delete(address.get());
		} catch (Exception e)
		{
			return e.getMessage();
		}
		return "Address Deleted";
	}
}
