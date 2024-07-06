package com.example.service;

import com.example.entity.Grade;

import com.example.repositories.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IGradeServiceImpl implements IGradeService {

    @Autowired
    private GradeRepository gradeRepository;

    @Override
    public List<Grade> getAllGrades() {
        return gradeRepository.findAll();
    }

    @Override
    public Optional<Grade> getGradeById(String id) {
        return gradeRepository.findById(id);
    }

    @Override
    public List<Grade> getGradesByStudentId(String studentId) {
        return gradeRepository.findByStudentId(studentId);
    }

    @Override
    public Grade createGrade(Grade grade) {
        return gradeRepository.save(grade);
    }

    @Override
    public void deleteGrade(String id) {
        gradeRepository.deleteById(id);
    }
}
