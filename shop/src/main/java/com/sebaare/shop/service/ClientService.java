package com.sebaare.shop.service;

import com.sebaare.shop.model.Client;
import java.util.List;


public interface ClientService {
    
    //CREATE
    public Client createClient(Client client);
    
    //READ (get all clients and get one specific client)
    public List<Client> getClients();
    
    public Client getClient(Long clientId);
    
    //UPDATE
    public Client editClient(Client client);
    
    //DELETE
    public void deleteClient(Long clientId);
    
    
    
    
}
