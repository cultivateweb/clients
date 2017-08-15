package com.github.cultivateweb.clients.controllers;

import com.github.cultivateweb.clients.services.ClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientsController {

    @Autowired
    ClientsService clients;

    @RequestMapping("/clients")
    public List<Client> find() {
        return clients.find();
    }

    @RequestMapping(path = "/clients", method = RequestMethod.POST)
    public void add(@RequestBody Client client) {
        clients.add(client);
    }

    @RequestMapping(path = "/clients/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable int id) {
        clients.delete(id);
    }

    @RequestMapping(path = "/clients", method = RequestMethod.PUT)
    public void update(@RequestBody Client client) {
        clients.update(client);
    }

}
