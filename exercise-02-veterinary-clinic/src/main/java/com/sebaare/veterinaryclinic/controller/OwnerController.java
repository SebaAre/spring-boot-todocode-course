package com.sebaare.veterinaryclinic.controller;

import com.sebaare.veterinaryclinic.model.Owner;
import com.sebaare.veterinaryclinic.service.OwnerService;
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
public class OwnerController {
    
    @Autowired
    private OwnerService ownerService;
    
    @GetMapping ("/owner/get")
    public List<Owner> getOwners() {
        return ownerService.getOwners();
    }
    
    @PostMapping("/owner/create")
    public String createOwner (@RequestBody Owner owner){
        ownerService.createOwner(owner);
        
        return "The owner was created successfully";
    }
    
    @DeleteMapping ("/owner/delete/{id}")
    public String deleteOwner (@PathVariable Long id) {
        ownerService.deleteOwner(id);
        return "The owner was deleted successfully";
    }
    
    @PutMapping ("/owner/edit")
    public Owner editOwner (@RequestBody Owner owner){
        ownerService.editOwner(owner);
        return ownerService.findOwner(owner.getId());
    }
    
    
}
