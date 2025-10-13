package com.sebaare.shop.controller;

import com.sebaare.shop.model.Client;
import com.sebaare.shop.service.ClientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class ClientController {
    
    @Autowired
    private ClientService clientService;
    
    //CREATE
    @PostMapping("/create")
    public Client createClient (@RequestBody Client client){
        return clientService.createClient(client);
    }
    
    //READ (get all clients)
    @GetMapping
    public List<Client> getClients() {
        return clientService.getClients();
    }
    
    //READ (get one client)
    @GetMapping("/{clientId}")
    public Client getClient(@PathVariable Long clientId){
        return clientService.getClient(clientId);
    }
    
    //UPDATE
    @PutMapping("/edit/{clientId}")
    public Client editClient(@PathVariable Long clientId,
                             @RequestBody Client client) {
        client.setClientId(clientId);
        return clientService.editClient(client);
        
    }
    
    //DELETE
    @DeleteMapping("/delete/{clientId}")
    public String deleteClient(@PathVariable Long clientId) {
        clientService.deleteClient(clientId);
        return "Client deleted successfully";
    }

}
