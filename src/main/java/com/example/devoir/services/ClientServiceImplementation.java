package com.example.devoir.services;

import com.example.devoir.entities.Client;
import com.example.devoir.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImplementation implements ClientService{
    private final ClientRepository clientRepository;

    @Autowired
    public ClientServiceImplementation(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client saveClient(Client c) {
        return clientRepository.save(c);
    }
    @Override
    public List<Client> listClients() {
        return clientRepository.findAll();
    }
}
