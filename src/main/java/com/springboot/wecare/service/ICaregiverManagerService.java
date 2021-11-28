package com.springboot.wecare.service;

import java.util.List;

import javax.validation.Valid;

import com.springboot.wecare.model.CaregiverManager;

public interface ICaregiverManagerService {

	List<CaregiverManager> getManagers();

	String queryResponse(@Valid String response);

	CaregiverManager getManagerById(@Valid long managerId);

	String addManager(@Valid CaregiverManager manager);

	String deleteManager(@Valid long managerId);

	String updateManager(@Valid CaregiverManager manager);

}
