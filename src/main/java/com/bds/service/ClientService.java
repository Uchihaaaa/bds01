package com.bds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bds.dao.IClient;
import com.bds.entity.Client;

@Service
public class ClientService {
	
	@Autowired
	private IClient clientDAO;
	
	public Client add(Client client) {
		return clientDAO.save(client);
	}
	
	public void delete(int id) {
		clientDAO.deleteById(id);
	}
	
	public List<Client> getAll() {
		return clientDAO.findAll();
	}
	
	public Client getOne(int id) {
		return clientDAO.getOne(id);
	}

}
