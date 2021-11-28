package com.springboot.wecare.service;

import java.util.List;

import javax.validation.Valid;

import com.springboot.wecare.model.Client;


public interface IClientService {

	public List<Client> getAll();
	public String register(Client client) ;
	public Client viewProfileInfo(long cliId);
	public String updateProfileInfo(long cliId, Object[] fieldsToUpd) ;
	public String removeClient(long cliId);
	public String updateClient(@Valid  Client client);

}
