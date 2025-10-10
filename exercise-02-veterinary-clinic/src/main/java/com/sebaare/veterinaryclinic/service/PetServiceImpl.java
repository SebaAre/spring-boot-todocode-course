package com.sebaare.veterinaryclinic.service;

import com.sebaare.veterinaryclinic.dto.PetOwnerDTO;
import com.sebaare.veterinaryclinic.model.Pet;
import com.sebaare.veterinaryclinic.repository.PetRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetServiceImpl implements PetService{
    
    @Autowired
    private PetRepository petRepository;

    @Override
    public List<Pet> getPets() {
        return petRepository.findAll();
    }

    @Override
    public void createPet(Pet pet) {
        petRepository.save(pet);
    }

    @Override
    public void deletePet(Long id) {
        petRepository.deleteById(id);
    }

    @Override
    public Pet findPet(Long id) {
        return petRepository.findById(id).orElse(null);
    }

    @Override
    public void editPet(Pet pet) {
        this.createPet(pet);
    }

    @Override
    public List<Pet> getPoodles() {
        
        List<Pet> allPets = this.getPets();
        List<Pet> poodleList = new ArrayList<>();
        
        for (Pet pet : allPets){
            if (pet.getSpecies().equalsIgnoreCase("dog")
               && pet.getBreed().equalsIgnoreCase("poodle")){
                poodleList.add(pet);
            }
        }
        return poodleList;
        
    }

    @Override
    public List<PetOwnerDTO> getPetOwners() {
        
        List<Pet> allPets = this.getPets();
        List<PetOwnerDTO> petOwnerList = new ArrayList<>();
        
        for (Pet pet : allPets){
            PetOwnerDTO petOwnerDTO = new PetOwnerDTO();
            
            petOwnerDTO.setPetName(pet.getName());
            petOwnerDTO.setSpecies(pet.getSpecies());
            petOwnerDTO.setBreed(pet.getBreed());
            petOwnerDTO.setOwnerFirstName(pet.getOwner().getFirstName());
            petOwnerDTO.setOwnerLastName(pet.getOwner().getLastName());
            
            petOwnerList.add(petOwnerDTO);
            
        }
        
        return petOwnerList;
        
    }
    
}
