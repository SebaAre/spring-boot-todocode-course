package com.sebaare.veterinaryclinic.repository;

import com.sebaare.veterinaryclinic.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository <Owner, Long>{
    
    
    
}
