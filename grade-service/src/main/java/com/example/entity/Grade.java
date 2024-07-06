package com.example.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "grade")
public class Grade {

    @Id
    private Long id;

    private String studentId;
    private String subject;
    private int score;

    // getters and setters


    public Grade() {
    }

    public Grade(Long id, String studentId, String subject, int score) {
        this.id = id;
        this.studentId = studentId;
        this.subject = subject;
        this.score = score;
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

