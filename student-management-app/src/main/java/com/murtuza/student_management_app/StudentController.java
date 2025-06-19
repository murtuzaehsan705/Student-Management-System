package com.murtuza.student_management_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/get-student")
    public ResponseEntity getStudent(@RequestParam("id") int admnNo) {

        Student student = StudentService.getStudent(admnNo);
        return new ResponseEntity(student, HttpStatus.OK);
    }

        @GetMapping("/get-student-by-path/{id}")
        public ResponseEntity getStudentByPathVariable(@PathVariable("id") int admnNo){
            Student student = StudentService.getStudentByPath(admnNo);
            return new ResponseEntity(student,HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity addStudent(@RequestBody Student Student){
        String message =  StudentService.addStudent(Student);
        return new ResponseEntity(message,HttpStatus.CREATED);
    }

    @GetMapping("/get-all-students")
    public ResponseEntity<List<String>> getAllStudents(){
        List<String> students = StudentService.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.FOUND);
    }

}
