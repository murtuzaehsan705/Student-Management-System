package com.murtuza.student_management_app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    TeacherService TeacherService;

    @PostMapping("/add")
    public ResponseEntity<String> addTeacher(@RequestBody Teacher teacher) {
        String message = TeacherService.addTeacher(teacher);
        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }

    @GetMapping("/get-teacher-by-name/{name}")
    public ResponseEntity<Teacher> getTeacherByName(@PathVariable("name") String name) {
        Teacher teacher = TeacherService.getTeacherByName(name);
        return new ResponseEntity<>(teacher, HttpStatus.FOUND);
    }

    @DeleteMapping("/delete-teacher-by-name")
    public ResponseEntity<String> deleteTeacherByName(@RequestParam("name") String teacherName) {
        TeacherService.deleteTeacherByName(teacherName);
        return new ResponseEntity<>("Teacher deleted successfully", HttpStatus.ACCEPTED);
    }

    @PutMapping("/add-student-teacher-pair")
    public ResponseEntity<String> addStudentTeacherPair(@RequestParam Integer studentID,
                                                        @RequestParam Integer teacherID) {
        TeacherService.addStudentTeacherPair(studentID, teacherID);
        return new ResponseEntity<>("Student Teacher pair added !!", HttpStatus.ACCEPTED);
    }

    @GetMapping("/get-students-by-teacher-id/{teacherID}")
    public ResponseEntity<List<String>> getStudentsByTeacherID(@PathVariable Integer teacherID){
        List<String> students  = TeacherService.getStudentsByTeacherID(teacherID);
        return new ResponseEntity<>(students, HttpStatus.FOUND);
    }
}
