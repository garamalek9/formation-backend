package com.example.demo.service;
 
import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import java.util.List;
 
@Service
public class CourseServiceImpl implements CourseService {
 
    @Autowired
    private CourseRepository courseRepository;
 
    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }
 
    @Override
    public Course getCourseById(Long id) {
        return courseRepository.findById(id).orElse(null);
    }
 
    @Override
    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }
 
    @Override
    public Course updateCourse(Long id, Course course) {
        course.setId(id);
        return courseRepository.save(course);
    }
 
    @Override
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
}