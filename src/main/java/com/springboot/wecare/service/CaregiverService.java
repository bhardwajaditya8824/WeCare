package com.springboot.wecare.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.wecare.model.Caregiver;

import com.springboot.wecare.repository.CaregiverRepository;


@Service
public class CaregiverService implements ICaregiverService {
	
	@Autowired
	CaregiverRepository caregiverRepository;

	public List<Caregiver> getAll() {
		return caregiverRepository.findAll();
	}

	public String addCaregiver(Caregiver caregiver) {

		try {
			caregiverRepository.save(caregiver);
		} catch (Exception e) {
			return e.getMessage();
		}
		return "Caregiver Saved";
	}


	@Transactional
	public String updateCaregiver(Caregiver caregiver) {

			Optional<Caregiver> searchrecord = caregiverRepository.findByCaregiverid(caregiver.getCaregiverid());
			
			if (searchrecord.isPresent()) {
				try {
					Caregiver UpdateCaregiver= searchrecord.get();
					
					UpdateCaregiver.setCaregiverName(caregiver.getCaregiverName());
					UpdateCaregiver.setCaregiverExperience(caregiver.getCaregiverExperience());
					UpdateCaregiver.setCaregiverSpecialization(caregiver.getCaregiverSpecialization());
					UpdateCaregiver.setCaregiverAbout(caregiver.getCaregiverAbout());
					UpdateCaregiver.setCaregiverEmail(caregiver.getCaregiverEmail());
					UpdateCaregiver.setCaregiverReview(caregiver.getCaregiverReview());
					UpdateCaregiver.setCaregiverDob(caregiver.getCaregiverDob());
					UpdateCaregiver.setCaregiverContactNo(caregiver.getCaregiverContactNo());
					UpdateCaregiver.setAddressId(caregiver.getAddressId());
					UpdateCaregiver.setLoginId(caregiver.getLoginId());			
					
					caregiverRepository.save(UpdateCaregiver);
				} 
				
				catch (Exception e) {			
			return e.getMessage();			
		}   
			}			
			else {
			return "No record exist";
		}
		return "Caregiver Updated";
	}


	@Transactional
	public String deleteCaregiver(long caregiverid) {
		try {
			Optional<Caregiver> caregiver = caregiverRepository.findByCaregiverid(caregiverid);
			caregiverRepository.delete(caregiver.get());
		} catch (Exception e) {
			return e.getMessage();
		}
		return "Caregiver Deleted";	
		
	}

	@Override
	public Caregiver caregiverInfo(long caregiverid) {	
	
			try {
				Optional<Caregiver> searchrecord = caregiverRepository.findByCaregiverid(caregiverid);
				Caregiver RetrieveCaregiver= searchrecord.get();
				return RetrieveCaregiver;
				
				
			}catch (Exception e) {
				return null;
			} 
			
			
			
		}

	@Override
	public String resetPassword(String newPassword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String login(Long clientId, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	}



	

	

