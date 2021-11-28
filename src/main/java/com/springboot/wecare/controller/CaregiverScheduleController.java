package com.springboot.wecare.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.wecare.model.Caregiver;
import com.springboot.wecare.model.CaregiverSchedule;
import com.springboot.wecare.service.ICaregiverScheduleService;


@RestController
public class CaregiverScheduleController {

	@Autowired
	ICaregiverScheduleService caregiverScheduleService;

	@GetMapping("/allCgSchedules")
	public List<CaregiverSchedule> getAllBuyer() {
		System.out.println("Fetching all employee schedules..");
		return caregiverScheduleService.getAllEmployeeSchedules();
	}
	
	@GetMapping("/Schedule for specific caregiver")
	public List<CaregiverSchedule> getSchbyCgId(int cgId) {
		System.out.println("Fetching employee schedule for caregiver id "+cgId);
		return caregiverScheduleService.getEmployeeSchedule(cgId);
	}


	@CrossOrigin
	@PostMapping("/addShift")
	public String addShift(@RequestBody @Valid CaregiverSchedule cgSch) {
		return caregiverScheduleService.addShift(cgSch);
	}

	@CrossOrigin
	@PutMapping("/view all available caregivers for given time")
	public List<Caregiver> viewCgbyTime(@RequestParam @Valid String date, int startTime, int endTime) {
		return caregiverScheduleService.findAvailableFor(date, startTime, endTime);
	}
	
	
	@CrossOrigin
	@DeleteMapping("/deleteShift")
	public String deleteShift(@RequestParam @Valid int cgSchId) {
		String response = caregiverScheduleService.removeShift(cgSchId);
		return response;
	}

}
