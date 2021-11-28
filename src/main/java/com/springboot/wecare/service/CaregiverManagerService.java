package com.springboot.wecare.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.wecare.model.CaregiverManager;
import com.springboot.wecare.repository.CaregiverManagerRepository;

@Service
public class CaregiverManagerService implements ICaregiverManagerService {

	@Autowired
	CaregiverManagerRepository caregiverManagerRepository;

	@Override
	@Transactional
	public List<CaregiverManager> getManagers() {

		List<CaregiverManager> managerList;
		try {
			managerList = caregiverManagerRepository.findAll();
		} catch (Exception e) {
			return null;
		}

		return managerList;
	}

	@Transactional
	@Override
	public String queryResponse(@Valid String response) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public CaregiverManager getManagerById(@Valid long managerId) {
		CaregiverManager manager = new CaregiverManager();
		try {
			Optional<CaregiverManager> searchRecord = caregiverManagerRepository.findById(managerId);
			manager = searchRecord.get();
		} catch (Exception e) {
			manager = null;
			return manager;
		}

		return manager;
	}

	@Transactional
	@Override
	public String addManager(@Valid CaregiverManager manager) {
		try {
			caregiverManagerRepository.save(manager);
		} catch (Exception e) {
			return e.getMessage();
		}
		return "manager added";
	}

	@Transactional
	@Override
	public String deleteManager(@Valid long managerId) {
		try {
			caregiverManagerRepository.deleteById(managerId);
		} catch (Exception e) {
			return e.getMessage();
		}

		return ("manager deleted");
	}

	@Transactional
	@Override
	public String updateManager(@Valid CaregiverManager manager) {
		Optional<CaregiverManager> searchRecord = caregiverManagerRepository.findById(manager.getCaregiverManagerId());

		if (searchRecord.isPresent()) {
			try {

				CaregiverManager updateManager = searchRecord.get();

				updateManager.setCaregiverManagerContactNo(manager.getCaregiverManagerContactNo());
				updateManager.setAddressId(manager.getAddressId());
				updateManager.setCaregiverManagerDob(manager.getCaregiverManagerDob());
				updateManager.setCaregiverManagerEmail(manager.getCaregiverManagerEmail());
				updateManager.setCaregiverManagerName(manager.getCaregiverManagerName());
				updateManager.setLoginId(manager.getLoginId());

				caregiverManagerRepository.save(updateManager);

			} catch (Exception e) {
				return e.getMessage();
			}
		} else {
			return "Manager Doesn't Exist";
		}
		return "Manager Updated";
	}

}
