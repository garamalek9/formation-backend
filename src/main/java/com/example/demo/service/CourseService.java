package com.example.demo.service;
 
import com.example.demo.entity.Course;
import java.util.List;
 
public interface CourseService {
    List<Course> getAllCourses();
    Course getCourseById(Long id);
    Course createCourse(Course course);
    Course updateCourse(Long id, Course course);
    void deleteCourse(Long id);
}