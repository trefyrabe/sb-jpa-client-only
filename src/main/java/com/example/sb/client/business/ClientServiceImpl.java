package com.example.sb.client.business;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.sb.client.daos.ClientRepository;
import com.example.sb.client.entities.Client;

@Service
public class ClientServiceImpl implements ClientService {

	@Resource
	private ClientRepository clientRepo;
	
	@Override
	public Client get(Long id) {
		return clientRepo.findOne(id);
	}

	@Override
	public Client add(Client c) {
		return clientRepo.save(c);
	}

	@Override
	public Collection<Client> getAll() {
		// TODO Auto-generated method stub
		return clientRepo.findAll();
	}

	@Override
	public Collection<Client> filterBy(String criteria) {
		return clientRepo.filterBy(criteria);
	}
}
