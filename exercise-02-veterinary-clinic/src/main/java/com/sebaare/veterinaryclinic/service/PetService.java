package com.sebaare.veterinaryclinic.service;

import com.sebaare.veterinaryclinic.dto.PetOwnerDTO;
import com.sebaare.veterinaryclinic.model.Pet;
import java.util.List;


public interface PetService {
    
    //Get all the pets
    public List <Pet> getPets();
    
    //Create a pet
    public void createPet(Pet pet);
            
    //Delete a pet
    public void deletePet(Long id);
    
    //Get one specific pet
    public Pet findPet(Long id);
    
    //Modifie the data of a pet
    public void editPet (Pet pet);
    
    //Get list of specie "dog" and breed "poodle"
    public List <Pet> getPoodles();
    
    //Get combined data of owner and pet
    public List <PetOwnerDTO> getPetOwners();
    
}
