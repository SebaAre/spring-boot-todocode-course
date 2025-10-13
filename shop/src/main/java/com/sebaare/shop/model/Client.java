package com.sebaare.shop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Client {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;
    
    private String firstName;
    private String lastName;
    private String dni;

    public Client() {
    }

    public Client(Long clientId, String firstName, String lastName, String dni) {
        this.clientId = clientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dni = dni;
    }
    
}
