package com.example.sb.client;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.sb.client.business.ClientService;
import com.example.sb.client.entities.Client;

@SpringBootApplication
public class SbJpaCLientsApplication {
	

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(SbJpaCLientsApplication.class, args);
		
		ClientService clientService =ctx.getBean(ClientService.class);
		
		Collection<String> clients = Arrays.asList("SwissLife","Spencer","AB Moteurs","ADDIDAS", "AREVA", "Coca Cola",
				"M6 Publicité","Publicis","JC Decaux","Société Générale","BNP Paribas");
		//store clients in DB
		clients.stream().forEach(p->clientService.add(new Client(p)));
		
		//print all clients
		System.out.println("[main]=============================================");
		clientService.getAll().stream().forEach(c->System.out.println(c));
	}
}
