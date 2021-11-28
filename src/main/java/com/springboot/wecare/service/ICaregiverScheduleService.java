package com.springboot.wecare.service;

import java.time.LocalDate;
import java.util.List;

import com.springboot.wecare.model.Appointment;
import com.springboot.wecare.model.Caregiver;
import com.springboot.wecare.model.CaregiverSchedule;

public interface ICaregiverScheduleService {
	public List<CaregiverSchedule> getAllEmployeeSchedules();
	public List<CaregiverSchedule> getEmployeeSchedule(long caregiverId);
	public List<Appointment> getAllAptFor(LocalDate date, long cgId);
	public List<Caregiver> findAvailableFor(String date, int startTime, int endTime);
    public String addShift(CaregiverSchedule cgSch);
	public String removeShift(long cgSchId);
}
