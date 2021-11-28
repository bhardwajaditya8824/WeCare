package com.springboot.wecare.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client_schedule")
public class ClientSchedule {
	
	@Id
	@Column(name = "client_Schedule_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long clientScheduleId;
	
	@Column(name = "clientId")
	private Long clientId;

	public ClientSchedule() {
		super();
	}

	public ClientSchedule(Long clientScheduleId, Long clientId) {
		super();
		this.clientScheduleId = clientScheduleId;
		this.clientId = clientId;
	}

	public Long getClientScheduleId() {
		return clientScheduleId;
	}

	public void setClientScheduleId(Long clientScheduleId) {
		this.clientScheduleId = clientScheduleId;
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	@Override
	public String toString() {
		return "ClientSchedule [clientScheduleId=" + clientScheduleId + ", clientId=" + clientId + "]";
	}
	
	
}

	