package com.murtuza.student_management_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public static Student getStudent(int admnNo){
        return StudentRepository.getStudent(admnNo);
    }

    public static Student getStudentByPath(int admnNo) {
        return StudentRepository.getStudentByPath(admnNo);
    }

    public static String addStudent(Student student){
        StudentRepository.addStudent(student);
        return "Student added successfully!!!!!";
    }

    public static List<String> getAllStudents() {
        return StudentRepository.getAllStudents();
    }
}