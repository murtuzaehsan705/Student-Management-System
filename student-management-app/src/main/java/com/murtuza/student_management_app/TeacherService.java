package com.murtuza.student_management_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    TeacherRepository teacherRepository;

    public String addTeacher(Teacher teacher) {
        TeacherRepository.addTeacher(teacher);
        return "Teacher added successfully";
    }

    public Teacher getTeacherByName(String name) {
        return TeacherRepository.getTeacherByName(name);

    }
    public void deleteTeacherByName(String teacherName){
        TeacherRepository.deleteTeacherByName(teacherName);
    }
    public void addStudentTeacherPair(Integer studentID, Integer teacherID){
        TeacherRepository.addStudentTeacherPair(studentID,teacherID);

    }

    public List<String> getStudentsByTeacherID(Integer teacherID) {
        return TeacherRepository.getStudentsByTeacherID(teacherID);
    }
}
