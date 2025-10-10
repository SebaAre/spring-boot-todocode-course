package com.sebaare.veterinaryclinic.service;

import com.sebaare.veterinaryclinic.model.Owner;
import java.util.List;


public interface OwnerService {
    
     //Get all the owners
    public List <Owner> getOwners();
    
    //Create an owner
    public void createOwner(Owner owner);
    
    //Delete an owner
    public void deleteOwner(Long id);
    
    //Find one owner
    public Owner findOwner (Long id);
    
    //Edit owner details
    public void editOwner (Owner owner);
    
}
