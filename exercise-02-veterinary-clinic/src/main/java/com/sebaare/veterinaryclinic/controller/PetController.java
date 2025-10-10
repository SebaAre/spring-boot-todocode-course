package com.sebaare.veterinaryclinic.controller;

import com.sebaare.veterinaryclinic.dto.PetOwnerDTO;
import com.sebaare.veterinaryclinic.model.Pet;
import com.sebaare.veterinaryclinic.service.PetService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetController {
    
    @Autowired
    private PetService petService;
    
    @GetMapping("/pet/get")
    public List<Pet> getPets(){
        return petService.getPets();
    }
    
    @PostMapping("/pet/create")
    public String createPet (@RequestBody Pet pet){
        petService.createPet(pet);
        
        return "The pet was created successfully";
    }

    @DeleteMapping("/pet/delete/{id}")
    public String deletePet (@PathVariable Long id) {
        petService.deletePet(id);
        return "The pet was deleted successfully";
    }

    @PutMapping("/pet/edit")
    public String editPet (@RequestBody Pet pet){
        petService.editPet(pet);
        return "The pet was edited succesfully";
    }
    
    @GetMapping("/pet/get_poodles")
    public List<Pet> getPoodles(){
        return petService.getPoodles();
    }
    
    @GetMapping("/pet/get_owner")
    public List<PetOwnerDTO> getPetOwner() {
        return petService.getPetOwners();
    }


}
