package com.example.sb.client;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import com.example.sb.client.business.ClientService;
import com.example.sb.client.entities.Client;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SbJpaComptesApplicationTests {
	@Autowired
	ClientService clientService;
	
	@Before
	public void contextLoads() {
		clientService.add(new Client("SwissLife"));
		clientService.add(new Client("Spencer"));
		clientService.add(new Client("AB Moteurs"));
		clientService.add(new Client("EuroTunnel"));
		clientService.add(new Client("HSBC Bank"));
		clientService.add(new Client("Test"));
	}
	
	@Test
	public void testGetAll() {
		Collection<Client> clients= clientService.getAll();
		Assert.notEmpty(clients);
		Assert.isTrue(clients.stream().filter(p->p.getName().equalsIgnoreCase("Spencer")).count()>0);
		Assert.isTrue(clients.stream().filter(p->p.getName().equalsIgnoreCase("Test")).count()>0);	
		System.out.println("[testGetAll]=============================================");
		clients.stream().forEach(c->System.out.println(c));	
	}

	@Test
	public void testFilterBy() {
		Collection<Client> clients = clientService.filterBy("HSBC");
		Assert.notEmpty(clients);
		Assert.isTrue(clients.size() > 0);
		System.out.println("[testFilterBy]=============================================");
		clients.stream().forEach(c -> System.out.println(c));
		clients = clientService.filterBy("Moteur");
		Assert.isTrue(clients.size() > 0);
		clients.stream().forEach(c -> System.out.println(c));
	}

}
