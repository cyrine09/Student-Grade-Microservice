package com.example.dto;

public class StudentDTO {
    private Long id;
   private String grade;
    private String email;

    // Constructors, getters, and setters

    public StudentDTO(Long id, String grade) {
        this.id = id;
        this.grade = grade;
        this.email=email;
    }

    public StudentDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
