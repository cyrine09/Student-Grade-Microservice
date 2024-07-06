package com.example.controllers;
import com.example.entity.Grade;
import com.example.repositories.GradeRepository;
import com.example.service.StudentClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grades")
public class GradeController {

    @Autowired
    private GradeRepository gradeRepository;

    @Autowired
    private StudentClient studentClient;

    @PostMapping("/")
    public Grade addGrade(@RequestBody Grade grade) {
        return gradeRepository.save(grade);
    }

    @GetMapping("/{id}")
    public Grade getGradeById(@PathVariable String id) {
        return gradeRepository.findById(id).orElse(null);
    }

    @GetMapping("/student/{studentId}")
    public List<Grade> getGradesByStudentId(@PathVariable String studentId) {
        return gradeRepository.findByStudentId(studentId);
    }

    /*@GetMapping("/student/{studentId}/details")
    public StudentDTO getStudentDetails(@PathVariable String studentId) {
        return studentClient.getStudentById(Long.parseLong(studentId));
    }*/
}
