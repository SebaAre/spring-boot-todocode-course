package com.sebaare.programmingstudent.controller;

import com.sebaare.programmingstudent.dto.CourseTopicDTO;
import com.sebaare.programmingstudent.model.Course;
import com.sebaare.programmingstudent.service.CourseService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    
    @Autowired
    private CourseService courseService;
    
    //Create a new course
    @PostMapping("/courses/create")
    public String createCourse(@RequestBody Course course){
        courseService.saveCourse(course);
        
        return "Course created successfully";
    }
    
    //Get all courses
    @GetMapping("/courses/get")
    public List<Course> getCourses(){
        return courseService.getCourses();
    }
    
    //Get all topics of one course
    @GetMapping("/courses/topic/{idCourse}")
    public CourseTopicDTO topicsByCourse (@PathVariable Long idCourse){
        return courseService.getTopicsByCourse(idCourse);
    }
    
    //Get all the courses that contains the word "Java"
    @GetMapping("/courses/java")
    public List<Course> getCoursesJava (){
        return courseService.getCoursesJava();
    }
    
    //Modifie the data in a course
    @PutMapping("/course/edit")
    public String editCourse(@RequestBody Course course){
        courseService.editCourse(course);
        return "Course edited successfully";
    }
    
}
