package com.example.mapper;
import com.example.dto.GradeDTO;
import com.example.entity.Grade;

public class GradeMapper {

    public static GradeDTO mapToDto(Grade grade) {
        GradeDTO gradeDTO = new GradeDTO();
        gradeDTO.setId(grade.getId());
        gradeDTO.setStudentId(grade.getStudentId());
        gradeDTO.setSubject(grade.getSubject());
        gradeDTO.setScore(grade.getScore());
        // Map more fields as needed
        return gradeDTO;
    }

    public static Grade mapToEntity(GradeDTO gradeDTO) {
        Grade grade = new Grade();
        grade.setId(gradeDTO.getId());
        grade.setStudentId(gradeDTO.getStudentId());
        grade.setSubject(gradeDTO.getSubject());
        grade.setScore(gradeDTO.getScore());
        // Map more fields as needed
        return grade;
    }
}
