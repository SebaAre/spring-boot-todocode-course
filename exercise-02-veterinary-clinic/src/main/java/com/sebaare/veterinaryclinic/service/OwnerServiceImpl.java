package com.sebaare.veterinaryclinic.service;

import com.sebaare.veterinaryclinic.model.Owner;
import com.sebaare.veterinaryclinic.repository.OwnerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OwnerServiceImpl implements OwnerService{

    @Autowired
    private OwnerRepository ownerRepository;
    
    @Override
    public List<Owner> getOwners() {
        return ownerRepository.findAll();
    }

    @Override
    public void createOwner(Owner owner) {
        ownerRepository.save(owner);
    }

    @Override
    public void deleteOwner(Long id) {
        ownerRepository.deleteById(id);
    }

    @Override
    public Owner findOwner(Long id) {
        return ownerRepository.findById(id).orElse(null);
    }

    @Override
    public void editOwner(Owner owner) {
        this.createOwner(owner);
    }
    
    
    
}
