package com.sebaare.shop.service;

import com.sebaare.shop.model.Client;
import com.sebaare.shop.repository.ClientRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;
    
    @Override
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client getClient(Long clientId) {
        return clientRepository.findById(clientId).orElse(null);
    }

    @Override
    public void deleteClient(Long clientId) {
        clientRepository.deleteById(clientId);
    }

    @Override
    public Client editClient(Client client) {
       return clientRepository.save(client);
    }
    
    
    
}
