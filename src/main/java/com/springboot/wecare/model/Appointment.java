package com.springboot.wecare.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appointments")
public class Appointment {

	@Id
	@Column(name = "appointment_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long appointmentId;

	@Column(name = "appointment_date")
	private String appointmentDate;

	@Column(name = "appointment_startTime")
	private int appointmentStartTime;

	@Column(name = "appointment_endTime")
	private int appointmentEndTime;

	@Column(name = "appointment_frequency")
	private String appointmentFrequency;

	@Column(name = "appointment_length")
	private int appointmentLength;

	@Column(name = "appointment_duration")
	private String appointmentDuration;

	@Column(name = "client_id")
	private Long clientID;

	@Column(name = "caregiver_id")
	private Long caregiverID;

	@Column(name = "manager_id")
	private Long managerID;

	@Column(name = "is_confirmed")
	private String isConfirmed;

	@Column(name = "schedule_id")
	private Long scheduleID;

	public Appointment() {
		super();
	}

	public Appointment(Long appointmentId, String appointmentDate, String appointmentFrequency,
			int appointmentLength, String appointmentDuration, Long clientID, Long caregiverID, Long managerID,
			String isConfirmed, Long scheduleID) {
		super();
		this.appointmentId = appointmentId;
		this.appointmentDate = appointmentDate;
		this.appointmentFrequency = appointmentFrequency;
		this.appointmentLength = appointmentLength;
		this.appointmentDuration = appointmentDuration;
		this.clientID = clientID;
		this.caregiverID = caregiverID;
		this.managerID = managerID;
		this.isConfirmed = isConfirmed;
		this.scheduleID = scheduleID;
	}

	public Appointment(String appointmentDate, int appointmentStartTime, int appointmentLength, Long clientID,
			Long caregiverID, String isConfirmed, Long scheduleID) {
		super();
		this.appointmentDate = appointmentDate;
		this.appointmentStartTime = appointmentStartTime;
		this.appointmentLength = appointmentLength;
		this.clientID = clientID;
		this.caregiverID = caregiverID;
		this.isConfirmed = isConfirmed;
		this.scheduleID = scheduleID;
		int endMin = (appointmentStartTime + appointmentLength + 20) % 100;
		if (endMin >= 60) {
			this.appointmentEndTime = (appointmentStartTime / 100) * 100 + 100 + endMin % 60;
		} else {
			this.appointmentEndTime = appointmentStartTime + appointmentLength + 20;
		}
	}

	public Appointment(String String, int length, Long clientId2, long caregiverid2, String string,
			Long clientScheduleId) {
	}

	public int getAppointmentStartTime() {
		return appointmentStartTime;
	}

	public void setAppointmentStartTime(int appointmentStartTime) {
		this.appointmentStartTime = appointmentStartTime;

		int endMin = (appointmentStartTime + this.appointmentLength + 20) % 100;
		if (endMin >= 60) {
			this.appointmentEndTime = (appointmentStartTime / 100) * 100 + 100 + endMin % 60;
		} else {
			this.appointmentEndTime = appointmentStartTime + this.appointmentLength + 20;
		}
	}

	public int getAppointmentEndTime() {
		return appointmentEndTime;
	}

	public Long getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(Long appointmentId) {
		this.appointmentId = appointmentId;
	}

	public String getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getAppointmentFrequency() {
		return appointmentFrequency;
	}

	public void setAppointmentFrequency(String appointmentFrequency) {
		this.appointmentFrequency = appointmentFrequency;
	}

	public int getAppointmentLength() {
		return appointmentLength;
	}

	public void setAppointmentLength(int appointmentLength) {
		this.appointmentLength = appointmentLength;

		int endMin = (this.appointmentStartTime + appointmentLength + 20) % 100;
		if (endMin >= 60) {
			this.appointmentEndTime = (this.appointmentStartTime / 100) * 100 + 100 + endMin % 60;
		} else {
			this.appointmentEndTime = this.appointmentStartTime + appointmentLength + 20;
		}
	}

	public String getAppointmentDuration() {
		return appointmentDuration;
	}

	public void setAppointmentDuration(String appointmentDuration) {
		this.appointmentDuration = appointmentDuration;
	}

	public Long getClientID() {
		return clientID;
	}

	public void setClientID(Long clientID) {
		this.clientID = clientID;
	}

	public Long getCaregiverID() {
		return caregiverID;
	}

	public void setCaregiverID(Long caregiverID) {
		this.caregiverID = caregiverID;
	}

	public long getManagerID() {
		return managerID;
	}

	public void setManagerID(Long managerID) {
		this.managerID = managerID;
	}

	public String getIsConfirmed() {
		return isConfirmed;
	}

	public void setIsConfirmed(String isConfirmed) {
		this.isConfirmed = isConfirmed;
	}

	public Long getScheduleID() {
		return scheduleID;
	}

	public void setScheduleID(Long scheduleID) {
		this.scheduleID = scheduleID;
	}

	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", appointmentDate=" + appointmentDate
				+ ", appointmentFrequency=" + appointmentFrequency + ", appointmentLength=" + appointmentLength
				+ ", appointmentDuration=" + appointmentDuration + ", clientID=" + clientID + ", caregiverID="
				+ caregiverID + ", managerID=" + managerID + ", isConfirmed=" + isConfirmed + ", scheduleID="
				+ scheduleID + "]";
	}

}