package com.example.mapper;


import com.example.dto.StudentDTO;
import com.example.entity.Student;

public class StudentMapper {

    public static StudentDTO mapToDto(Student student) {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(student.getId());
        studentDTO.setEmail(student.getEmail());
        // Map more fields as needed
        return studentDTO;
    }

    public static Student mapToEntity(StudentDTO studentDTO) {
        Student student = new Student();
        student.setId(studentDTO.getId());
        student.setEmail(studentDTO.getEmail());
        // Map more fields as needed
        return student;
    }
}
