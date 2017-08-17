package com.github.cultivateweb.clients.services;

import com.github.cultivateweb.clients.Client;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClientsService {

    private final List<Client> clients;

    public ClientsService() {
        clients = new ArrayList<>();
    }

    public List<Client> find() {
        return clients;
    }

    public void add(Client client) {
        if (clients.stream().anyMatch(cl -> client.getId() == cl.getId())) {
            throw new RuntimeException("Client already at base!");
        }
        clients.add(client);
    }

    public void delete(int id) {
        clients.removeIf(client -> id == client.getId());
    }

    public void update(Client client) {
        clients.set(
            clients.indexOf(
                find(
                    client.getId()
                )
            ),
            client
        );
    }

    private Client find(int id) {
        Optional<Client> found =
            clients.stream()
                   .filter(client -> id == client.getId())
                   .findFirst();
        if (!found.isPresent()) {
            throw new RuntimeException("Client not found!");
        }
        return found.get();
    }

}
