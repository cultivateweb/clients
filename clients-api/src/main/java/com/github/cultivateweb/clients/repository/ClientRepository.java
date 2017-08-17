package com.github.cultivateweb.clients.repository;

import com.github.cultivateweb.clients.Client;
//import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//@RepositoryRestResource
public interface ClientRepository /*extends JpaRepository<Client, Long> */{

    List<Client> findByLastNameStartsWithIgnoreCase(String lastName);

}
