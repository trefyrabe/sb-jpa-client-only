package com.example.sb.client.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.sb.client.business.ClientService;
import com.example.sb.client.entities.Client;

@RestController
public class ClientController {
	@Autowired
	private ClientService clientService;
	
	@RequestMapping(value="/client/all",method=RequestMethod.GET)
	public Collection<Client> clients() {
		return clientService.getAll();
	}
	
	@RequestMapping(value="/client/{id}", method=RequestMethod.GET)
	public Client getById(@PathVariable("id") Long id){
		return clientService.get(id);
	}
	
	@RequestMapping(value="/client/create", method=RequestMethod.POST)
	public Client create(@RequestBody Client client){
		return clientService.add(client);
	}
}
