package com.sebaare.veterinaryclinic.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PetOwnerDTO {
    
    private String petName;
    private String species;
    private String breed;
    private String ownerFirstName;
    private String ownerLastName;

    public PetOwnerDTO() {
    }

    public PetOwnerDTO(String petName, String species, String breed, String ownerFirstName, String ownerLastName) {
        this.petName = petName;
        this.species = species;
        this.breed = breed;
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
    }

}
