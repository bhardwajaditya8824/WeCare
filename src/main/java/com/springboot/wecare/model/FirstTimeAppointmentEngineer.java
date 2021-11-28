package com.springboot.wecare.model;

public class FirstTimeAppointmentEngineer {
	private FirstTimeAppointmentBuilder firstTimeAppointmentBuilder;

	public FirstTimeAppointmentEngineer(FirstTimeAppointmentBuilder firstTimeAppointmentBuilder) {
		this.firstTimeAppointmentBuilder = firstTimeAppointmentBuilder;
	}

	public FirstTimeAppointment assignFirstTimeAppointment() {
		this.firstTimeAppointmentBuilder.buildfirstappointmentId();
		this.firstTimeAppointmentBuilder.buildappointmentLength();
		this.firstTimeAppointmentBuilder.buildAppointmentDuration();
		this.firstTimeAppointmentBuilder.buildappointmentLength();
		this.firstTimeAppointmentBuilder.buildappointmentStatus();
		this.firstTimeAppointmentBuilder.buildClientId();
		return this.firstTimeAppointmentBuilder.getFirstTimeAppointment();
	}
}