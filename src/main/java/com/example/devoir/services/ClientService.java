package com.example.devoir.services;

import com.example.devoir.entities.Client;

import java.util.List;

public interface ClientService {
    public Client saveClient(Client c);
    public List<Client> listClients();
}
