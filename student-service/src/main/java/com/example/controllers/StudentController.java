package com.example.controllers;
import com.example.entity.Student;
import com.example.repositories.StudentRepository;
import com.example.service.GradeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private GradeClient gradeClient;

    @PostMapping("/")
    public Student addStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentRepository.findById(id).orElse(null);
    }

/*   @GetMapping("/{id}/grades")
    public List<GradeDTO> getStudentGrades(@PathVariable Long id) {
        Student student = studentRepository.findById(id).orElse(null);
        if (student != null) {
            return gradeClient.getGradesByStudentId(student.getId().toString());
        }
        return null;
    }*/
}
