package com.murtuza.student_management_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.murtuza.student_management_app.StudentRepository.studentDB;

@Repository
public class TeacherRepository {

    @Autowired
    static Map<Integer, Teacher> teacherDB = new HashMap<>();

      static Map<Integer, List<Integer>> teacherStudentDB = new HashMap<>();

    public static void addTeacher(Teacher teacher) {
        teacherDB.put(teacher.getId(), teacher);
    }

    public static Teacher getTeacherByName(String name) {
        for(Integer teacherId: teacherDB.keySet()){
            if(teacherDB.get(teacherId).getName().equals(name)){
                return teacherDB.get(teacherId);
            }
        }
        return null;
    }

    public static void deleteTeacherByName(String teacherName){

        int teacherID  = -1;
        for(Integer id: teacherDB.keySet()){
            if(teacherDB.get(id).getName().equals(teacherName)){
                teacherID = id;
                break;
            }
        }
        if(teacherID!=-1){
            teacherDB.remove(teacherID);
            teacherStudentDB.remove(teacherID);
        }
    }

    public static void addStudentTeacherPair(Integer studentID, Integer teacherID) {
        if(teacherDB.containsKey(teacherID)){
            if(!teacherStudentDB.containsKey(teacherID)){
                teacherStudentDB.put(teacherID, new ArrayList<>());
            }
            teacherStudentDB.get(teacherID).add(studentID);
        }
    }

    public static List<String> getStudentsByTeacherID(Integer teacherID) {
        List<Integer> studentsID = teacherStudentDB.get(teacherID);
        List<String> students = new ArrayList<>();
        if(studentsID!=null){
        for(int studentID: studentsID) {
            students.add(studentDB.get(studentID).getName());
        }
        }
         return students;

    }
}
