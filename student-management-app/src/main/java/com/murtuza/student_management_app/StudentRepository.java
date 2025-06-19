package com.murtuza.student_management_app;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentRepository {

    static Map<Integer, Student> studentDB = new HashMap<>();

    public static Student getStudent(int admnNo){
        return studentDB.get(admnNo);
    }

    public static Student getStudentByPath(int admnNo){
        return studentDB.get(admnNo);
    }

    public static void  addStudent(Student student) {
        studentDB.put(Student.getAdmnNo(),student);
    }

    public static List<String> getAllStudents() {
        List<String> students = new ArrayList<>();
        for(Integer id: studentDB.keySet()){
            students.add(studentDB.get(id).getName());
        }
        return students;
    }
}
