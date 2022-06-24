package com.example.demo2.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/students")
public class StudentController {
private  final StudentService studentService;

@Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

@GetMapping
    public List<Student> getStudent(){
        return studentService.getStudents();
    }
    @PostMapping
    public void RegisterNewStudent(@RequestBody Student student){

     studentService.addNewStudent(student);

    }
    @DeleteMapping({"studentId"})
    public void  DeleteStudent(@PathVariable("studentId") Long studentId){

    studentService.deleteStudent(studentId);

    }

}
