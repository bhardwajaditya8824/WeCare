package com.springboot.wecare.service;

import javax.validation.Valid;

import com.springboot.wecare.model.Address;
import com.springboot.wecare.model.Login;

public interface ILoginService {

	long addLogin(@Valid Login login);

	Login getLoginDetails(Long loginId);

	String deleteLogin(Long loginId);

	String updateLoginDetails(@Valid Login login);

	long validateLogin(Login login);

	String lockUser(String string);

	String unlockUser(Long loginId);

	long addaddress(@Valid Address address);

	String validateUsername(@Valid Login login);

	long getClientId(Long loginId);

	String checkedLocked( String username);

	long getCaregiverId( Long loginId);

}
