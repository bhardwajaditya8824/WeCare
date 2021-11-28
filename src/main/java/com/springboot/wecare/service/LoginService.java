package com.springboot.wecare.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.wecare.model.Address;
import com.springboot.wecare.model.Caregiver;
import com.springboot.wecare.model.Client;
import com.springboot.wecare.model.Login;
import com.springboot.wecare.repository.AddressRepository;
import com.springboot.wecare.repository.CaregiverRepository;
import com.springboot.wecare.repository.ClientRepository;
import com.springboot.wecare.repository.LoginRepository;

@Service
public class LoginService implements ILoginService {

	@Autowired
	LoginRepository loginRepository;
	
	@Autowired
	AddressRepository addressRepository;
	
	@Autowired
	ClientRepository clientRepository;
	
	@Autowired
	CaregiverRepository caregiverRepository;

	@Override
	@Transactional
	public long addLogin(@Valid Login login) {
		// TODO Auto-generated method stub
		
		Login savedlogin;
		try {
			login.setIsLocked("NO");
			savedlogin=loginRepository.save(login);

		} catch (Exception e) {
			return 0;
		}

		return savedlogin.getLoginId();
	}

	@Override
	@Transactional
	public Login getLoginDetails(Long loginId) {
		// TODO Auto-generated method stub
		Optional<Login> login;
		Login errorLogin = new Login();
		try {
			login = loginRepository.findByLoginId(loginId);

		} catch (Exception e) {
			return errorLogin;
		}

		return login.get();
	}

	@Override
	@Transactional
	public String deleteLogin(Long loginId) {
		try {

			Optional<Login> login = loginRepository.findByLoginId(loginId);

			loginRepository.delete(login.get());

		} catch (Exception e) {

			return e.getMessage();
		}

		return "User Deleted";
	}

	@Override
	@Transactional
	public String updateLoginDetails(@Valid Login login) {
		// TODO Auto-generated method stub
		Optional<Login> searchRecord = loginRepository.findByLoginId(login.getLoginId());

		if (searchRecord.isPresent()) {

			try {

				Login updateLogin = searchRecord.get();

				updateLogin.setUsername(login.getUsername());
				updateLogin.setPassword(login.getPassword());
				updateLogin.setIsLocked("NO");

				loginRepository.save(updateLogin);

			} catch (Exception e) {
				return e.getMessage();
			}

		} else {

			return "Record doesn't exist";

		}
		return "User Updated";

	}

	@Override
	@Transactional
	public long validateLogin(Login login) {
		Optional<Login> loginDetails;
		try {
			loginDetails = loginRepository.findByUsername(login.getUsername());
			String userName = loginDetails.get().getUsername();
			String password = loginDetails.get().getPassword();
			System.out.println(userName+"....."+password+"....."+login.getUsername()+login.getPassword());

			if (login.getUsername().equals(userName) && login.getPassword().equals(password)) {
				return loginDetails.get().getLoginId();
			}

		} catch (Exception e) {
			return 0;
		}

		return 0;
	}

	@Override
	@Transactional
	public String lockUser(String username) {
		// TODO Auto-generated method stub
		Optional<Login> searchRecord = loginRepository.findByUsername(username);

		if (searchRecord.isPresent()) {

			try {

				Login updateLogin = searchRecord.get();

				updateLogin.setIsLocked("YES");

				loginRepository.save(updateLogin);

			} catch (Exception e) {
				return e.getMessage();
			}

		} else {

			return "Record doesn't exist";

		}
		return "User login access locked";
	}

	@Override
	@Transactional
	public String unlockUser(Long loginId) {
		// TODO Auto-generated method stub
		Optional<Login> searchRecord = loginRepository.findByLoginId(loginId);

		if (searchRecord.isPresent()) {

			try {

				Login updateLogin = searchRecord.get();

				updateLogin.setIsLocked("NO");

				loginRepository.save(updateLogin);

			} catch (Exception e) {
				return e.getMessage();
			}

		} else {

			return "Record doesn't exist";

		}
		return "User login access Unlocked";

	}

	@Override
	@Transactional
	public long addaddress(@Valid Address address) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
		Address savedAddress;
				try {
					savedAddress = addressRepository.save(address);

				} catch (Exception e) {
					return 0;
				}

				return savedAddress.getAddressId();
	}

	@Override
	@Transactional
	public String validateUsername(@Valid Login login) {
		

		try {
			Optional<Login> searchRecord = loginRepository.findByUsername(login.getUsername());
		
		if (searchRecord.isPresent()) {

			return "username exists";

		} else {

			return "Success!";

		}
		}
		catch(Exception e)
		{
			return "error";
		}
		
		
	}

	@Override
	@Transactional
	public long getClientId(Long loginId) {
		System.out.println("**************************************++++++++++++++++++++++++");
		 
		Integer i = (int) (long) loginId;
		
		//Long i = new Long(loginId);
		Optional<Client> searchRecord = clientRepository.getByClientLoginId(i);

		

			Client client = searchRecord.get();
			
			return client.getClientId();

		
		
	}

	@Override
	@Transactional
	public String checkedLocked( String username) {
		
		try {
			Optional<Login> searchRecord = loginRepository.findByUsername(username);
			
			System.out.println("Inside Checked Locked*******************************************"+username);
		
		if (searchRecord.isPresent()) {

			if(searchRecord.get().getIsLocked().equals("YES"))
			{
				return "User is Locked";
			}
			else return "notlocked";
			
			

		} else {

			return "User Doesn't Exist";

		}
		}
		catch(Exception e)
		{
			return "error";
		}
	}

	@Override
	@Transactional
	public long getCaregiverId(Long loginId) {
		System.out.println("**************************************++++++++++++++++++++++++");
		 
		Integer i = (int) (long) loginId;
		
		//Long i = new Long(loginId);
		Optional<Caregiver> searchRecord = caregiverRepository.getByLoginId(i);

		

			Caregiver caregiver = searchRecord.get();
			
			return caregiver.getCaregiverid();
	}

}
