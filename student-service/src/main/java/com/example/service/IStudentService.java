package com.example.service;

import com.example.entity.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService {
    List<Student> getAllStudents();
    Optional<Student> getStudentById(Long id);
    Student createStudent(Student student);
    void deleteStudent(Long id);
}