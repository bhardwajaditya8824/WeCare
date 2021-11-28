package com.springboot.wecare.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "firstappointment")
public class FirstTimeAppointment {

	@Id
	@Column(name = "firstappointment_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long firstappointmentId;

	@Column(name = "client_id")
	private Long clientId;

	@Column(name = "appointment_duration")
	private String appointmentDuration;

	@Column(name = "appointmentstatus")
	private String appointmentStatus;
	
	@Column(name = "appointmentfrequency")
	private Double appointmentFrequency;

	@Column(name = "appointmentlength")
	private int appointmentLength;

	public FirstTimeAppointment() {
		super();
	}

	public FirstTimeAppointment(Long firstappointmentId, Long clientId, String appointmentDuration,
			String appointmentStatus, Double appointmentFrequency, int appointmentLength) {
		super();
		this.firstappointmentId = firstappointmentId;
		this.clientId = clientId;
		this.appointmentDuration = appointmentDuration;
		this.appointmentStatus = appointmentStatus;
		this.appointmentFrequency = appointmentFrequency;
		this.appointmentLength = appointmentLength;
	}

	public Long getFirstappointmentId() {
		return firstappointmentId;
	}

	public void setFirstappointmentId(Long firstappointmentId) {
		this.firstappointmentId = firstappointmentId;
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public String getAppointmentDuration() {
		return appointmentDuration;
	}

	public void setAppointmentDuration(String appointmentDuration) {
		this.appointmentDuration = appointmentDuration;
	}

	public String getAppointmentStatus() {
		return appointmentStatus;
	}

	public void setAppointmentStatus(String appointmentStatus) {
		this.appointmentStatus = appointmentStatus;
	}

	public Double getAppointmentFrequency() {
		return appointmentFrequency;
	}

	public void setAppointmentFrequency(Double appointmentFrequency) {
		this.appointmentFrequency = appointmentFrequency;
	}

	public int getAppointmentLength() {
		return appointmentLength;
	}

	public void setAppointmentLength(int appointmentLength) {
		this.appointmentLength = appointmentLength;
	}

	@Override
	public String toString() {
		return "FirstTimeAppointment [firstappointmentId=" + firstappointmentId + ", clientId=" + clientId
				+ ", appointmentDuration=" + appointmentDuration + ", appointmentStatus=" + appointmentStatus
				+ ", appointmentFrequency=" + appointmentFrequency + ", appointmentLength=" + appointmentLength + "]";
	}

	

}