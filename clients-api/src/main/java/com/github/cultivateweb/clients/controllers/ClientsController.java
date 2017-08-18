package com.github.cultivateweb.clients.controllers;

import com.github.cultivateweb.clients.Client;
import com.github.cultivateweb.clients.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientsController {

    private final ClientRepository clients;

    @Autowired
    public ClientsController(ClientRepository clients) {
        this.clients = clients;
    }

    @RequestMapping("/clients")
    public List<Client> find() {
        return clients.findAll();
    }

    @RequestMapping(path = "/clients", method = RequestMethod.POST)
    public void add(@RequestBody Client client) {
        clients.save(client);
    }

    @RequestMapping(path = "/clients/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable int id) {
        if (clients.exists(id)) {
            clients.delete(id);
        }
    }

    @RequestMapping(path = "/clients", method = RequestMethod.PUT)
    public void update(@RequestBody Client client) {
        Client cl = clients.findOne(
                client.getId()
        );
        if (cl != null) {
            cl.setFio(
                    client.getFio()
            );
            cl.setEmail(
                    client.getEmail()
            );
            cl.setPhone(
                    client.getPhone()
            );
            clients.save(cl);
        }
    }

}
