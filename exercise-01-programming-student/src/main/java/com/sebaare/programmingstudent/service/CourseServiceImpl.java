package com.sebaare.programmingstudent.service;

import com.sebaare.programmingstudent.dto.CourseTopicDTO;
import com.sebaare.programmingstudent.model.Course;
import com.sebaare.programmingstudent.repository.CourseRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseRepository courseRepository;
    
    @Override
    public List<Course> getCourses() {
        return courseRepository.findAll();
    }

    @Override
    public void saveCourse(Course course) {
        courseRepository.save(course);
    }

    @Override
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }

    @Override
    public Course findCourse(Long id) {
        return courseRepository.findById(id).orElse(null);
    }

    @Override
    public void editCourse(Course course) {
        this.saveCourse(course);
    }

    @Override
    public CourseTopicDTO getTopicsByCourse(Long idCourse) {

        CourseTopicDTO courseTopicDTO = new CourseTopicDTO ();
        Course course = this.findCourse(idCourse);
        courseTopicDTO.setCourseName(course.getName());
        courseTopicDTO.setTopics(course.getTopics());
        
        return courseTopicDTO;
        
    }

    @Override
    public List<Course> getCoursesJava() {

        String word = "Java";
        String compareText;
        
        List<Course> listCourses = this.getCourses();
        List<Course> listCoursesJava = new ArrayList<Course>();
        
        for (Course course : listCourses) {
         
            compareText = course.getName();
            boolean containsJava = compareText.contains(word);
            if (containsJava == true) {
                listCoursesJava.add(course);
            }
            
        }
        
        return listCoursesJava;
    }
    
}
