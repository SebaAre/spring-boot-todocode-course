package com.sebaare.programmingstudent.repository;

import com.sebaare.programmingstudent.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends JpaRepository<Topic,Long> {
    
    
    
}
