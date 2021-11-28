package com.springboot.wecare.model;

public class HomeVisit extends ClientServicescost  {
	
	public String getDescripton() {
		return " Home Visit";
	}
	
	//firsttimeapt repository : get apt by client id , from that appointment get the frequency variable. 
	//from the freq calculate how many times a client is getting visited in a week
	// if said frequency is... then last calc is *0.85
	
	
	//how many times a client is getting visited in a week
	
	

	@Override
	public double cost() {
		
		return 15.0;
	}
	
	

}
