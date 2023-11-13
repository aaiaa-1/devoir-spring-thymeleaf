package com.example.devoir.controllers;

import com.example.devoir.entities.Client;
import com.example.devoir.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //makes this class to serve rest endpoints
@RequestMapping(path = "api/v1/client")
public class ClientController {
    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping
    public void addClient (@RequestBody Client client){
        clientService.saveClient(client);
    }
}
