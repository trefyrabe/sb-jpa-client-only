package com.example.sb.client.daos;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.sb.client.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{
	@Query("select c from Client c where c.name like %:crit%")
	Collection<Client> filterBy(@Param("crit") String criteria);
}
