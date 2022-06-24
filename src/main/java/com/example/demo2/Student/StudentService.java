package com.example.demo2.Student;

import com.fasterxml.jackson.annotation.OptBoolean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
public final StudentRepository studentRepository;

@Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }


    public void addNewStudent(Student student) {
        Optional<Student>studentOptional = studentRepository
                .findStudentsByEmail(student.getEmail());

        if (studentOptional.isPresent()){
            throw new IllegalMonitorStateException("email is taken");
        }
        System.out.println(student);
    }
}
