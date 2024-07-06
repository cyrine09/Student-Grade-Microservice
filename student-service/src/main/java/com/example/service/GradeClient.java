package com.example.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "grade-service/GradeDTO")
public interface GradeClient {

   /* @GetMapping("/grades/student/{studentId}")
    List<GradeDTO> getGradesByStudentId(@PathVariable("studentId") String studentId);*/
}

