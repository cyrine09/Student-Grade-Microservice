package com.example.dto;


public class GradeDTO {
    private Long id;
    private String studentId;
    private String subject;
    private int score;

    // Constructors, getters, and setters

    public GradeDTO(Long  id, String studentId, String subject, int score) {
        this.id = id;
        this.studentId = studentId;
        this.subject = subject;
        this.score = score;
    }

    public GradeDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

