package com.springboot.wecare.model;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.wecare.repository.AppointmentRepository;
import com.springboot.wecare.repository.ClientScheduleRepository;
import com.springboot.wecare.repository.FirstTimeAppointmentRepository;

public class TestDecoratorPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FirstTimeAppointmentRepository firstTimeAptRep;
		
		
	
		//FirstTimeAppointment firstApt = firstTimeAptRep.getById(firstAptId);
		//double freq = 5;
		//firstApt.getAppointmentFrequency(); 
		
				
		//Without Rtpcr test 
		ClientServicescost decoratedHomevisit = new givePills(new giveShower (new HomeVisit()));
		
		//String totalcost=(decoratedHomevisit.getDescripton()+ " € " + decoratedHomevisit.cost());
		//if (freq >3){
			double tc= 0.85*decoratedHomevisit.cost();
			System.out.println(decoratedHomevisit.getDescripton()+ " = € "+ tc );
		//}
		
		//With RTPCR test
		ClientServicescost decoratedHomevisitandrtpcr = new giveRtpcrtest(new HomeVisit());
		System.out.println(decoratedHomevisitandrtpcr.getDescripton()+ " € " + decoratedHomevisitandrtpcr.cost());

	}

}
