package com.github.cultivateweb.clients.repository;

import com.github.cultivateweb.clients.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClientRepository extends CrudRepository<Client, Long> {

}
