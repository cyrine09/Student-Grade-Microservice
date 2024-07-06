package com.example.service;

import com.example.entity.Grade;

import java.util.List;
import java.util.Optional;

public interface IGradeService {
    List<Grade> getAllGrades();
    Optional<Grade> getGradeById(String id);
    List<Grade> getGradesByStudentId(String studentId);
    Grade createGrade(Grade grade);
    void deleteGrade(String id);
}

