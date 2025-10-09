package com.sebaare.programmingstudent.service;

import com.sebaare.programmingstudent.dto.CourseTopicDTO;
import com.sebaare.programmingstudent.model.Course;
import java.util.List;


public interface CourseService {
    
    public List<Course> getCourses();

    public void saveCourse(Course course);

    public void deleteCourse(Long id);

    public Course findCourse(Long id);

    public void editCourse(Course course);

    public CourseTopicDTO getTopicsByCourse(Long idCourse);

    public List<Course> getCoursesJava();
    
}
