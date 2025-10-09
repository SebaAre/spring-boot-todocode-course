package com.sebaare.programmingstudent.repository;

import com.sebaare.programmingstudent.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long>{
    
    
    
}
