package com.example.demo.service;

import com.example.demo.entity.Enrollment;
import java.util.List;

public interface EnrollmentService {
    Enrollment enrollStudent(Long studentId, Long courseId);
    Enrollment getEnrollmentById(Long id);
    List<Enrollment> getAllEnrollments();
    List<Enrollment> getEnrollmentsByStudent(Long studentId);
    List<Enrollment> getEnrollmentsByCourse(Long courseId);
    void cancelEnrollment(Long id);
}