package com.murtuza.student_management_app;

public class Teacher {

    private int id;

    private String name;

    private int age;

    private String email;

    private String mobNo;

    private int numberOfStudents;

    public Teacher() {
    }

    public Teacher(int id, String name, int age, String email, String mobNo, int numberOfStudents) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.mobNo = mobNo;
        this.numberOfStudents = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
}
