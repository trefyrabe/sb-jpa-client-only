package com.example.sb.client.business;

import java.util.Collection;

import com.example.sb.client.entities.Client;

public interface ClientService {

	public Client get(Long id);
	public Client add(Client c);
	public Collection<Client> getAll();
	public Collection<Client> filterBy(String criteria);
}
