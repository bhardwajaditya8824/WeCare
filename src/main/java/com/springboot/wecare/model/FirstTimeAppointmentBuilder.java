package com.springboot.wecare.model;

public interface FirstTimeAppointmentBuilder {
	void buildfirstappointmentId();

	void buildClientId();

	void buildAppointmentDuration();

	void buildAppointmentFrequency();

	void buildappointmentLength();
	
	void buildappointmentStatus();

	FirstTimeAppointment getFirstTimeAppointment();
}
