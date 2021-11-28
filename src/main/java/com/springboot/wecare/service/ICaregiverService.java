package com.springboot.wecare.service;

import java.util.List;

import javax.validation.Valid;

import com.springboot.wecare.model.Caregiver;


public interface ICaregiverService {
		
		/*public abstract void Firsttimelogin();
		public abstract void RequestAppoinmentCancellation();
		public abstract void viewChatSupportContactDetails();
		public abstract void viewCallSupportContactDetails();
		public abstract void viewAppointments();--
		public abstract void viewPatientInfo(); --
		public abstract void viewAppointmentHistory();--
		public abstract void viewProfileInfo(); --
		public abstract void UpdateProfileInfo();--
		public abstract void resetPassword();*/
		
	
	//public String login(Caregiver caregiver); 
	
    public Caregiver caregiverInfo(long caregiverid);
    
    
	
	public List<Caregiver> getAll();

    public String addCaregiver(Caregiver caregiver) ;
    
    public String updateCaregiver(Caregiver caregiver);
    
    public String deleteCaregiver(long caregiverid);
    
  //Call to login class 

    public String resetPassword(String newPassword); 

    public String login(Long clientId, String password); 
    
    
    
    
    


}
