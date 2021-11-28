package com.springboot.wecare.model;

public class ConcreteFirstAppointmentBuilder implements FirstTimeAppointmentBuilder {

	private FirstTimeAppointment firstTimeAppointment;

	public ConcreteFirstAppointmentBuilder() {
		this.firstTimeAppointment = new FirstTimeAppointment();
	}

	@Override
	public void buildfirstappointmentId() {
		firstTimeAppointment.setFirstappointmentId(firstTimeAppointment.getFirstappointmentId());
	}

	@Override
	public void buildClientId() {
		firstTimeAppointment.setClientId(firstTimeAppointment.getClientId());
	}

	@Override
	public void buildAppointmentDuration() {
		firstTimeAppointment.setAppointmentDuration(firstTimeAppointment.getAppointmentDuration());

	}

	@Override
	public void buildAppointmentFrequency() {
		firstTimeAppointment.setAppointmentFrequency(firstTimeAppointment.getAppointmentFrequency());
	}

	@Override
	public void buildappointmentLength() {
		firstTimeAppointment.setAppointmentLength(firstTimeAppointment.getAppointmentLength());
	}

	@Override
	public void buildappointmentStatus() {
		firstTimeAppointment.setAppointmentStatus(firstTimeAppointment.getAppointmentStatus());	
	}
	
	@Override
	public FirstTimeAppointment getFirstTimeAppointment() {
		return this.firstTimeAppointment;
	}


}
